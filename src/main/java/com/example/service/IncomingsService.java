package com.example.service;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Incomings;
import com.example.repositories.IncomingsRepository;

@Service
public class IncomingsService {
    
    @Autowired
    private IncomingsRepository incomingsRepository;
    
    public List<Incomings> getAllIncomings() {
        return incomingsRepository.findAll();
    }

    public Incomings saveIncomings(Incomings incomings) {
        return incomingsRepository.save(incomings);
    }

    public void deleteIncomingById(Long id) {
        incomingsRepository.deleteById(id);
    }

    public Incomings getIncomingById(Long id) {
        return incomingsRepository.findById(id).orElse(null);
    }

    public Incomings updateIncomingById(Long id, Incomings updatedIncoming) {
        Incomings existingIncoming = incomingsRepository.findById(id).orElse(null);
        if (existingIncoming != null) {
            existingIncoming.setIncName(updatedIncoming.getIncName());
            existingIncoming.setIncAmou(updatedIncoming.getIncAmou());
            existingIncoming.setIncDate(updatedIncoming.getIncDate());
            existingIncoming.setIncTith(updatedIncoming.isIncTith());
            existingIncoming.setIncCat(updatedIncoming.getIncCat());
    
            return incomingsRepository.save(existingIncoming);
        }
        return null;
    }

    public Double getTotalIncomings(){
        return incomingsRepository.getTotalIncomings();
    }

    public Map<String,Double> getTotalIncomingsByName(){
        List<Object[]> results = incomingsRepository.getTotalIncomingsByName();
        Map<String, Double> totalsMap = new LinkedHashMap<>();
        for (Object[] result : results) {
            String name = (String) result[0];
            Double total = (Double) result[1];
            totalsMap.put(name, total);
        }
        return totalsMap;
    }
}

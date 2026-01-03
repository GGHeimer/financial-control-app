package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Outgoings;
import com.example.repositories.OutgoingsRepository;

@Service
public class OutgoingsService {

    @Autowired
    private OutgoingsRepository outgoingsRepository;
    public List<Outgoings> getAllOutgoings() {
        return outgoingsRepository.findAll();
    }

    public Outgoings saveOutgoings(Outgoings outgoings) {
        return outgoingsRepository.save(outgoings);
    }

    public void deleteOutgoingById(Long id) {
        outgoingsRepository.deleteById(id);
    }

    public Outgoings getOutgoingById(Long id) {
        return outgoingsRepository.findById(id).orElse(null);
    }

    public Outgoings updateOutgoingById(Long id, Outgoings updatedOutgoing) {
        Outgoings existingOutgoing = outgoingsRepository.findById(id).orElse(null);
        if (existingOutgoing != null) {
            existingOutgoing.setOutName(updatedOutgoing.getOutName());
            existingOutgoing.setOutAmou(updatedOutgoing.getOutAmou());
            existingOutgoing.setOutDate(updatedOutgoing.getOutDate());
            existingOutgoing.setOutCat(updatedOutgoing.getOutCat());
    
            return outgoingsRepository.save(existingOutgoing);
        }
        return null;
    }
}

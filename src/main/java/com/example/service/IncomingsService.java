package com.example.service;

import com.example.model.Incomings;
import com.example.repositories.IncomingsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class IncomingsService {
    
    @Autowired
    private IncomingsRepository incomingsRepository;
    
    public List<Incomings> getAllIncomings() {
        return incomingsRepository.findAll();
    }

    public Incomings setIncomings(Incomings incomings) {
        return incomingsRepository.save(incomings);
    }
}

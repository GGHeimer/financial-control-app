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

    public Outgoings setOutgoings(Outgoings outgoings) {
        return outgoingsRepository.save(outgoings);
    }
}

package com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Outgoings;

@Repository
public interface OutgoingsRepository extends JpaRepository<Outgoings, Long> {
    
}

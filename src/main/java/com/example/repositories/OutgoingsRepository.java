package com.example.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.model.Outgoings;

@Repository
public interface OutgoingsRepository extends JpaRepository<Outgoings, Long> {
    @Override
    @Query("SELECT o FROM Outgoings o ORDER BY outStatus DESC,outDate")
    List<Outgoings> findAll();
    
    @Query("SELECT ROUND(SUM(o.outAmou),2) FROM Outgoings o WHERE o.outStatus = true")
    Double getTotalOutgoings();

    @Query("SELECT o.outName, ROUND(SUM(o.outAmou),2) FROM Outgoings o WHERE o.outStatus = true GROUP BY o.outName ORDER BY SUM(o.outAmou) DESC")
    List<Object[]> getTotalOutgoingsByName();
}

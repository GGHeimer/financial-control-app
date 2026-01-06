package com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.model.Incomings;

@Repository
public interface IncomingsRepository extends JpaRepository<Incomings, Long> {
    @Query("SELECT ROUND(SUM(i.incAmou),2) FROM Incomings i")
    Double getTotalIncomings();
}

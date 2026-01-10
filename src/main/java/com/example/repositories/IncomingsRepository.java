package com.example.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.model.Incomings;

@Repository
public interface IncomingsRepository extends JpaRepository<Incomings, Long> {
    @Query("SELECT ROUND(SUM(i.incAmou),2) FROM Incomings i WHERE i.incCat='salary'")
    Double getTotalIncomings();

    @Query("SELECT i.incName, SUM(i.incAmou) FROM Incomings i GROUP BY i.incName ORDER BY SUM(i.incAmou) DESC")
    List<Object[]> getTotalIncomingsByName();
}

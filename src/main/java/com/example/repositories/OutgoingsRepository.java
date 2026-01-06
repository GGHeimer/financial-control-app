package com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.model.Outgoings;

@Repository
public interface OutgoingsRepository extends JpaRepository<Outgoings, Long> {
    @Query("SELECT ROUND(SUM(o.outAmou),2) FROM Outgoings o WHERE o.outStatus = true")
    Double getTotalOutgoings();

    @Query("SELECT ROUND(SUM(o.outAmou),2) FROM Outgoings o WHERE o.outName = :name")
    Double getTotalByName(@Param("name") String name);
}

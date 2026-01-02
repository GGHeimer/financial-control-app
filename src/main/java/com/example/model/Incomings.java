package com.example.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "incomings")
public class Incomings {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long incId;
    
    @Column(name = "inc_name")
    private String incName;
    
    @Column(name = "inc_amou")
    private double incAmou;
    
    @Column(name = "inc_date")
    private LocalDate incDate;
    
    @Column(name = "inc_tith")
    private boolean incTith;
    
    @Column(name = "inc_cat")
    private String incCat;

    @Column(name = "user_id")
    private Long userId;

    // Default constructor
    public Incomings() {}
    
    public Incomings(Long incId, String incName, double incAmou, LocalDate incDate, boolean incTith, String incCat, Long userId) {
        this.incId = incId;
        this.incName = incName;
        this.incAmou = incAmou;
        this.incDate = incDate;
        this.incTith = incTith;
        this.incCat = incCat;
        this.userId = userId;
    }

    public Long getIncId() { return incId; }
    public void setIncId(Long incId) { this.incId = incId; }
    public Long getUserId() { return userId; }
    public void setUserId(Long userId) { this.userId = userId; }
    public String getIncName() { return incName; }
    public void setIncName(String incName) { this.incName = incName; }
    public double getIncAmou() { return incAmou; }
    public void setIncAmou(double incAmou) { this.incAmou = incAmou; }
    public LocalDate getIncDate() { return incDate; }
    public void setIncDate(LocalDate incDate) { this.incDate = incDate; }
    public boolean isIncTith() { return incTith; }
    public void setIncTith(boolean incTith) { this.incTith = incTith; }
    public String getIncCat() { return incCat; }
    public void setIncCat(String incCat) { this.incCat = incCat; }
}

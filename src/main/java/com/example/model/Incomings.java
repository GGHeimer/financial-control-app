package com.example.model;

import java.util.Date;
import jakarta.persistence.*;

@Entity
@Table(name = "incomings")
public class Incomings {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long idInc;
    @Column(name = "user_id")
    private Long idUser;
    @Column(name = "name")
    private String incName;
    @Column(name = "amount")
    private double incAmou;
    @Column(name = "date")
    private Date incDate;
    @Column(name = "tithe")
    private boolean incTith;
    @Column(name = "category")
    private String incCat;
    
    // Default constructor
    public Incomings() {}
    
    public Incomings(Long idInc, String incName, double incAmou, Date incDate, boolean incTith, String incCat) {
        this.idInc = idInc;
        this.incName = incName;
        this.incAmou = incAmou;
        this.incDate = incDate;
        this.incTith = incTith;
        this.incCat = incCat;
    }

    public Long getIdInc() { return idInc; }
    public void setIdInc(Long idInc) { this.idInc = idInc; }
    public Long getIdUser() { return idUser; }
    public void setIdUser(Long idUser) { this.idUser = idUser; }
    public String getIncName() { return incName; }
    public void setIncName(String incName) { this.incName = incName; }
    public double getIncAmou() { return incAmou; }
    public void setIncAmou(double incAmou) { this.incAmou = incAmou; }
    public Date getIncDate() { return incDate; }
    public void setIncDate(Date incDate) { this.incDate = incDate; }
    public boolean isIncTith() { return incTith; }
    public void setIncTith(boolean incTith) { this.incTith = incTith; }
    public String getIncCat() { return incCat; }
    public void setIncCat(String incCat) { this.incCat = incCat; }
}

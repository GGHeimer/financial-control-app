package com.example.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "outgoings")
public class Outgoings {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id_out")
    private Long outId;
    
    @Column (name = "id_user")
    private Long userId;
    
    @Column (name = "out_name")
    private String outName;
    @Column (name = "out_amou")
    private double outAmou;
    @Column (name = "out_due_date")
    private String outDueDate;
    @Column (name = "out_status")
    private int outStatUs;
    @Column (name = "out_cat")
    private String outCat;
    @Column (name = "out_date")
    private LocalDate outDate;
    
    // Default constructor
    public Outgoings() {}
    
    // Constructor
    public Outgoings(Long outId, Long userId, String outName, double outAmou, String outDueDate, int outStatUs,
                String outCat, LocalDate outDate) {
            this.outId = outId;
            this.userId = userId;
            this.outName = outName;
            this.outAmou = outAmou;
            this.outDueDate = outDueDate;
            this.outStatUs = outStatUs;
            this.outCat = outCat;
            this.outDate = outDate;
        }

    // Getters and Setters
    public Long getOutId() { return outId; }
    public void setoutId(Long outId) { this.outId = outId; }
    public Long getUserId() { return userId; }
    public void setUserId(Long userId) { this.userId = userId; }
    public String getOutName() { return outName; }
    public void setOutName(String outName) { this.outName = outName; }
    public double getOutAmou() { return outAmou; }
    public void setOutAmou(double outAmou) { this.outAmou = outAmou; }
    public String getOutDueDate() { return outDueDate; }
    public void setOutDueDate(String outDueDate) { this.outDueDate = outDueDate; }
    public int getOutStatUs() { return outStatUs; }
    public void setOutStatUs(int outStatUs) { this.outStatUs = outStatUs; }
    public String getOutCat() { return outCat; }
    public void setOutCat(String outCat) { this.outCat = outCat; }
    public LocalDate getOutDate() { return outDate; }
    public void setOutDate(LocalDate outDate) { this.outDate = outDate; }
}
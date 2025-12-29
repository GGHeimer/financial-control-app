package com.example.model;

import java.util.Date;
import jakarta.persistence.*;

@Entity
@Table(name = "outgoings")
public class Outgoings {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idOut;
    private Long idUser;
    private String outName;
    private double outAmou;
    private String outDueDate;
    private int outStatus;
    private String outCat;
    private Date outDate;
    
    // Default constructor
    public Outgoings() {}
    
    // Constructor
    public Outgoings(Long idOut, Long idUser, String outName, double outAmou, String outDueDate, int outStatus,
                String outCat, Date outDate) {
            this.idOut = idOut;
            this.idUser = idUser;
            this.outName = outName;
            this.outAmou = outAmou;
            this.outDueDate = outDueDate;
            this.outStatus = outStatus;
            this.outCat = outCat;
            this.outDate = outDate;
        }

    // Getters and Setters
    public Long getIdOut() { return idOut; }
    public void setIdOut(Long idOut) { this.idOut = idOut; }
    public Long getIdUser() { return idUser; }
    public void setIdUser(Long idUser) { this.idUser = idUser; }
    public String getOutName() { return outName; }
    public void setOutName(String outName) { this.outName = outName; }
    public double getOutAmou() { return outAmou; }
    public void setOutAmou(double outAmou) { this.outAmou = outAmou; }
    public String getOutDueDate() { return outDueDate; }
    public void setOutDueDate(String outDueDate) { this.outDueDate = outDueDate; }
    public int getOutStatus() { return outStatus; }
    public void setOutStatus(int outStatus) { this.outStatus = outStatus; }
    public String getOutCat() { return outCat; }
    public void setOutCat(String outCat) { this.outCat = outCat; }
    public Date getOutDate() { return outDate; }
    public void setOutDate(Date outDate) { this.outDate = outDate; }
}
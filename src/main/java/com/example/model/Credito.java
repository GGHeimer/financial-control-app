package com.example.model;

public class Credito {
    private Long idCred;
    private String nomCred;
    private double valCred;
    private boolean dizCred;
    
    public Credito(Long idCred, String nomCred, double valCred, boolean dizCred) {
        this.idCred = idCred;
        this.nomCred = nomCred;
        this.valCred = valCred;
        this.dizCred = dizCred;
    }

    public Long getIdCred() { return idCred; }
    public String getNomCred() { return nomCred; }
    public void setNomCred(String nomCred) { this.nomCred = nomCred; }
    public double getValCred() { return valCred; }
    public void setValCred(double valCred) { this.valCred = valCred; }
    public boolean isDizCred() { return dizCred; }
    public void setDizCred(boolean dizCred) { this.dizCred = dizCred; }
}

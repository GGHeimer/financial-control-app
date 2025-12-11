package com.example.model;

public class Debito {
    private int idDebito;
    private String nomDebito;
    private double valDebito;
    private String venDebito;
    private boolean estDebito;
    private String catDebito;
    
    
    // Construtor
    public Debito(int idDebito, String nomDebito, double valDebito, String venDebito, boolean estDebito,
                String catDebito) {
            this.idDebito = idDebito;
            this.nomDebito = nomDebito;
            this.valDebito = valDebito;
            this.venDebito = venDebito;
            this.estDebito = estDebito;
            this.catDebito = catDebito;
        }

    // Getters and Setters
    public int getIdDebito() { return idDebito; }
    public String getNomDebito() { return nomDebito; }
    public void setNomDebito(String nomDebito) { this.nomDebito = nomDebito; }
    public double getValDebito() { return valDebito; }
    public void setValDebito(double valDebito) { this.valDebito = valDebito; }
    public String getVenDebito() { return venDebito; }
    public void setVenDebito(String venDebito) { this.venDebito = venDebito; }
    public boolean isEstDebito() { return estDebito; }
    public void setEstDebito(boolean estDebito) { this.estDebito = estDebito; }
    public String getCatDebito() { return catDebito; }
    public void setCatDebito(String catDebito) { this.catDebito = catDebito; }
    
    
}
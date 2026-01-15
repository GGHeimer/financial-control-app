package com.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "user")
public class User {
    
    //Atributes
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUser;
    private String name;


    //Constructors
    public User (){}

    public User(Long idUser, String name) {
        this.idUser = idUser;
        this.name = name;
    }

    //Getters and Setters
    public Long getIdUser() { return idUser; }
    public void setIdUser(Long idUser) { this.idUser = idUser; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}

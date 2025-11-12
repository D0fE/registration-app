package com.example.registration_app.model;


import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String email;

    public Long getId(){return id;}
    public String getName(){return name;}
    public String getEmail(){return email;}

    public void setId(long id){ this.id = id;}
    public void setName(String name){ this.name = name;}
    public void setEmail(String email){ this.email = email;}


}

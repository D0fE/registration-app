package com.example.registration_app.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotEmpty(message = "Имя не должно быть пустым")
    @Size(min = 2, max = 50, message = "Имя должно быть от 2 до 50 символов")
    private String name;

    @NotEmpty(message = "Фамилия не может быть пустым")
    private String fullName;

    @NotEmpty(message = "Email не может быть пустым")
    private String email;

    @NotNull(message = "Возраст обязателен")
    private Integer age;

    @NotEmpty(message = "Телефон обязателен")
    private String phone;

    @Size(max = 500, message = "Описание не должно превышать 500 символов")
    private String description;



    public Long getId(){return id;}
    public String getName(){return name;}
    public String getEmail(){return email;}
    public String getFullName(){return fullName;}
    public Integer getAge(){return age;}
    public String getPhone(){return phone;}
    public String getDescription(){return description;}


    public void setId(long id){ this.id = id;}
    public void setName(String name){ this.name = name;}
    public void setEmail(String email){ this.email = email;}
    public void setFullName(String fullName){ this.fullName = fullName;}
    public void setAge(Integer age){ this.age = age;}
    public void setPhone(String phone){ this.phone = phone;}
    public void setDescription(String description){ this.description = description;}



}

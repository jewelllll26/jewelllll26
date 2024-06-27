package com.kandahar.kctech.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class User {

    @Id
    @GeneratedValue 
    private Long id;
    private String name;
    private String email;
    private String password;

    User(){}
    public User( String name, String email, String password){
       
        this.name = name;
        this.email = email;
        this.password = password;

    }

    //getters
    public Long getId(){
        return id;
    }
    public String getName(){
        return name;
    }

    public String getmail(){
        return email;
    }
    public String getpassword(){
        return password;
    }

    //setters
    
    
    public void setName ( String name){
        this.name = name;
    }
    public void setEmail ( String email){
        this.email = email;
    }
    public void setPassword (String password){
        this.password = password;
    }

}
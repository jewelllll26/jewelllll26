package com.kandahar.kctech.Model;

public class usermodel {
    
    private int id;
    private String name;
    private String email;
    private String password;

    public usermodel(int id, String name, String email, String password){
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        

    }

    //getters
    public int getId(){
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
    
    public void setId (int id){
        this.id = id;
    }
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
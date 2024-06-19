package com.kandahar.kctech.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kandahar.kctech.Model.usermodel;

@RestController
public class usercontroller{

    @GetMapping("/user")
    public usermodel getUser(){
    return new usermodel(1, "Jewel", "jcayaocatapang@gmail.com", "hahawala");
}


    
}

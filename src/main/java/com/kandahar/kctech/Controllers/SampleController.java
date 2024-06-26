package com.kandahar.kctech.Controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class SampleController {

//http://localhost:8080/hello-world
    @GetMapping("/hello-world")
    public String helloWorld(){
     return "Hello World";
    }
    
}

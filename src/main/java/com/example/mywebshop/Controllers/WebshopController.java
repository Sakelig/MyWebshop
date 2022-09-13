package com.example.mywebshop.Controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class WebshopController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello World!";
    }

    @GetMapping("/helloTeapot")
    @ResponseStatus(code = HttpStatus.I_AM_A_TEAPOT)
    public String helloTeapot(){
        return "I'm a teapot";
    }

    @GetMapping("/api/v1")
    @ResponseStatus(code = HttpStatus.OK)
    public HttpStatus isOk(){
        return HttpStatus.OK;
    }

    @GetMapping("/api/v1/items")
    public List<String> items(){
        List<String> items = Arrays.asList("wow", "1", "2", "3");
        return items;
    }


    @GetMapping("/api/v1/cart")
    public



}

package com.example.mywebshop.Controllers;

import com.example.mywebshop.Entities.Cart;
import com.example.mywebshop.Entities.Items;
import com.example.mywebshop.Services.CartService;
import com.example.mywebshop.Services.ItemDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class WebshopController {

    private final CartService cartService;

    @Autowired
    public WebshopController(CartService cartService) {
        this.cartService = cartService;
    }

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
    public List<Items> items(){
        //List<String> items = Arrays.asList("wow", "1", "2", "3");
        return cartService.getAllItems();
    }


    @GetMapping("/api/v1/cart")
    public List<Cart> carts(){
        return cartService.getAllCarts();
    }


    @PostMapping("/api/v1/items")
    public Items addItems(@RequestBody ItemDTO item){
        return cartService.addItems(item);
    }



}

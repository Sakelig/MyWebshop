package com.example.mywebshop.Services;

import com.example.mywebshop.Entities.Cart;
import com.example.mywebshop.Repositories.CartRepo;
import com.example.mywebshop.Repositories.ItemsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartService{

    private final CartRepo cartRepo;
    private final ItemsRepo itemsRepo;

    @Autowired
    public CartService(CartRepo cartRepo, ItemsRepo itemsRepo){
        this.cartRepo = cartRepo;
        this.itemsRepo = itemsRepo;
    }


    public List<Cart> getAllCarts(){
        return cartRepo.findAll();
    }



}

package com.example.mywebshop.Repos;

import com.example.mywebshop.Entities.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepo extends JpaRepository<Cart, Long> {
}

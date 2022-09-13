package com.example.mywebshop.Repos;

import com.example.mywebshop.Entities.Items;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemsRepo extends JpaRepository<Items, Long> {
}

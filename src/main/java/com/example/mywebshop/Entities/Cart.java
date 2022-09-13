package com.example.mywebshop.Entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "cart")
public class Cart {
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "cart_cart_id_seq"
    )
    @SequenceGenerator(
            name = "cart_cart_id_seq",
            allocationSize = 1
    )
    @Column(name = "cart_id", nullable = false)
    private Long cart_id;
    @Column(name = "cart_name")
    private String cart_name;

    @ManyToMany
    @JoinTable(
            name = "cart_items",
            joinColumns = @JoinColumn(name = "cart_id"),
            inverseJoinColumns = @JoinColumn(name = "item_id")
    )
    private List<Items> items;

    public Cart() {
    }

    public Cart(Long cart_id, String cart_name, List<Items> items) {
        this.cart_id = cart_id;
        this.cart_name = cart_name;
        this.items = items;
    }

    public Long getCart_id() {
        return cart_id;
    }

    public void setCart_id(Long cart_id) {
        this.cart_id = cart_id;
    }

    public String getCart_name() {
        return cart_name;
    }

    public void setCart_name(String cart_name) {
        this.cart_name = cart_name;
    }

    public List<Items> getItems() {
        return items;
    }

    public void setItems(List<Items> items) {
        this.items = items;
    }
}

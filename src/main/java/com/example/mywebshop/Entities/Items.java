package com.example.mywebshop.Entities;

import javax.persistence.*;

@Entity
@Table(name = "items")
public class Items {
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "item_id_seq"
    )
    @SequenceGenerator(
            name = "item_id_seq",
            allocationSize = 1
    )
    @Column(name = "item_id", nullable = false)
    private Long item_id;
    @Column(name = "item_name")
    private String item_name;
    @Column(name = "item_quantity")
    private int item_quantity;

    public Items() {
    }

    public Items(Long item_id, String item_name, int item_quantity) {
        this.item_id = item_id;
        this.item_name = item_name;
        this.item_quantity = item_quantity;
    }


    public Long getItem_id() {
        return item_id;
    }

    public void setItem_id(Long item_id) {
        this.item_id = item_id;
    }

    public String getItem_name() {
        return item_name;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    public int getItem_quantity() {
        return item_quantity;
    }

    public void setItem_quantity(int item_quantity) {
        this.item_quantity = item_quantity;
    }
}

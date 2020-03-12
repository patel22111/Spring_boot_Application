package com.ot.model;
import javax.persistence.*;

@Entity
public class Product {
    private Long id;
    private String name;
    private String brand;
    private String made_In;
    private float price;

    public Product() {
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getMade_In() {
        return made_In;
    }

    public void setMade_In(String made_In) {
        this.made_In = made_In;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}

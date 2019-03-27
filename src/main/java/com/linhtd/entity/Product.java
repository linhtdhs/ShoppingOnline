/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.linhtd.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Linh
 */
@Entity
@Table(name = "Products")
public class Product implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @NotNull
    private int id;
    
    @NotNull
    @Size(min = 2, max = 16)
    @Column(name = "name")
    private String name;
    
    @NotNull
    @Size(min = 2, max = 64)
    @Column(name = "description")
    private String description;
    
    @NotNull
    @Min(value = 0, message = "Must bigger than 0")
    @Max(value = Long.MAX_VALUE, message = "Must less than " + Long.MAX_VALUE)
    @Digits(integer = Integer.MAX_VALUE, fraction = 3)
    @Column(name = "price")
    private double price;
    
    @NotNull
    @Min(value = 0, message = "Must bigger than 0")
    @Max(value = Long.MAX_VALUE, message = "Mus less than " + Long.MAX_VALUE)
    @Digits(integer = Integer.MAX_VALUE, fraction = 0)
    @Column(name = "amount")
    private int amount;
    
    @NotNull
    @Column(name = "thumnail")
    private String thumnail;
    
    @ManyToOne
    @JoinColumn(name = "cateId")
    private Category category;

    public Product() {
    }

    public Product(int id, String name, String description, double price, int amount, String thumnail, Category category) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.amount = amount;
        this.thumnail = thumnail;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getThumnail() {
        return thumnail;
    }

    public void setThumnail(String thumnail) {
        this.thumnail = thumnail;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
    
    
}

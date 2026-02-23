package com.example.demo.entities.concretes;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private BigDecimal price;

    private String explanation;

    public Product() {
        
    }

    public int getId() {
        return id; 
    }
    public void setId(int id) { 
        this.id = id;
    }

    public Category getCategory() {
        return category;
    }
    public void setCategory(Category category) { 
        this.category = category;
    }

    public String getName() {
        return name; 
    }
    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price; 
    }
    public void setPrice(BigDecimal price) { 
        this.price = price; 
    }

    public String getExplanation() {
        return explanation;
    }
    public void setExplanation(String explanation) { 
        this.explanation = explanation;
    }
}

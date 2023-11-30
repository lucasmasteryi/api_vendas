package com.vendas.api.domain.product;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@Table(name = "product")
@Entity(name = "product")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String name;
    private String description;
    private String category;
    private String sku;
    private int stockQuantity;
    private double price;
    private Boolean active;
    private String imageUrl;
    private Date dataCreation;
    private Boolean applyDiscount;

    public Product(ProductRequestDTO data) {
        this.name = data.name();
        this.description = data.description();
        this.category = data.category();
        this.sku = data.sku();
        this.stockQuantity = data.stockQuantity();
        this.price = data.price();
        this.imageUrl = data.imageUrl();
        this.dataCreation = data.dataCreation();
        this.applyDiscount = data.applyDiscount();
    }
}

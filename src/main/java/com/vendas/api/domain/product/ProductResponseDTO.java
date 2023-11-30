package com.vendas.api.domain.product;

import java.util.Date;

public record ProductResponseDTO(
    String id,
    String name,
    String description,
    String category,
    String sku,
    int stockQuantity,
    double price,
    Boolean active,
    String imageUrl,
    Date dataCreation,
    Boolean applyDiscount
) {
    public ProductResponseDTO(Product product){
        this(
            product.getId(),
            product.getName(),
            product.getDescription(),
            product.getCategory(),
            product.getSku(),
            product.getStockQuantity(),
            product.getPrice(),
            product.getActive(),
            product.getImageUrl(),
            product.getDataCreation(),
            product.getApplyDiscount()
        );
    }
}
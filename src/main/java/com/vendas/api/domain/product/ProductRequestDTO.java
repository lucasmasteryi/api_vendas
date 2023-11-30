package com.vendas.api.domain.product;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.Date;

public record ProductRequestDTO(
        @NotBlank
        String name,
        @NotNull
        String description,
        @NotNull
        String category,

        String sku,
        int stockQuantity,
        @NotNull
        Integer price,

        String imageUrl,
        Date dataCreation,
        Boolean applyDiscount
) {
}

package com.fintech.productos.api;

import jakarta.validation.constraints.*;

public class ProductDto {

    @NotBlank
    @Size(max = 255)
    private String name;

    @NotNull
    @DecimalMin("0.01")
    private BigDecimal price;

    @NotNull
    @Min(0)
    private Integer stock;

    @NotBlank
    @Size(max = 255)
    private String category;

    public ProductDto() {}

    public ProductDto(String name, BigDecimal price, Integer stock, String category) {
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.category = category;
    }

    // Getters and setters
}
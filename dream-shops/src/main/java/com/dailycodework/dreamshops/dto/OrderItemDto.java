package com.dailycodework.dreamshops.dto;

import com.dailycodework.dreamshops.model.Product;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class OrderItemDto {
//    private Long productId;
//    private String productName;
    private BigDecimal price;
    private int quantity;
//    private ProductDto Product;
}

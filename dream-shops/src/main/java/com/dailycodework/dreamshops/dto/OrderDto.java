package com.dailycodework.dreamshops.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Data
public class OrderDto {
 private Long orderId;
 private Long userId;
 private LocalDateTime orderDate;
 private BigDecimal totalAmount;
 private String orderStatus;
 // model mapper can handle convertion from set to list
 private List<OrderItemDto> orderItems;
}

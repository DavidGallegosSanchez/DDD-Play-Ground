package com.food.ordering.system.order.service.domain.dto.create;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.UUID;

@Builder
public class OrderItem {

    @NotNull
    private final UUID productId;

    @NotNull
    private final Integer quantity;

    @NotNull
    private final BigDecimal price;

    @NotNull
    private final BigDecimal subTotal;

    public OrderItem(UUID productId, Integer quantity, BigDecimal price, BigDecimal subTotal) {
        this.productId = productId;
        this.quantity = quantity;
        this.price = price;
        this.subTotal = subTotal;
    }

    public @NotNull UUID getProductId() {
        return productId;
    }

    public @NotNull Integer getQuantity() {
        return quantity;
    }

    public @NotNull BigDecimal getPrice() {
        return price;
    }

    public @NotNull BigDecimal getSubTotal() {
        return subTotal;
    }
}

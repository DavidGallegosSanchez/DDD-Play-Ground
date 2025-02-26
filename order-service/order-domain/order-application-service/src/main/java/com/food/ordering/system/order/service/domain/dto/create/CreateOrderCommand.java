package com.food.ordering.system.order.service.domain.dto.create;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@Builder
public class CreateOrderCommand {

    @NotNull
    private final UUID customerId;

    @NotNull
    private final UUID restaurantId;

    @NotNull
    private final BigDecimal price;

    @NotNull
    private final List<OrderItem> items;

    @NotNull
    private final OrderAddress address;

    public CreateOrderCommand(UUID customerId, UUID restaurantId, BigDecimal price, List<OrderItem> items, OrderAddress address) {
        this.customerId = customerId;
        this.restaurantId = restaurantId;
        this.price = price;
        this.items = items;
        this.address = address;
    }

    public @NotNull UUID getCustomerId() {
        return customerId;
    }

    public @NotNull UUID getRestaurantId() {
        return restaurantId;
    }

    public @NotNull BigDecimal getPrice() {
        return price;
    }

    public @NotNull List<OrderItem> getItems() {
        return items;
    }

    public @NotNull OrderAddress getAddress() {
        return address;
    }
}

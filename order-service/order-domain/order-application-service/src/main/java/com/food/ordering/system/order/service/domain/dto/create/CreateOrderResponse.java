package com.food.ordering.system.order.service.domain.dto.create;

import com.food.ordering.system.domain.valueobject.OrderStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import javax.validation.constraints.NotNull;
import java.util.UUID;

@Builder
public class CreateOrderResponse {

    @NotNull
    private final UUID orderTrackingId;

    @NotNull
    private final OrderStatus orderStatus;

    @NotNull
    private final String message;

    public CreateOrderResponse(UUID orderTrackingId, OrderStatus orderStatus, String message) {
        this.orderTrackingId = orderTrackingId;
        this.orderStatus = orderStatus;
        this.message = message;
    }

    public @NotNull UUID getOrderTrackingId() {
        return orderTrackingId;
    }

    public @NotNull OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public @NotNull String getMessage() {
        return message;
    }
}

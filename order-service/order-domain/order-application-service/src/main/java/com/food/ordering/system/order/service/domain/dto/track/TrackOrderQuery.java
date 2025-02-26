package com.food.ordering.system.order.service.domain.dto.track;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import javax.validation.constraints.NotNull;
import java.util.UUID;


@Builder
public class TrackOrderQuery {

    @NotNull
    private final UUID orderTrackingId;

    public TrackOrderQuery(UUID orderTrackingId) {
        this.orderTrackingId = orderTrackingId;
    }

    public @NotNull UUID getOrderTrackingId() {
        return orderTrackingId;
    }
}

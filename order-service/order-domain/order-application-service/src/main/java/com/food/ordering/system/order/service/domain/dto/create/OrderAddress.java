package com.food.ordering.system.order.service.domain.dto.create;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

@Builder
public class OrderAddress {

    @NotNull
    @Max(value = 50)
    private final String street;

    @NotNull
    @Max(value = 10)
    private final String postalCode;

    @NotNull
    @Max(value = 50)
    private final String city;

    public OrderAddress(String street, String postalCode, String city) {
        this.street = street;
        this.postalCode = postalCode;
        this.city = city;
    }

    public @NotNull @Max(value = 50) String getStreet() {
        return street;
    }

    public @NotNull @Max(value = 10) String getPostalCode() {
        return postalCode;
    }

    public @NotNull @Max(value = 50) String getCity() {
        return city;
    }
}

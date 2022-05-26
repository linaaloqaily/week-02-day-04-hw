package com.example.CarSystem.models;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.NotEmpty;

@AllArgsConstructor @Data
public class Order {

    @NotEmpty(message = "Id is required")
    private String id;
    @NotEmpty(message = "User id is required")
    private String userId;
    @NotEmpty(message = "Car id is required")
    private String carId;
}
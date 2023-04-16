package io.petstore.swagger.models.request;

import lombok.Data;

import java.util.Date;

@Data
public class PlaceOrderModel {
    private final Integer id = 1;
    private final Integer petId = 5;
    private final Integer quantity = 3;
    private final Date shipDate = new Date();
    private final String status = "placed";
    private final Boolean complete = true;
}

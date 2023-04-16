package io.petstore.swagger.models.responses.post.order;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class OrderResponsesModel {
    private Integer id;
    private Integer petId;
    private Integer quantity;
    private Date shipDate;
    private String status;
    private Boolean complete;
}

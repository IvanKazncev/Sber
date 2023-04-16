package io.petstore.swagger.models.responses.get.returnStatusCode;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ResponsesModel {
    private Integer sold;
    private Integer alive;
    private Integer pending;
    private Integer available;


}

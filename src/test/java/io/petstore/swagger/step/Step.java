package io.petstore.swagger.step;

import io.petstore.swagger.models.responses.get.returnStatusCode.ResponsesModel;
import io.petstore.swagger.models.responses.post.order.OrderResponsesModel;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;

public class Step {

    public ResponsesModel getRequest(String endPoint, Integer statusCode) {
        ResponsesModel response = given()
                .log().uri()
                .when()
                .contentType(ContentType.JSON)
                .get("https://petstore.swagger.io/v2" + endPoint)
                .then().log().all()
                .statusCode(statusCode)
                .extract().as(ResponsesModel.class);
        return response;
    }

    public OrderResponsesModel placeOrderTest(String endPoint, Object body, Integer statusCode) {
        OrderResponsesModel response = given()
                .log().all()
                .contentType(ContentType.JSON)
                .body(body)
                .when()
                .post("https://petstore.swagger.io/v2" + endPoint)
                .then()
                .log().status()
                .log().body()
                .statusCode(statusCode)
                .extract().body().as(OrderResponsesModel.class);
        return response;
    }
}


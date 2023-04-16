package io.petstore.swagger.test;

import io.petstore.swagger.data.get.returnStatusCode.ReturnStatusCodeValidData;
import io.petstore.swagger.data.post.placeOrder.PlaceAnOrderForPetValidData;
import io.petstore.swagger.models.request.PlaceOrderModel;
import io.petstore.swagger.step.Step;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Demo api test")
public class PetStoreTest {
    Step step = new Step();
    ReturnStatusCodeValidData returnStatusCodeValidData = new ReturnStatusCodeValidData();
    PlaceAnOrderForPetValidData placeAnOrderForPetValidData = new PlaceAnOrderForPetValidData();
    PlaceOrderModel placeOrderModel = new PlaceOrderModel();


    @Test
    @DisplayName("Проверка возвращенного статуса")
    void returnStatusCodesTest() {
        assertThat(step.getRequest(returnStatusCodeValidData.getEndPoint(), 200)
                .getAlive()).as("Количество не совпадает").isEqualTo(1);

    }

    @Test
    @DisplayName("Проверка размещение заказа")
    void placeOrderTest() {
        assertThat(step.placeOrderTest(placeAnOrderForPetValidData.getEndPoint(), placeOrderModel, 200)
                .getStatus()).as("Статус заказа некорректный").isEqualTo("placed");
    }

}

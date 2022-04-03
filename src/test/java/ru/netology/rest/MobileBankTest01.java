package ru.netology.rest;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class MobileBankTest01 {

    @Test
    void shouldReturnDemoAccounts() {
        // Подход: Given — When — Then
        // Предусловия
        given()
                .baseUri("http://localhost:9999/api/v1")

                .when() // Выполняемые действия
                // get метод запроса GET
                // URI относительно baseUri
                .get("/demo/accounts")

                .then() // Проверки
                .statusCode(200);
    }
}

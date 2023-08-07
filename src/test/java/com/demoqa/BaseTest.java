package com.demoqa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

public class BaseTest {
    @BeforeAll
    static void beforeAll() {
        Configuration.pageLoadStrategy = "eager";
        //Открытие страницы
        Configuration.baseUrl = "https://demoqa.com";
        //Установка размера окна браузера
        Configuration.browserSize = "1920x1080";

    }
}

package com.demoqa.elements;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;


public class RadioButton {

    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.pageLoadStrategy = "eager";
        Configuration.browserSize = "1920x1080";
    }

    @Test
    void RadioButton() {
        open("/radio-button");
        $("[for=noRadio]").isEnabled();
        $("[for=yesRadio]").click();
        $(".mt-3 .text-success").shouldHave(text("Yes"));
        $("[for=impressiveRadio]").click();
        $(".mt-3 .text-success").shouldHave(text("Impressive"));

//        sleep(5000);
//        <label class="custom-control-label" for="yesRadio">Yes</label>
    }
}

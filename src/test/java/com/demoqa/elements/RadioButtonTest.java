package com.demoqa.elements;

import com.demoqa.BaseTest;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;


public class RadioButtonTest extends BaseTest {

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

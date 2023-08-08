package com.demoqa.elements;

import com.demoqa.BaseTest;
import com.demoqa.pages.RadioButton;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;


public class RadioButtonTest extends BaseTest {

    @Test
    void RadioButton() {
        RadioButton radioButton = new RadioButton();

        radioButton.openPage()
                .setNoRadio()
                .setYesRadio()
                .checkYesRadio("Yes")
                .setImpressiveRadio()
                .checkimpressiveRadio("Impressive");
//      sleep(5000);
    }
}

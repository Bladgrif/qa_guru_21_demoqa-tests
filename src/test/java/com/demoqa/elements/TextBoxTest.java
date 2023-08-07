package com.demoqa.elements;

import com.demoqa.BaseTest;
import com.demoqa.pages.Textbox;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTest extends BaseTest {

    @Test
    void TextBox() {
        Textbox textbox = new Textbox();
        textbox.openPage()
                .setUserName("Roman Grigoriev")
                .setUserEmail("RomanGrigorev@gmail.com")
                .setCurrentAddress("Some address 1")
                .setPermanentAddress("Another address 2")
                .clickSubmit()
                .checkFields("Roman Grigoriev",
                        "RomanGrigorev@gmail.com",
                        "Some address 1",
                        "Another address 2");
    }
}

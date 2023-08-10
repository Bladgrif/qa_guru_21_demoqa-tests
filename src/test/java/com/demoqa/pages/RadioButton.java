package com.demoqa.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RadioButton {
    SelenideElement noRadio =  $("[for=noRadio]"),
                    yesRadio =  $("[for=yesRadio]"),
                    yesRadioClicked =  $(".mt-3 .text-success"),
                    impressiveRadio =  $("[for=impressiveRadio]"),
                    impressiveRadioClicked =  $(".mt-3 .text-success");



    public RadioButton setNoRadio() {
        noRadio.isEnabled();
        return this;
    }

    public RadioButton setYesRadio() {
        yesRadio.click();
        return this;
    }

    public RadioButton checkYesRadio(String value) {
        yesRadioClicked.shouldHave(text(value));
        return this;
    }

    public RadioButton setImpressiveRadio() {
        impressiveRadio.click();
        return this;
    }

    public RadioButton checkimpressiveRadio(String value) {
        impressiveRadioClicked.shouldHave(text(value));
        return this;
    }

    public RadioButton openPage () {
        open("/radio-button");
        return this;
    }
}

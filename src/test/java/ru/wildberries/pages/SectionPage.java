package ru.wildberries.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class SectionPage {
    private SelenideElement
            sectionTitle = $(".catalog-title");

    public void checkSectionTitle (String value) {
        sectionTitle.shouldHave(text(value));
    }


}

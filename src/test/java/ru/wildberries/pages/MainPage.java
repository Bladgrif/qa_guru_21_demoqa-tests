package ru.wildberries.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class MainPage {

    private SelenideElement
            catalogButton = $(".nav-element__burger-line"),
            CatalogLoads = $(".simple-menu__currency");
    private ElementsCollection
            menuSection = $$(".menu-burger__main-list li"),
            menuSubSection = $$(".menu-burger__set");

    public MainPage openPage() {
        open("https://www.wildberries.ru/");
        return this;
    }

    public MainPage openCatalog() {
        catalogButton.click();
        return this;
    }

    public MainPage waitUntilCatalogLoads() {
        CatalogLoads.should(Condition.appear, Duration.ofSeconds(10));
        return this;
    }

    public MainPage clickOnSectionFromCatalog(String value) {
        menuSection.findBy(text(value)).click();
        return this;
    }

    public MainPage hoverOnSectionFromCatalog(String value) {
        menuSection.findBy(text(value)).hover();
        return this;
    }

    public MainPage checkSubSection(String value) {
        menuSubSection.findBy(text(value)).shouldHave(text(value));
        return this;
    }


}

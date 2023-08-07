package com.demoqa.pages;

import com.codeborne.selenide.SelenideElement;
import com.demoqa.pages.components.CalendarComponents;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.executeJavaScript;

public class RegistrationPage {
    CalendarComponents calendar = new CalendarComponents();
    SelenideElement
            firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName"),
            userNumberInput = $("#userNumber"),
            genderWrapper = $("#genterWrapper"),
            userEmail = $("#userEmail"),
            BirthDate = $("#dateOfBirthInput");

    public RegistrationPage openPage() {
        //Переход на форму регистрации
        open("/automation-practice-form");
        //Скрывает рекламу и футер
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");
        return this;
    }

    public RegistrationPage setFirstName(String value) {
        firstNameInput.setValue(value);
        return this;
    }

    public RegistrationPage setLastName(String value) {
        lastNameInput.setValue(value);
        return this;
    }

    public RegistrationPage setUserNumber(String value) {
        userNumberInput.setValue(value);
        return this;
    }

    public RegistrationPage setGender(String value) {
        genderWrapper.$(byText(value)).click();
        return this;
    }

    public RegistrationPage setUserEmail(String value) {
        userEmail.setValue(value);
        return this;
    }

    public RegistrationPage setBirthDate(String day, String month, String year) {
        BirthDate.click();
        calendar.setDate(day,month, year);
        return this;
    }

    public RegistrationPage checkResultName (String value) {
        $(".table-responsive").$(byText("Student Name")).parent().shouldHave(text(value));
        return this;
    }

    public RegistrationPage checkResultMale (String value) {
        $(".table-responsive").$(byText("Gender")).parent().shouldHave(text(value));
        return this;
    }

    public RegistrationPage checkResultNumber (String value) {
        $(".table-responsive").$(byText("Mobile")).parent().shouldHave(text(value));
        return this;
    }



}

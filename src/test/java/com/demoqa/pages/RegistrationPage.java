package com.demoqa.pages;

import com.codeborne.selenide.SelenideElement;
import com.demoqa.pages.components.Calendar;
import com.demoqa.pages.components.Table;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.executeJavaScript;

public class RegistrationPage {
    Calendar calendar = new Calendar();
    Table table = new Table();
    SelenideElement firstNameInput = $("#firstName"),
                    lastNameInput = $("#lastName"),
                    userEmailInput = $("#userEmail"),
                    userNumberInput = $("#userNumber"),
                    currentAddressInput = $("#currentAddress"),
                    genterWrapperInput = $("#genterWrapper"),
                    birthInput = $("#dateOfBirthInput"),
                    subjectsInput = $("#subjectsInput"),
                    hobbiesInput = $("#hobbiesWrapper"),
                    uploadPicture = $("#uploadPicture"),
                    stateInput = $("#state"),
                    cityInput = $("#city"),
                    submit = $("#submit"),
                    content = $(".modal-content");
//    SelenideElement table = $(".table-responsive");

    public RegistrationPage openPage() {
        open("/automation-practice-form");
        return this;
    }

    public RegistrationPage removeFooter() {
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

    public RegistrationPage setUserEmail(String value) {
        userEmailInput.setValue(value);
        return this;
    }

    public RegistrationPage setUserNumber(String value) {
        userNumberInput.setValue(value);
        return this;
    }

    public RegistrationPage setCurrentAddress(String value) {
        currentAddressInput.setValue(value);
        return this;
    }

    public RegistrationPage setGenterWrapper(String value) {
        genterWrapperInput.$(byText(value)).click();
        return this;
    }

    public RegistrationPage setSubjectsInput(String value) {
        subjectsInput.setValue(value).pressEnter();
        return this;
    }

    public RegistrationPage setHobbies(String value) {
        hobbiesInput.$(byText(value)).click();
        return this;
    }

    public RegistrationPage setUploadPicture(String value) {
        uploadPicture.uploadFromClasspath(value);
        return this;
    }

    public RegistrationPage setState(String value) {
        stateInput.click();
        stateInput.$(byText(value)).click();
        return this;
    }

    public RegistrationPage setCity(String value) {
        cityInput.click();
        cityInput.$(byText(value)).click();
        return this;
    }

    public RegistrationPage click() {
        submit.click();
        return this;
    }

    public RegistrationPage checkTable() {
        content.should(appear);
        return this;
    }

    public RegistrationPage setBirthDate(String day, String month, String year) {
        birthInput.click();
        calendar.setDate(day, month, year);
        return this;
    }



//    public RegistrationForm shouldHaveTable(String name, String mail, String male, String number, String birthday, String subject, String hobbies, String image, String adres, String city) {
//        table.$(byText(name)).parent().shouldHave(text("Boby Milligan"));
//        table.$(byText(mail)).parent().shouldHave(text("Boby@Milligan.com"));
//        table.$(byText(male)).parent().shouldHave(text("Male"));
//        table.$(byText(number)).parent().shouldHave(text("8800555353"));
//        table.$(byText(birthday)).parent().shouldHave(text("25 May,2000"));
//        table.$(byText(subject)).parent().shouldHave(text("History"));
//        table.$(byText(hobbies)).parent().shouldHave(text("Reading, Music"));
//        table.$(byText(image)).parent().shouldHave(text("139207535.jpg"));
//        table.$(byText(adres)).parent().shouldHave(text("Anita st.9/4"));
//        table.$(byText(city)).parent().shouldHave(text("Uttar Pradesh Agra"));
//        return this;
//    }
}

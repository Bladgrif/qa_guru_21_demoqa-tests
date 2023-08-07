package com.demoqa.pages;

import com.codeborne.selenide.SelenideElement;
import com.demoqa.pages.components.Calendar;
import com.demoqa.pages.components.Table;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.executeJavaScript;

public class RegistrationForm {
    Calendar calendar = new Calendar();
    Table table = new Table();
    SelenideElement firstName = $("#firstName");
    SelenideElement lastName = $("#lastName");
    SelenideElement userEmail = $("#userEmail");
    SelenideElement userNumber = $("#userNumber");
    SelenideElement currentAddress = $("#currentAddress");
    SelenideElement genterWrapper = $("#genterWrapper");
    SelenideElement birthInput = $("#dateOfBirthInput");
    SelenideElement subjectsInput = $("#subjectsInput");
    SelenideElement hobbies = $("#hobbiesWrapper");
    SelenideElement uploadPicture = $("#uploadPicture");
    SelenideElement state = $("#state");
    SelenideElement city = $("#city");
    SelenideElement submit = $("#submit");
    SelenideElement content = $(".modal-content");
//    SelenideElement table = $(".table-responsive");

    public RegistrationForm openPage() {
        open("/automation-practice-form");
        //Скрывает рекламу и футер
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");
        return this;
    }

    public RegistrationForm setFirstName(String value) {
        firstName.setValue(value);
        return this;
    }

    public RegistrationForm setLastName(String value) {
        lastName.setValue(value);
        return this;
    }

    public RegistrationForm setUserEmail(String value) {
        userEmail.setValue(value);
        return this;
    }

    public RegistrationForm setUserNumber(String value) {
        userNumber.setValue(value);
        return this;
    }

    public RegistrationForm setCurrentAddress(String value) {
        currentAddress.setValue(value);
        return this;
    }

    public RegistrationForm setGenterWrapper(String value) {
        genterWrapper.$(byText(value)).click();
        return this;
    }

    public RegistrationForm setSubjectsInput(String value) {
        subjectsInput.setValue(value).pressEnter();
        return this;
    }

    public RegistrationForm setHobbies(String value) {
        hobbies.$(byText(value)).click();
        return this;
    }

    public RegistrationForm setUploadPicture(String value) {
        uploadPicture.uploadFromClasspath(value);
        return this;
    }

    public RegistrationForm setState(String value) {
        state.click();
        state.$(byText(value)).click();
        return this;
    }

    public RegistrationForm setCity(String value) {
        city.click();
        city.$(byText(value)).click();
        return this;
    }

    public RegistrationForm click() {
        submit.click();
        return this;
    }

    public RegistrationForm checkTable() {
        content.should(appear);
        return this;
    }

    public RegistrationForm setBirthDate(String day, String month, String year) {
        birthInput.click();
        calendar.setDate(day, month, year);
        return this;
    }

    public RegistrationForm shouldHaveTable(String name, String mail, String male, String number, String birthday, String subject, String hobbies, String image, String adress, String city) {
        table.checkFields(name, mail, male, number, birthday, subject, hobbies, image, adress, city);
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

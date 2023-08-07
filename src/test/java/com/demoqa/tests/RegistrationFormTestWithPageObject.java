package com.demoqa.tests;

import com.codeborne.selenide.SelenideElement;
import com.demoqa.BaseTest;
import com.demoqa.pages.RegistrationPage;
import com.demoqa.pages.components.CalendarComponents;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationFormTestWithPageObject extends BaseTest {

    RegistrationPage registrationPage = new RegistrationPage();


    @Test
    void RegistrationFormTest() {
        registrationPage.openPage()
                .setFirstName("Boby")
                .setLastName("Milligan")
                .setUserNumber("8800555353")
                .setGender("Male")
                .setUserEmail("Boby@Milligan.com")
                .setBirthDate("25","May", "2000");
        $("#currentAddress").setValue("Anita st.9/4");
        $("#subjectsInput").setValue("History").pressEnter();
        $("#hobbiesWrapper").$(byText("Reading")).click();
        $("#hobbiesWrapper").$(byText("Music")).click();
        $("#uploadPicture").uploadFromClasspath("139207535.jpg");
        $("#state").click();
        $("#state").$(byText("Uttar Pradesh")).click();
        $("#city").click();
        $("#city").$(byText("Agra")).click();
        $("#submit").click();

        $(".modal-content").should(appear);
        $(".table-responsive").$(byText("Student Name")).parent().shouldHave(text("Boby Milligan"));
        $(".table-responsive").$(byText("Student Email")).parent().shouldHave(text("Boby@Milligan.com"));
        $(".table-responsive").$(byText("Gender")).parent().shouldHave(text("Male"));
        $(".table-responsive").$(byText("Mobile")).parent().shouldHave(text("8800555353"));
        $(".table-responsive").$(byText("Date of Birth")).parent().shouldHave(text("25 May,2000"));
        $(".table-responsive").$(byText("Subjects")).parent().shouldHave(text("History"));
        $(".table-responsive").$(byText("Hobbies")).parent().shouldHave(text("Reading, Music"));
        $(".table-responsive").$(byText("Picture")).parent().shouldHave(text("139207535.jpg"));
        $(".table-responsive").$(byText("Address")).parent().shouldHave(text("Anita st.9/4"));
        $(".table-responsive").$(byText("State and City")).parent().shouldHave(text("Uttar Pradesh Agra"));
    }

        @Test
        void RegistrationFormTestWithMinimal() {
            registrationPage.openPage()
                    .setFirstName("Boby")
                    .setLastName("Milligan")
                    .setUserNumber("8800555353")
                    .setGender("Male");

            $("#submit").click();

            $(".modal-content").should(appear);

            registrationPage.checkResultName("Boby Milligan")
                    .checkResultMale("Male")
                    .checkResultNumber("8800555353");
    }
}

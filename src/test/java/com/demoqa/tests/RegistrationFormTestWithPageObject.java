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

        //Выбор пола (поле с выбором из нескольких вариантов)
        $("#genterWrapper").$(byText("Male")).click();

        //Установка даты в календаре
//        $("#dateOfBirthInput").click();
//        $("select.react-datepicker__month-select").selectOption("May");
//        $("select.react-datepicker__year-select").selectOption("2000");
//        $(".react-datepicker__day.react-datepicker__day--025").click();

        //Выбор предмета (из выпадающего списка)
        $("#subjectsInput").setValue("History").pressEnter();

        //Выбор хобби
        $("#hobbiesWrapper").$(byText("Reading")).click();
        $("#hobbiesWrapper").$(byText("Music")).click();

        $("#uploadPicture").uploadFromClasspath("139207535.jpg");

        //Выбор города
        $("#state").click();
        $("#state").$(byText("Uttar Pradesh")).click();
        $("#city").click();
        $("#city").$(byText("Agra")).click();

        //Отправка результат (нажатие кнопки)
        $("#submit").click();

        //Проверка открытия таблицы
        $(".modal-content").should(appear);

        //Проверка заполнения таблицы
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

        //Остановка теста на 5 секунд
//        sleep(10000);
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

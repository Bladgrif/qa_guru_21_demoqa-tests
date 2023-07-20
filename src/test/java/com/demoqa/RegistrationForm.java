package com.demoqa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationForm {

    @BeforeAll
    static void beforeAll() {
        //Ускорение загрузки страниц
        Configuration.pageLoadStrategy = "eager";
        //Открытие страницы
        Configuration.baseUrl = "https://demoqa.com";
        //Установка размера окна браузера
        Configuration.browserSize = "1920x1080";
    }

    @Test
    void fileFormTest() {
        //Переход на форму регистрации
        open("/automation-practice-form");

        //Заполнение текстовых полей
        $("#firstName").setValue("Boby");
        $("#lastName").setValue("Milligan");
        $("#userEmail").setValue("Boby@Milligan.com");
        $("#userNumber").setValue("88005553535");
        $("#currentAddress").setValue("Anita st.9/4");

        //Выбор пола (поле с выбором из нескольких вариантов)
        $("#genterWrapper").$(byText("Male")).click();

        //Установка даты в календаре
        $("#dateOfBirthInput").click();
        $("select.react-datepicker__month-select").selectOption("May");
        $("select.react-datepicker__year-select").selectOption("2000");
        $(".react-datepicker__day.react-datepicker__day--025").click();
//        $(".subjectsInput").click();

        //Возможные варианты (пока не знаю для чего)
//        $("select.react-datepicker__month-select").selectOptionByValue("May");
//        $("select.react-datepicker__month-select").selectOptionContainingText("May");

        //Выбор предмета (из выпадающего списка)
        $("#subjectsInput").setValue("History").pressEnter();

        //Выбор хобби
        $("#hobbiesWrapper").$(byText("Reading")).click();
        $("#hobbiesWrapper").$(byText("Music")).click();

        //Загрузка изображения
        $("#uploadPicture").uploadFromClasspath(FaceMan.jpg);


        //Выбор города
        $("#state").click();
        $("#state").$(byText("Uttar Pradesh")).click();
        $("#city").click();
        $("#city").$(byText("Agra")).click();






        //Остановка теста на 5 секунд
        sleep(5000);

    }
}

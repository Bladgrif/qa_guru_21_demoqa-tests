package com.demoqa.forms;

import com.demoqa.BaseTest;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationFormTest extends BaseTest {
    @Test
    void fileFormTest() {
        //Переход на форму регистрации
        open("/automation-practice-form");
        //Скрывает рекламу и футер
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");

        //Заполнение текстовых полей
        $("#firstName").setValue("Boby");
        $("#lastName").setValue("Milligan");
        $("#userEmail").setValue("Boby@Milligan.com");
        $("#userNumber").setValue("8800555353");
        $("#currentAddress").setValue("Anita st.9/4");

        //Выбор пола (поле с выбором из нескольких вариантов)
        $("#genterWrapper").$(byText("Male")).click();

        //Установка даты в календаре
        $("#dateOfBirthInput").click();
        $("select.react-datepicker__month-select").selectOption("May");
        $("select.react-datepicker__year-select").selectOption("2000");
        $(".react-datepicker__day.react-datepicker__day--025").click();

        //Выбор предмета (из выпадающего списка)
        $("#subjectsInput").setValue("History").pressEnter();

        //Выбор хобби
        $("#hobbiesWrapper").$(byText("Reading")).click();
        $("#hobbiesWrapper").$(byText("Music")).click();

        //Загрузка изображения
//        File cv = new File("src/test/java/resources/139207535.jpg");
//        $("#uploadPicture").uploadFile(cv);
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
}

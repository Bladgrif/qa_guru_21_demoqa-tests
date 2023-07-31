package sandbox;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import com.codeborne.selenide.Configuration;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class demoqa {

    //Писал почти не гляда в другой код, то есть почти без подсказок, считаю эксперимент успешным

    @BeforeAll
    static void beforeAll() {
        Configuration.pageLoadStrategy = "eager";
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";
    }

    @Test
    void demoqa() {
        open("/automation-practice-form");
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");

        var Name = "Ivan";
        var LastName = "Ivanov";
        var Email = "Ivan@Ivanov.com";
        var userNumber = "1234567890";
        var Subjects_one = "History";
        var Current_Address = "Mer.street 19.5";


        $("#firstName").setValue(Name);
        $("#lastName").setValue(LastName);
        $("#userEmail").setValue(Email);
        $("#genterWrapper").$(byText("Female")).click();
        $("#userNumber").setValue(userNumber);
        $("#dateOfBirthInput").click();
        $(".react-datepicker__year-select").$(byText("2007")).click();
//        $("select.react-datepicker__month-select").selectOption("May");
//        $("select.react-datepicker__month-select").selectOptionByValue("6");
        $(".react-datepicker__month-select").$(byText("July")).click();
        $(".react-datepicker__day--004").click();
        $("#subjectsInput").setValue(Subjects_one).pressEnter();
        $("#hobbiesWrapper").$(byText("Reading")).click();
        $("#uploadPicture").uploadFromClasspath("139207535.jpg");
        $("#currentAddress").setValue(Current_Address);
        $("#state").click();
        $("#state").$(byText("Uttar Pradesh")).click();
        $("#city").click();
        $("#city").$(byText("Merrut")).click();
        $("#submit").click();

        $(".table-responsive").should(appear);
        $(".table-responsive").$(byText("Student Name")).parent().shouldHave(text(Name + " " + LastName));
        $(".table-responsive").$(byText("Student Email")).parent().shouldHave(text(Email));
        $(".table-responsive").$(byText("Gender")).parent().shouldHave(text("Male"));
        $(".table-responsive").$(byText("Mobile")).parent().shouldHave(text(userNumber));
        $(".table-responsive").$(byText("Date of Birth")).parent().shouldHave(text("04 July,2007"));
        $(".table-responsive").$(byText("Subjects")).parent().shouldHave(text(Subjects_one));
        $(".table-responsive").$(byText("Hobbies")).parent().shouldHave(text("Reading"));
        $(".table-responsive").$(byText("Picture")).parent().shouldHave(text("139207535.jpg"));
        $(".table-responsive").$(byText("Address")).parent().shouldHave(text(Current_Address));
        $(".table-responsive").$(byText("State and City")).parent().shouldHave(text("Uttar Pradesh Merrut"));

//        sleep(5000);

    }
}

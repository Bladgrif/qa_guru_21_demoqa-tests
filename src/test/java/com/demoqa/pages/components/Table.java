package com.demoqa.pages.components;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class Table {
    public void checkFields(String name, String mail, String male, String number, String birthday, String subject, String hobbies, String image, String adress, String city) {
        $(".table-responsive").$(byText(name)).parent().shouldHave(text(name));
        $(".table-responsive").$(byText(mail)).parent().shouldHave(text(mail));
        $(".table-responsive").$(byText(male)).parent().shouldHave(text(male));
        $(".table-responsive").$(byText(number)).parent().shouldHave(text(number));
        $(".table-responsive").$(byText(birthday)).parent().shouldHave(text(birthday));
        $(".table-responsive").$(byText(subject)).parent().shouldHave(text(subject));
        $(".table-responsive").$(byText(hobbies)).parent().shouldHave(text(hobbies));
        $(".table-responsive").$(byText(image)).parent().shouldHave(text(image));
        $(".table-responsive").$(byText(adress)).parent().shouldHave(text(adress));
        $(".table-responsive").$(byText(city)).parent().shouldHave(text(city));

    }
}

package com.demoqa.elements;

import com.demoqa.BaseTest;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class CheckBoxTest extends BaseTest {

    @Test
    void CheckBox () {
        open("/checkbox");
        $(".rct-title").click();
        sleep(5000);

        $("#result").should(appear);
        $("#result").$(byText("You have selected :")).shouldHave(text("You have selected :"));
        $("#result").$(byText("home")).shouldHave(text("home"));
        $("#result").$(byText("desktop")).shouldHave(text("desktop"));
        $("#result").$(byText("notes")).shouldHave(text("notes"));
        $("#result").$(byText("commands")).shouldHave(text("commands"));
        $("#result").$(byText("documents")).shouldHave(text("documents"));
        $("#result").$(byText("workspace")).shouldHave(text("workspace"));
        $("#result").$(byText("react")).shouldHave(text("react"));
        $("#result").$(byText("angular")).shouldHave(text("angular"));
        $("#result").$(byText("veu")).shouldHave(text("veu"));
        $("#result").$(byText("office")).shouldHave(text("office"));
        $("#result").$(byText("public")).shouldHave(text("public"));
        $("#result").$(byText("private")).shouldHave(text("private"));
        $("#result").$(byText("classified")).shouldHave(text("classified"));
        $("#result").$(byText("general")).shouldHave(text("general"));
        $("#result").$(byText("downloads")).shouldHave(text("downloads"));
        $("#result").$(byText("wordFile")).shouldHave(text("wordFile"));
        $("#result").$(byText("excelFile")).shouldHave(text("excelFile"));
        $("#result").$(byText("home")).shouldHave(text("home"));
        $("#result").$(byText("home")).shouldHave(text("home"));




    }
}

package sandbox;

import com.demoqa.BaseTest;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTest extends BaseTest {

    @Test
    void TextBox() {
        open("/text-box");

//        $("[id=userName]").setValue("Roman Grigoriev");
        $("#userName").setValue("Roman Grigoriev");
        $("#userEmail").setValue("RomanGrigorev@gmail.com");
        $("#currentAddress").setValue("Some address 1");
        $("#permanentAddress").setValue("Another address 2");
        $("#submit").click();

//        $("#output").$("name").shouldHave(text("Roman Grigoriev"));
        $("#output #name").shouldHave(text("Roman Grigoriev"));
        $("#output #email").shouldHave(text("RomanGrigorev@gmail.com"));
        $("#output #currentAddress").shouldHave(text("Some address 1"));
        $("#output #permanentAddress").shouldHave(text("Another address 2"));

    }
}

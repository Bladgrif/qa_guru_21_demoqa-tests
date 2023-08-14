package com.demoqa.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Textbox {
    public Textbox openPage() {
        open("/text-box");
        return this;
    }

    SelenideElement userNameInput = $("#userName"),
                    userEmailInput = $("#userEmail"),
                    currentAddressInput = $("#currentAddress"),
                    permanentAddressInput = $("#permanentAddress"),
                    submit = $("#submit"),
                    checkName = $("#output #name"),
                    checkEmail = $("#output #email"),
                    checkCurrentAddress = $("#output #currentAddress"),
                    checkPermanentAddress = $("#output #permanentAddress");



    public Textbox setUserName (String value) {
        userNameInput.setValue(value);
        return this;
    }
    public Textbox setUserEmail (String value) {
        userEmailInput.setValue(value);
        return this;
    }

    public Textbox setCurrentAddress (String value) {
        currentAddressInput.setValue(value);
        return this;
    }

    public Textbox setPermanentAddress (String value) {
        permanentAddressInput.setValue(value);
        return this;
    }

    public Textbox clickSubmit () {
        submit.click();
        return this;
    }

    public Textbox checkFields (String name,String email,String currentAddress,String permanentAddress) {
        checkName.shouldHave(text(name));
        checkEmail.shouldHave(text(email));
        checkCurrentAddress.shouldHave(text(currentAddress));
        checkPermanentAddress.shouldHave(text(permanentAddress));
        return this;
    }

}

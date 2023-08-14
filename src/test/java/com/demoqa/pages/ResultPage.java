package com.demoqa.pages;

import com.demoqa.pages.components.Table;

public class ResultPage {

    Table table = new Table();

    public void checkResult(String name, String mail, String male, String number, String birthday, String subject, String hobbies, String image, String adress, String city) {
        table.checkFields(name, mail, male, number, birthday, subject, hobbies, image, adress, city);
    }
}

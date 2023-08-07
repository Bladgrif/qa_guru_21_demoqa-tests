package com.demoqa.forms;

import com.demoqa.BaseTest;
import com.demoqa.pages.RegistrationForm;
import org.junit.jupiter.api.Test;

public class RegistrationFormTest extends BaseTest {
    @Test
    void fileFormTest() {

        RegistrationForm registrationform = new RegistrationForm();

        registrationform.openPage()
                .setFirstName("Boby")
                .setLastName("Milligan")
                .setUserEmail("Boby@Milligan.com")
                .setUserNumber("8800555353")
                .setCurrentAddress("Anita st.9/4")
                .setGenterWrapper("Male")
                .setBirthDate("25", "May", "2000")
                .setSubjectsInput("History")
                .setHobbies("Reading")
                .setHobbies("Music")
                .setUploadPicture("139207535.jpg")
                .setState("Uttar Pradesh")
                .setCity("Agra")
                .click()
                .checkTable()
                .shouldHaveTable("Boby Milligan",
                        "Boby@Milligan.com",
                        "Male",
                        "8800555353",
                        "25 May,2000",
                        "History",
                        "Reading, Music",
                        "139207535.jpg",
                        "Anita st.9/4",
                        "Uttar Pradesh Agra");

    }
}

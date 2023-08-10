package com.demoqa.forms;

import com.demoqa.BaseTest;
import com.demoqa.pages.RegistrationForm;
import com.demoqa.utils.TestDataProperties;
import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;

import static com.demoqa.utils.TestDataProperties.*;

public class RegistrationFormTestWithFaker extends BaseTest {
    @Test
    void fileFormTest() {

        RegistrationForm registrationform = new RegistrationForm();

        registrationform.openPage()
                .removeFooter()
                .setFirstName(firstName)
                .setLastName(lastName)
                .setUserEmail(userEmail)
                .setUserNumber(userNumber)
                .setCurrentAddress(currentAddress)
                .setGenterWrapper(genterWrapper)
                .setBirthDate(birthDateDay, birthDateMonth, birthDateYear)
                .setSubjectsInput(subjectsInput)
                .setHobbies(hobbie)
                .setUploadPicture(uploadPicture)
                .setState(state)
                .setCity(city)
                .click()
                .checkTable()
                .shouldHaveTable(firstName + " " + lastName,
                        userEmail,
                        genterWrapper,
                        userNumber,
                        birthDateDay + " " + birthDateMonth + "," + birthDateYear,
                        subjectsInput,
                        hobbie,
                        uploadPicture,
                        currentAddress,
                        state + " " + city);

    }
}

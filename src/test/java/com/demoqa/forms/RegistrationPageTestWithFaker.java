package com.demoqa.forms;

import com.demoqa.BaseTest;
import com.demoqa.pages.RegistrationPage;
import com.demoqa.pages.ResultPage;
import com.demoqa.utils.TestDataProperties;
import org.junit.jupiter.api.Test;

public class RegistrationPageTestWithFaker extends BaseTest {

    RegistrationPage registrationPage= new RegistrationPage();
    TestDataProperties testDataProperties = new TestDataProperties();
    ResultPage resultPage = new ResultPage();
    @Test
    void fileFormTest() {

        registrationPage.openPage()
                .removeFooter()
                .setFirstName(testDataProperties.firstName)
                .setLastName(testDataProperties.lastName)
                .setUserEmail(testDataProperties.userEmail)
                .setUserNumber(testDataProperties.userNumber)
                .setCurrentAddress(testDataProperties.currentAddress)
                .setGenterWrapper(testDataProperties.genterWrapper)
                .setBirthDate(testDataProperties.birthDateDay, testDataProperties.birthDateMonth, testDataProperties.birthDateYear)
                .setSubjectsInput(testDataProperties.subjectsInput)
                .setHobbies(testDataProperties.hobbie)
                .setUploadPicture(testDataProperties.uploadPicture)
                .setState(testDataProperties.state)
                .setCity(testDataProperties.city)
                .click()
                .checkTable();

        resultPage.checkResult(testDataProperties.firstName + " " + testDataProperties.lastName,
                testDataProperties.userEmail,
                testDataProperties.genterWrapper,
                testDataProperties.userNumber,
                testDataProperties.birthDateDay + " " + testDataProperties.birthDateMonth + "," + testDataProperties.birthDateYear,
                testDataProperties.subjectsInput,
                testDataProperties.hobbie,
                testDataProperties.uploadPicture,
                testDataProperties.currentAddress,
                testDataProperties.state + " " + testDataProperties.city);
    }
}

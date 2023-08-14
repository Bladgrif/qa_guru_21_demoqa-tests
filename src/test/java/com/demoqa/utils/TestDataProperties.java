package com.demoqa.utils;

import static com.demoqa.utils.TestDataMethods.*;

public class TestDataProperties {

    TestDataMethods testDataMethods = new TestDataMethods();

    public String firstName = testDataMethods.getRandomFirstName(),
            lastName = testDataMethods.getRandomLastName(),
            userEmail = testDataMethods.getRandomUserEmail(),
            userNumber = testDataMethods.getRandomUserNumber(),
            currentAddress = testDataMethods.getRandomCurrentAddress(),
            genterWrapper = testDataMethods.getRandomGenterWrapper(),
            birthDateDay = testDataMethods.getRandomBirthDateDay(),
            birthDateMonth = testDataMethods.getRandomBirthDateMonth(),
            birthDateYear = testDataMethods.getRandomBirthDateYear(),
            subjectsInput = testDataMethods.getRandomSubjectsInput(),
            hobbie = testDataMethods.getRandomHobbies(),
            uploadPicture = testDataMethods.getRandomUploadPicture(),
            state = testDataMethods.getRandomState(),
            city = testDataMethods.getRandomCity(state);
}

package com.demoqa.utils;

import static com.demoqa.utils.TestDataMethods.*;

public class TestDataProperties {

    TestDataMethods testDataMethods = new TestDataMethods();

    public static String firstName = getRandomFirstName(),
            lastName = getRandomLastName(),
            userEmail = getRandomUserEmail(),
            userNumber = getRandomUserNumber(),
            currentAddress = getRandomCurrentAddress(),
            genterWrapper = getRandomGenterWrapper(),
            birthDateDay = getRandomBirthDateDay(),
            birthDateMonth = getRandomBirthDateMonth(),
            birthDateYear = getRandomBirthDateYear(),
            subjectsInput = getRandomSubjectsInput(),
            hobbie = getRandomHobbies(),
            uploadPicture = getRandomUploadPicture(),
            state = getRandomState(),
            city = getRandomCity(state);
}

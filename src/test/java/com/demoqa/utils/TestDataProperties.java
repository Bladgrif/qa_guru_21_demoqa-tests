package com.demoqa.utils;

import com.github.javafaker.Faker;

import java.util.Locale;

import static com.demoqa.utils.TestDataMethods.*;


public class TestDataProperties {

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
                uploadPicture =getRandomUploadPicture(),
                state = getRandomState(),
                city = getRandomCity();
}

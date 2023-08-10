package com.demoqa.utils;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import static com.demoqa.utils.TestDataProperties.*;

public class TestDataMethods {

    public static String[] genters = {"Male", "Female", "Other"};
    public static String[] months = {"January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"};
    public static String[] subjects = {"Accounting", "Arts", "Biology", "Chemistry", "Civics",
            "Economics", "English", "Commerce", "Computer Science", "Physics",
            "Maths", "Hindi", "History", "Social Studies"};
    public static String[] hobbies = {"Sports" , "Reading", "Music"};
    public static String[] pictures = {"139207535.jpg" , "familySpy.png", "pikachu.jpg"};
    public static String[] states = {"NCR", "Uttar Pradesh", "Haryana", "Rajasthan"};
    public static String[] NCR =  {"Delhi", "Gurgaon", "Noida"};
    public static String[] Uttar_Pradesh =  {"Agra", "Lucknow", "Merrut"};
    public static String[] Haryana =  {"Karnal", "Panipat"};
    public static String[] Rajasthan =  {"Jaipur", "Jaiselmer"};


    static Faker faker = new Faker(new Locale("en"));

    public static String getRandomFirstName() {
        return faker.name().firstName();
    }

    public static String getRandomLastName() {
        return faker.name().lastName();
    }

    public static String getRandomUserEmail() {
        return faker.internet().emailAddress();
    }

    public static String getRandomUserNumber() {
        return faker.phoneNumber().subscriberNumber(10);
    }

    public static String getRandomCurrentAddress() {
        return faker.address().fullAddress();
    }

    public static String getRandomGenterWrapper() {
        return faker.options().option(genters);
    }

    public static String getRandomBirthDateDay() {
        return String.valueOf(faker.number().numberBetween(10,28));
    }
    public static String getRandomBirthDateMonth() {
        return faker.options().option(months);
    }
    public static String getRandomBirthDateYear() {
        return String.valueOf(faker.number().numberBetween(1900,2100));
    }

    public static String getRandomSubjectsInput() {
        return faker.options().option(subjects);
    }

    public static String getRandomHobbies() {
        return faker.options().option(hobbies);
    }

    public static String getRandomUploadPicture() {
        return faker.options().option(pictures);
    }

    public static String getRandomState() {
        return faker.options().option(states);
    }

    public static String getRandomCity() {
        switch (state) {
            case "NCR":
                return faker.options().option(NCR);
            case "Uttar Pradesh":
                return faker.options().option(Uttar_Pradesh);
            case "Haryana":
                return faker.options().option(Haryana);
            case "Rajasthan":
                return faker.options().option(Rajasthan);
        }
        return null;
    }
}

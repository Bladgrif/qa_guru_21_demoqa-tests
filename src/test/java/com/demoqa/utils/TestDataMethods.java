package com.demoqa.utils;

import com.github.javafaker.Faker;

import java.util.Locale;

public class TestDataMethods {

    Faker faker = new Faker(new Locale("en"));

    public String[] genters = {"Male", "Female", "Other"};
    public String[] months = {"January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"};
    public String[] subjects = {"Accounting", "Arts", "Biology", "Chemistry", "Civics",
            "Economics", "English", "Commerce", "Computer Science", "Physics",
            "Maths", "Hindi", "History", "Social Studies"};
    public String[] hobbies = {"Sports", "Reading", "Music"};
    public String[] pictures = {"139207535.jpg", "familySpy.png", "pikachu.jpg"};
    public String[] states = {"NCR", "Uttar Pradesh", "Haryana", "Rajasthan"};
    public String[] NCR = {"Delhi", "Gurgaon", "Noida"};
    public String[] Uttar_Pradesh = {"Agra", "Lucknow", "Merrut"};
    public String[] Haryana = {"Karnal", "Panipat"};
    public String[] Rajasthan = {"Jaipur", "Jaiselmer"};

    public String getRandomFirstName() {
        return faker.name().firstName();
    }

    public String getRandomLastName() {
        return faker.name().lastName();
    }

    public String getRandomUserEmail() {
        return faker.internet().emailAddress();
    }

    public String getRandomUserNumber() {
        return faker.phoneNumber().subscriberNumber(10);
    }

    public String getRandomCurrentAddress() {
        return faker.address().fullAddress();
    }

    public String getRandomGenterWrapper() {
        return faker.options().option(genters);
    }

    public String getRandomBirthDateDay() {
        return String.valueOf(faker.number().numberBetween(10, 28));
    }

    public String getRandomBirthDateMonth() {
        return faker.options().option(months);
    }

    public String getRandomBirthDateYear() {
        return String.valueOf(faker.number().numberBetween(1900, 2100));
    }

    public String getRandomSubjectsInput() {
        return faker.options().option(subjects);
    }

    public String getRandomHobbies() {
        return faker.options().option(hobbies);
    }

    public String getRandomUploadPicture() {
        return faker.options().option(pictures);
    }

    public String getRandomState() {
        return faker.options().option(states);
    }

    public String getRandomCity(String state) {
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

package sandbox;

import com.github.javafaker.Faker;

import java.util.Locale;
import java.util.Scanner;

public class Teststepik {
    public static void main(String[] args) {
//        Scanner q = new Scanner(System.in);
//        String w = q.nextLine();
//        String e = q.nextLine();
//        if (w.equals(e)) {
//            System.out.println("Access is granted");
//        }
//        else {
//            System.out.println("Access is denied");
//        }
//        //your code goes here
        Faker faker = new Faker(new Locale("en"));
        System.out.println(faker.name().fullName());
    }
}

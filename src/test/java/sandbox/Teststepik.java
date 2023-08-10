package sandbox;

import java.util.Scanner;

public class Teststepik {
    public static void main(String[] args) {
        Scanner q = new Scanner(System.in);
        String w = q.nextLine();
        String e = q.nextLine();
        if (w.equals(e)) {
            System.out.println("Access is granted");
        }
        else {
            System.out.println("Access is denied");
        }
        //your code goes here
    }
}

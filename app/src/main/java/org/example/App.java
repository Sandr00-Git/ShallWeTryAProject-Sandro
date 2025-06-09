package org.example;

import java.util.Scanner;

public class App {

    public static int getValidatedInput(Scanner scanner, int lower, int upper, String prompt, String errorMsg) {
        int input;
        while (true) {
            System.out.println(prompt);
            if (scanner.hasNextInt()) {
                input = scanner.nextInt();
                if (input >= lower && input <= upper) {
                    return input;
                } else {
                    System.out.println(errorMsg);
                }
            } else {
                System.out.println(errorMsg);
                scanner.next(); // clear invalid input
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = getValidatedInput(scanner, 0, 100, "Please enter a value", "Your value is invalid");
        System.out.println("The value chosen by the user is " + value);
        scanner.close();
    }
}

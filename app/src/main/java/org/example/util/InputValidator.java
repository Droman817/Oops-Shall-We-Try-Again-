package util;

import java.util.Scanner;

public class InputValidator {

    public static int getValidatedInt(int lowerBound, int upperBound, String prompt, String errorMessage) {
        Scanner scanner = new Scanner(System.in);
        int value;

        System.out.println(prompt);
        value = scanner.nextInt();

        while (value < lowerBound || value > upperBound) {
            System.out.println(errorMessage);
            System.out.println(prompt);
            value = scanner.nextInt();
        }

        return value;
    }
}
package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputDataHandler {

    public String valueFromUser(String valueToShow) {
        try {
            Scanner scanner = new Scanner(System.in);
            String valueFromUser;
            do {
                System.out.println(valueToShow);
                valueFromUser = scanner.nextLine();
                valueFromUser = valueFromUser.trim();
            } while (valueFromUser.isEmpty());
            return valueFromUser;
        } catch (Exception e) {
            throw new InputMismatchException();
        }
    }
}

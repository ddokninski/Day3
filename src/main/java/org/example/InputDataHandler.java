package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputDataHandler {

    public double getDoubleFromUser(String msg){
        try {
            Scanner scanner = new Scanner(System.in);
            double doubleFromUser;
            do {
                System.out.println(msg);
                doubleFromUser = scanner.nextDouble();
            } while (doubleFromUser <=0);
            return doubleFromUser;
        } catch (Exception e) {
            System.out.println("Incorrect employee Salary. Please enter them again");
//            throw new InputMismatchException();
        }
        return 0;
    }

    public int getIntFromUser(String msg){
        try {
            Scanner scanner = new Scanner(System.in);
            int intFromUser;
            do {
                System.out.println(msg);
                intFromUser = scanner.nextInt();
            } while (intFromUser <=0);
            return intFromUser;
        } catch (InputMismatchException e) {
            System.out.println("Option not available. Please try again");
//            throw new InputMismatchException();
        }
        return 0;
    }

    public String getTextFromUser(String msg) {
        try {
            Scanner scanner = new Scanner(System.in);
            String valueFromUser;
            do {
                System.out.println(msg);
                valueFromUser = scanner.nextLine().trim();
            } while (valueFromUser.isEmpty());
            return valueFromUser;
        } catch (Exception e) {
            System.out.println("Incorrect employee data. Please enter them again");
            throw new InputMismatchException();
        }
    }
}

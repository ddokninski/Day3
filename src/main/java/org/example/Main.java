package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        AddEmployee addEmployee = new AddEmployee();
        InputDataHandler inputDataHandler = new InputDataHandler();
        Company company = new Company();
        int employeesHandlerCounter = 1;

        while (employeesHandlerCounter >= 1) {
            addEmployee.addEmployee();
            employeesHandlerCounter--;
        }

        while (true) {
            String menuOption = inputDataHandler.valueFromUser(menu());
            boolean correctMenuOptionFromUserFlag = checkMenuValueFromUser(menuOption);

            if (correctMenuOptionFromUserFlag) {

                if (Integer.parseInt(menuOption) == 4) {
                    break;
                }

                switch (Integer.parseInt(menuOption)) {
                    case 1:
                        System.out.println("Sum of salary: " + company.getSumOfSalary(company.getEmployeeList()));
                        break;
                    case 2:
                        System.out.println(company.getEmployeeList());
                        break;
                    case 3:
                        addEmployee.addEmployee();
                        break;
                    case 4:
                        break;
                }
            }
        }
    }

    private static String menu() {
        return "1 – Print sum of all employees salary\n" +
                "\n" +
                "2 – Display all employees data\n" +
                "\n" +
                "3 – Add new employee\n" +
                "\n" +
                "4 – End program";
    }

    private static boolean checkMenuValueFromUser(String valueFromUser) {
        Pattern pattern = Pattern.compile("(1)|(2)|(3)|(4)");
        valueFromUser = valueFromUser.trim();
        Matcher matcher = pattern.matcher(valueFromUser);

        return matcher.matches();
    }

}
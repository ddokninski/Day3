package org.example;

public class Main {
    public static void main(String[] args) {
        EmployeeService employeeService = new EmployeeService();
        InputDataHandler inputDataHandler = new InputDataHandler();
        AppMenuService appMenuService = new AppMenuService();
        String menuOptions = """
                1 – Print sum of all employees salary

                2 – Display all employees data

                3 – Add new employee

                4 – End program""";
        int employeesHandlerCounter = 1;

        while (employeesHandlerCounter >= 1) {
            employeeService.addEmployee();
            employeesHandlerCounter--;
        }

        while (true) {
            String menuOptionFromUser = inputDataHandler.valueFromUserHandler(menuOptions);

            if ("4".equals(menuOptionFromUser)) {
                break;
            }

            try {
                appMenuService.menuAction(Integer.parseInt(menuOptionFromUser));
            } catch (NumberFormatException e) {
                System.out.println("Option not available. Please try again");
            }
        }
    }
}
package org.example;

public class Main {
    private final static String menuOptions = """
                1 – Print sum of all employees salary

                2 – Display all employees data

                3 – Add new employee

                4 – End program""";

    public static void main(String[] args) {
        Company company = new Company();

        InputDataHandler inputDataHandler = new InputDataHandler();
        EmployeeService employeeService = new EmployeeService(inputDataHandler, company);

        for (int i = 0; i < 1; i++) {
            employeeService.addEmployee();
        }

        while (true) {
            switch (inputDataHandler.getIntFromUser(menuOptions)) {
                case 1 -> System.out.println("Sum of salary: " + company.getSumOfSalary(company.getEmployeeList()));
                case 2 -> System.out.println(company.getEmployeeList());
                case 3 -> employeeService.addEmployee();
                case 4 -> System.exit(0);
            }
        }
    }
}
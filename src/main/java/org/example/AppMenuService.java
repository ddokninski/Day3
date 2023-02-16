package org.example;

public class AppMenuService {

    public void menu(int menuOption) {
        Company company = new Company();
        EmployeeService employeeService = new EmployeeService();

        switch (menuOption) {
            case 1:
                System.out.println("Sum of salary: " + company.getSumOfSalary(company.getEmployeeList()));
                break;
            case 2:
                System.out.println(company.getEmployeeList());
                break;
            case 3:
                employeeService.addEmployee();
                break;
            case 4:
                break;
        }
    }
}

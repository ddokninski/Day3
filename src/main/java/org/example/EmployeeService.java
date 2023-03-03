package org.example;

public class EmployeeService {
    InputDataHandler inputDataHandler;
    Company company;

    public EmployeeService(InputDataHandler inputDataHandler, Company company) {
        this.inputDataHandler = inputDataHandler;
        this.company = company;
    }

    public void addEmployee() {
        double salary = 0;

            String firstName = inputDataHandler.getTextFromUser("Employee first name: ");
            String lastName = inputDataHandler.getTextFromUser("Employee last name: ");
            while(salary == 0) {
                salary = inputDataHandler.getDoubleFromUser("Employee salary: ");
            }

            company.addEmployeeToList(new Employee(firstName, lastName, salary));
    }

}

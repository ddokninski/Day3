package org.example;

public class EmployeeService {

    InputDataHandler inputDataHandler = new InputDataHandler();
    Company company = new Company();

    public void addEmployee() {
        try {
            String firstName = inputDataHandler.valueFromUser("Employee first name: ");
            String lastName = inputDataHandler.valueFromUser("Employee last name: ");
            double salary = Double.parseDouble(inputDataHandler.valueFromUser("Employee salary: "));
            Employee employee = new Employee(firstName, lastName, salary);
            company.addEmployeeToList(employee);
        } catch (NumberFormatException e) {
            System.out.println("Incorrect employee data. Please enter them again");
            addEmployee();
        }
    }

}

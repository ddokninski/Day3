package org.example;

public class EmployeeService {

    InputDataHandler inputDataHandler = new InputDataHandler();
    Company company = new Company();

    public void addEmployee() {
        try {
            String firstName = inputDataHandler.valueFromUserHandler("Employee first name: ");
            String lastName = inputDataHandler.valueFromUserHandler("Employee last name: ");
            double salary = Double.parseDouble(inputDataHandler.valueFromUserHandler("Employee salary: "));
            Employee employee = new Employee(firstName, lastName, salary);
            company.addEmployeeToList(employee);
        } catch (NumberFormatException e) {
            System.out.println("Incorrect employee data. Please enter them again");
            addEmployee();
        }
    }

}

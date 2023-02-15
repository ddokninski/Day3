package org.example;

import java.util.ArrayList;
import java.util.List;

public class Company {

    private static final List<Employee> employeeList = new ArrayList<>();

    public void addEmployeeToList(Employee employee) {
        employeeList.add(employee);
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public double getSumOfSalary(List<Employee> employeeList) {
        double sumOfSalary = 0;
        for (Employee employee : employeeList) {
            sumOfSalary += employee.getSalary();
        }
        return sumOfSalary;
    }
}

package com.Amit.RESTAPI.resource;

import java.util.ArrayList;
import java.util.List;

public class EmployeManager {

    private Employees employees;

    public EmployeManager() {
        // Create Employee objects
        Employee emp1 = new Employee();
        emp1.setEmployeeId(101L);
        emp1.setFirstName("Amit");
        emp1.setLastName("Adhikari");
        emp1.setEmail("amit@example.com");
        emp1.setTitle("Software Developer");

        Employee emp2 = new Employee();
        emp2.setEmployeeId(102L);
        emp2.setFirstName("Priya");
        emp2.setLastName("Sharma");
        emp2.setEmail("priya@example.com");
        emp2.setTitle("Project Manager");

        Employee emp3 = new Employee();
        emp3.setEmployeeId(103L);
        emp3.setFirstName("Rahul");
        emp3.setLastName("Kumar");
        emp3.setEmail("rahul@example.com");
        emp3.setTitle("QA Engineer");

        // Add employees to a list
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);

        // Initialize Employees wrapper
        employees = new Employees();
        employees.setEmployeeList(employeeList);
    }

    // Getter for Employees
    public Employees getEmployees() {
        return employees;
    }
}

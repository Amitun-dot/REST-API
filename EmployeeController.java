package com.Amit.RESTAPI.controller;

import com.Amit.RESTAPI.resource.EmployeManager;
import com.Amit.RESTAPI.resource.Employees;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    private final EmployeManager employeeManager;

    public EmployeeController() {
        this.employeeManager = new EmployeManager();
    }

    // GET endpoint to return all employees
    @GetMapping("/employees")
    public Employees getAllEmployees() {
        return employeeManager.getEmployees();
    }
}

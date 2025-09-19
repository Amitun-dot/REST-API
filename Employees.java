package com.Amit.RESTAPI.resource;

import java.util.List;

public class Employees {
    private List<Employee> employeeList;

    // Getter
    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    // Setter
    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }
}

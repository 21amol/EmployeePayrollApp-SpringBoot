package com.example.employeepayrollappspringboot.Model;

import com.example.employeepayrollappspringboot.DTO.EmployeePayrollDTO;




public class EmployeePayrollData {
    private int employeeID;
    private String name;
    private int salary;

    public EmployeePayrollData(){}


    public EmployeePayrollData(int empID, EmployeePayrollDTO employeePayrollDTO) {
        this.employeeID = empID;
        this.name = employeePayrollDTO.name;
        this.salary = employeePayrollDTO.salary;
    }


    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}

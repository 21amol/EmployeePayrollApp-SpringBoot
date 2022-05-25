package com.example.employeepayrollappspringboot.Model;

import com.example.employeepayrollappspringboot.DTO.EmployeePayrollDTO;
import lombok.Data;

import java.util.List;


@Data
public class EmployeePayrollData {
    private int employeeID;
    private String name;
    private int salary;
    private String gender;
    private String joiningDate;
    private String note;
    private String profilePic;
    private List<String> department;

    public EmployeePayrollData(){}

    public EmployeePayrollData(int empID, EmployeePayrollDTO employeePayrollDTO) {
        this.employeeID = empID;
        this.name = employeePayrollDTO.name;
        this.salary = employeePayrollDTO.salary;
        this.gender = employeePayrollDTO.gender;
        this.note = employeePayrollDTO.note;
        this.joiningDate = employeePayrollDTO.joiningDate;
        this.profilePic = employeePayrollDTO.profilePic;
        this.department = employeePayrollDTO.department;
    }

       // No need to write setters and getters as we have added @Data annotation.

//    public int getEmployeeID() {
//        return employeeID;
//    }
//
//    public void setEmployeeID(int employeeID) {
//        this.employeeID = employeeID;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getSalary() {
//        return salary;
//    }
//
//    public void setSalary(int salary) {
//        this.salary = salary;
//    }

}

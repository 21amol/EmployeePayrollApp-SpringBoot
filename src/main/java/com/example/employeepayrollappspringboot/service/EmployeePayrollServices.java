package com.example.employeepayrollappspringboot.service;

import com.example.employeepayrollappspringboot.DTO.EmployeePayrollDTO;
import com.example.employeepayrollappspringboot.Model.EmployeePayrollData;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeePayrollServices {

  public List<EmployeePayrollData> getEmployeePayrollData() {
    List<EmployeePayrollData> employeeDataList = new ArrayList<>();
    employeeDataList.add(new EmployeePayrollData(1, new EmployeePayrollDTO("Cech", 1000)));
    return employeeDataList;
  }

  public EmployeePayrollData getEmployeePayrollDataById(int empID) {
    EmployeePayrollData employeePayrollData;
    employeePayrollData = new EmployeePayrollData(empID, new EmployeePayrollDTO("Amol", 5000));
    return employeePayrollData;
  }

  public EmployeePayrollData addEmployeePayrollData(EmployeePayrollDTO employeePayrollDTO) {
    EmployeePayrollData employeePayrollData;
    employeePayrollData = new EmployeePayrollData(2, employeePayrollDTO);
    return employeePayrollData;
  }

  public EmployeePayrollData updateEmployeeData(int empID, EmployeePayrollDTO employeePayrollDTO) {
    EmployeePayrollData employeePayrollData;
    employeePayrollData = new EmployeePayrollData(empID, employeePayrollDTO);
    return employeePayrollData;
  }

  public void deleteEmployeePayrollData(int empID) {

  }
}

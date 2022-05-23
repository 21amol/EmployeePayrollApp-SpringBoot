package com.example.employeepayrollappspringboot.service;

import com.example.employeepayrollappspringboot.DTO.EmployeePayrollDTO;
import com.example.employeepayrollappspringboot.Model.EmployeePayrollData;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeePayrollServices {

  List<EmployeePayrollData> employeeDataList = new ArrayList<>();

  public List<EmployeePayrollData> getEmployeePayrollData() {
    //  employeeDataList.add(new EmployeePayrollData(1, new EmployeePayrollDTO("Cech", 1000)));
    return employeeDataList;
  }

  public EmployeePayrollData getEmployeePayrollDataById(int empID) {
//    EmployeePayrollData employeePayrollData;
//    employeePayrollData = new EmployeePayrollData(empID, new EmployeePayrollDTO("Amol", 5000));
    return employeeDataList.get(empID-1);
  }

  public EmployeePayrollData addEmployeePayrollData(EmployeePayrollDTO employeePayrollDTO) {
    EmployeePayrollData employeePayrollData;
    employeePayrollData = new EmployeePayrollData(employeeDataList.size()+1, employeePayrollDTO);
    employeeDataList.add(employeePayrollData);
    return employeePayrollData;
  }

  public EmployeePayrollData updateEmployeeData(int empID, EmployeePayrollDTO employeePayrollDTO) {
    EmployeePayrollData employeePayrollData = this.getEmployeePayrollDataById(empID);
    employeePayrollData.setName(employeePayrollDTO.name);
    employeePayrollData.setSalary(employeePayrollDTO.salary);
    employeeDataList.set(empID-1, employeePayrollData);
    return employeePayrollData;
  }

  public void deleteEmployeePayrollData(int empID) {
    employeeDataList.remove(empID-1);
  }

}

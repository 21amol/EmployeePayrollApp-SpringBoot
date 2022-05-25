package com.example.employeepayrollappspringboot.service;

import com.example.employeepayrollappspringboot.DTO.EmployeePayrollDTO;
import com.example.employeepayrollappspringboot.Model.EmployeePayrollData;
import com.example.employeepayrollappspringboot.exceptions.EmployeePayrollException;
import com.example.employeepayrollappspringboot.repository.EmployeePayrollRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class EmployeePayrollServices {

  @Autowired
  EmployeePayrollRepo employeePayrollRepo;

  List<EmployeePayrollData> employeeDataList = new ArrayList<>();

  public List<EmployeePayrollData> getEmployeePayrollData() {
    return employeeDataList;
  }

  public EmployeePayrollData getEmployeePayrollDataById(int empID) {
    return employeeDataList.stream().filter(employeePayrollData -> employeePayrollData.getEmployeeID() == empID)
            .findFirst().orElseThrow(() -> new EmployeePayrollException("Employee Id not Found!!!"));
  }

  public EmployeePayrollData addEmployeePayrollData(EmployeePayrollDTO employeePayrollDTO) {
    EmployeePayrollData employeePayrollData;
    employeePayrollData = new EmployeePayrollData(employeePayrollDTO);
    employeeDataList.add(employeePayrollData);
    return employeePayrollRepo.save(employeePayrollData);
  }

  public EmployeePayrollData updateEmployeeData(int empID, EmployeePayrollDTO employeePayrollDTO) {
    EmployeePayrollData employeePayrollData = this.getEmployeePayrollDataById(empID);
    employeePayrollData.setName(employeePayrollDTO.name);
    employeePayrollData.setSalary(employeePayrollDTO.salary);

    employeeDataList.set(empID - 1, employeePayrollData);
    return employeePayrollData;
  }

  public void deleteEmployeePayrollData(int empID) {
    employeeDataList.remove(empID - 1);
  }

}

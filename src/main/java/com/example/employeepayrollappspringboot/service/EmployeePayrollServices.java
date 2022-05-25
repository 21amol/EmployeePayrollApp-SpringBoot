package com.example.employeepayrollappspringboot.service;

import com.example.employeepayrollappspringboot.DTO.EmployeePayrollDTO;
import com.example.employeepayrollappspringboot.Model.EmployeePayrollData;
import com.example.employeepayrollappspringboot.exceptions.EmployeePayrollException;
import com.example.employeepayrollappspringboot.repository.EmployeePayrollRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class EmployeePayrollServices {

  @Autowired
  EmployeePayrollRepo employeePayrollRepo;

  public List<EmployeePayrollData> getEmployeePayrollData() {
    return employeePayrollRepo.findAll();
  }

  public EmployeePayrollData getEmployeePayrollDataById(int empID) {
    return employeePayrollRepo.findById(empID)
            .orElseThrow(() -> new EmployeePayrollException("Employee Id not Found!!!"));
  }

  public EmployeePayrollData addEmployeePayrollData(EmployeePayrollDTO employeePayrollDTO) {
    EmployeePayrollData employeePayrollData;
    employeePayrollData = new EmployeePayrollData(employeePayrollDTO);
    return employeePayrollRepo.save(employeePayrollData);
  }

  public EmployeePayrollData updateEmployeeData(int empID, EmployeePayrollDTO employeePayrollDTO) {
    EmployeePayrollData employeePayrollData = this.getEmployeePayrollDataById(empID);
    employeePayrollData.updateData(employeePayrollDTO);
    return employeePayrollRepo.save(employeePayrollData);
  }

  public void deleteEmployeePayrollData(int empID) {
    EmployeePayrollData employeePayrollData = this.getEmployeePayrollDataById(empID);
    employeePayrollRepo.delete(employeePayrollData);
  }

  public List<EmployeePayrollData> getEmployeeByDepartment(String department) {
    return employeePayrollRepo.findEmployeeByDepartment(department);
  }

}

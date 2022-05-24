package com.example.employeepayrollappspringboot.controller;

import com.example.employeepayrollappspringboot.DTO.EmployeePayrollDTO;
import com.example.employeepayrollappspringboot.DTO.ResponseDTO;
import com.example.employeepayrollappspringboot.Model.EmployeePayrollData;
import com.example.employeepayrollappspringboot.service.EmployeePayrollServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/employeepayroll")
public class EmployeePayrollController {

    @Autowired
    EmployeePayrollServices employeePayrollServices;

    @RequestMapping(value = {" ", "/get"})
    public ResponseEntity<ResponseDTO> getEmployeePayrollData() {
        List<EmployeePayrollData> employeePayrollDataList = employeePayrollServices.getEmployeePayrollData();
        ResponseDTO responseDTO = new ResponseDTO("Success Call!!!", employeePayrollDataList);
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }

    @GetMapping(value = {" ", "/get/{empID}"})
    public ResponseEntity<ResponseDTO> getEmployeePayrollData(@PathVariable int empID) {
        EmployeePayrollData employeePayrollData = employeePayrollServices.getEmployeePayrollDataById(empID);
        ResponseDTO responseDTO = new ResponseDTO("Success Call for ID!!!", employeePayrollData);
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }

    @PostMapping(value = {" ", "/add"})
    public ResponseEntity<ResponseDTO> addEmployeePayrollData(@RequestBody EmployeePayrollDTO employeePayrollDTO) {
        EmployeePayrollData employeePayrollData;
        employeePayrollData = employeePayrollServices.addEmployeePayrollData(employeePayrollDTO);
        ResponseDTO responseDTO = new ResponseDTO("Created Data Successfully!!!", employeePayrollData);
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }

    @PutMapping(value = {" ", "/edit/{empID}"})
    public ResponseEntity<ResponseDTO> updateEmployeePayrollData(@PathVariable int empID,
                                                                 @RequestBody EmployeePayrollDTO employeePayrollDTO) {
        EmployeePayrollData employeePayrollData;
        employeePayrollData = employeePayrollServices.updateEmployeeData(empID, employeePayrollDTO);
        ResponseDTO responseDTO = new ResponseDTO("Data Updated Successfully!!!", employeePayrollData);
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }

    @DeleteMapping(value = {" ", "/remove/{empID}"})
    public ResponseEntity<ResponseDTO> deleteEmployeePayrollData(@PathVariable int empID) {
        employeePayrollServices.deleteEmployeePayrollData(empID);
        ResponseDTO responseDTO = new ResponseDTO("Data Deleted Successfully!!!","Deleted ID: " + empID);
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }
}

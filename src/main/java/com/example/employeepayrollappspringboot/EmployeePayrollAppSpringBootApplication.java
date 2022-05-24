package com.example.employeepayrollappspringboot;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class EmployeePayrollAppSpringBootApplication {

  public static void main(String[] args) {
    SpringApplication.run(EmployeePayrollAppSpringBootApplication.class, args);
    log.info("Employee Payroll Application Started!!!");
    System.out.println("Welcome to Employee Payroll Application.");
  }

}

package com.example.employeepayrollappspringboot.exceptions;

public class EmployeePayrollException extends RuntimeException {               //Custom Exception Class

  public EmployeePayrollException(String message) {
    super(message);
  }
}

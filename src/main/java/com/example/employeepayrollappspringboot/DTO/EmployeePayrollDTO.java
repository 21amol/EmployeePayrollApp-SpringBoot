package com.example.employeepayrollappspringboot.DTO;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.ToString;

import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import java.util.List;

@ToString
public class EmployeePayrollDTO {
  @Pattern(regexp = "^[A-Z]{1}[A-Za-z\\s]{1,}$", message = "Invalid Name")      // if fails then, message will appear.
  public String name;

  @Min(value = 500, message = "Salary should be more than 500")
  public int salary;

  public String gender;

 // @JsonFormat(pattern = "dd MMM yyyy")        // @JsonFormat is used when, LocalDate as a Data Type is used.
  public String joiningDate;

  public String note;

  public String profilePic;

  public List<String> department;


//    public EmployeePayrollDTO(String name, int salary) {
//        this.name = name;
//        this.salary = salary;
//    }

//    @Override
//    public String toString() {
//        return "EmployeePayrollDTO{" +
//                "name='" + name + '\'' +
//                ", salary=" + salary +
//                '}';
//    }
}

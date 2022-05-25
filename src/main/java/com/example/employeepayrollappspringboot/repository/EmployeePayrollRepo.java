package com.example.employeepayrollappspringboot.repository;

import com.example.employeepayrollappspringboot.Model.EmployeePayrollData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface EmployeePayrollRepo extends JpaRepository<EmployeePayrollData, Integer> {

 //  Custom Query
  @Query(value = "select * from employee_payroll, employee_department where emp_id = id and department = :department",nativeQuery = true)
  List<EmployeePayrollData> findEmployeeByDepartment(String department);
}

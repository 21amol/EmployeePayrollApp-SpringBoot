package com.example.employeepayrollappspringboot.repository;

import com.example.employeepayrollappspringboot.Model.EmployeePayrollData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmployeePayrollRepo extends JpaRepository<EmployeePayrollData, Integer> {


}

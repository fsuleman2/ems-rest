package com.demo.ems.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.demo.ems.dto.EmployeeDTO;
import com.demo.ems.model.Employee;

public interface EmployeeService {
public EmployeeDTO getEmplpyeeDetailById(Long Id);
public EmployeeDTO addEmployeeDetails(Employee employee);
public EmployeeDTO updateEmployeeDetailsById(Employee employee);
public EmployeeDTO updateEmplpyeeSalaryById(Long id, Long salary);
public String deleteEmployeeByID(Long empId);
public List<EmployeeDTO> getAllEmployeeDetails();
}

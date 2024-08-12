package com.demo.ems.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.ems.dto.EmployeeDTO;
import com.demo.ems.model.Employee;
import com.demo.ems.service.EmployeeService;

@RestController
@RequestMapping("/ems/")
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;

	@GetMapping("hello")
	public String test() {
		return "Hello World";
	}
	@GetMapping("/id/{empId}")
	public EmployeeDTO getEmployeeById(@PathVariable Long empId) {
		return employeeService.getEmplpyeeDetailById(empId);
	}
	@GetMapping("/")
	public ResponseEntity<List<EmployeeDTO>> getAllEmployees() {
		return ResponseEntity.ok(employeeService.getAllEmployeeDetails());
	}
	@PostMapping("/")
	public EmployeeDTO addEmployeeDetails(@RequestBody Employee employee) {
		return employeeService.addEmployeeDetails(employee);
	}
	@PutMapping("/")
	public EmployeeDTO updateEmployeeDetails(@RequestBody Employee employee) {
		return employeeService.updateEmployeeDetailsById(employee);
	}
	@PutMapping("/id/{empId}/salary")
	public ResponseEntity<EmployeeDTO> updateEmplpyeeSalaryById(@PathVariable Long empId, @RequestParam  Long empSalary) {
		return ResponseEntity.ok(employeeService.updateEmplpyeeSalaryById(empId, empSalary));
		
	}
	
	@DeleteMapping("/id/{empId}")
	public ResponseEntity<String> deleteEmployeeDetailsById(@PathVariable Long empId){
		return ResponseEntity.ok(employeeService.deleteEmployeeByID(empId));
	}
	
//https://stackoverflow.com/questions/32367501/what-is-the-difference-between-pathparam-and-pathvariable
}

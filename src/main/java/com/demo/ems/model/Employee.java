package com.demo.ems.model;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Component
public class Employee {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long empId;
private String empName;
private String empAddress;
private Long empSalary;
public Employee() {
}
public Long getEmpId() {
	return empId;
}
public void setEmpId(Long empId) {
	this.empId = empId;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public String getEmpAddress() {
	return empAddress;
}
public void setEmpAddress(String empAddress) {
	this.empAddress = empAddress;
}
public Long getEmpSalary() {
	return empSalary;
}
public void setEmpSalary(Long empSalary) {
	this.empSalary = empSalary;
}
public Employee(Long empId, String empName, String empAddress, Long empSalary) {
	super();
	this.empId = empId;
	this.empName = empName;
	this.empAddress = empAddress;
	this.empSalary = empSalary;
}
@Override
public String toString() {
	return "Employee [empId=" + empId + ", empName=" + empName + ", empAddress=" + empAddress + ", empSalary="
			+ empSalary + "]";
}

}

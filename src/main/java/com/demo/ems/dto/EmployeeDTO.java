package com.demo.ems.dto;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.demo.ems.model.Employee;
@Component
public class EmployeeDTO {
    private Long empId;
    private String empName;
    private String empAddress;
    private Long empSalary;
    public EmployeeDTO() {
	}

	public EmployeeDTO(Long empId2, String empName2, String empAddress2, Long empSalary2) {
		this.empId = empId2;
		this.empName = empName2;
		this.empAddress = empAddress2;
		this.empSalary = empSalary2;
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

	public EmployeeDTO toDTO(Employee employee) {
        if (employee == null) {
            return null;
        }
        
        return new EmployeeDTO(
            employee.getEmpId(),
            employee.getEmpName(),
            employee.getEmpAddress(),
            employee.getEmpSalary()
        );
    }
	public List<EmployeeDTO> toDTOList(List<Employee> employees){
		List<EmployeeDTO> empList = new ArrayList<>();
		for(Employee employee: employees) {
			empList.add(new EmployeeDTO(employee.getEmpId(), employee.getEmpName(), employee.getEmpAddress(), employee.getEmpSalary()));
		}
		return empList;
		
	}

}

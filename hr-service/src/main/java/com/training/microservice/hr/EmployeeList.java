package com.training.microservice.hr;

import java.util.List;

public class EmployeeList {
	private List<Employee> employee;

	public List<Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}

	public EmployeeList() {

	}

	public EmployeeList(List<Employee> employee) {
		super();
		this.employee = employee;
	}

}

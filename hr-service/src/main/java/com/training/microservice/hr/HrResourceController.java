package com.training.microservice.hr;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hr")
public class HrResourceController {

	List<Employee> employee = Arrays.asList(new Employee("E1", "Sudhir", "Gupta", "MedTech"),
			new Employee("E2", "Ram", "Kumar", "Surgery"), new Employee("E3", "Raj", "Kumar", "Pharmacy"),
			new Employee("E4", "Anil", "K", "Dentist"));

	@RequestMapping("/employees")
	public EmployeeList getEmployees() {
		EmployeeList employeeList = new EmployeeList();
		employeeList.setEmployee(employee);
		return employeeList;
	}

	@RequestMapping("/employees/{id}")
	public Employee getEmployeeById(@PathVariable("id") String id) {
		Employee e = employee.stream().filter(emp -> emp.getId().equals(id)).findAny().orElse(null);
		return e;
	}

}

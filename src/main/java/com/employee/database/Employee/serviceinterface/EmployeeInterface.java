package com.employee.database.Employee.serviceinterface;

import java.util.List;

import com.employee.database.Employee.model.Employee;

// we will add some methods to add,update,insert,delete and get all records from database


public interface EmployeeInterface {

	// to save new Employee
	
	public Employee saveEmployee(Employee employee);
	
	// to update the Employee table
	
	public Employee updateEmployee(Employee employee);
	
	// to fetch data from the Employee table
	
	public List<Employee> findAllEmployees();
	
	
	//to delete Employee
	
	public void deleteEmployee(int id);
	
}

package com.employee.database.Employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.database.Employee.model.Employee;
import com.employee.database.Employee.serviceImplementation.EmployeeServiceImpl;

@RestController

//We are using Postman for doing for that we need to add cross orgin annotation

@CrossOrigin("*")
public class HomeController {
	
	
	// We are creating a bean of the implemtation class
	@Autowired
	private  EmployeeServiceImpl employeeServiceImpl;

	
	//To call save Employee or save a new Employee
	
	@PostMapping(value="saveEmployee")
	public Employee saveEmployee(@RequestBody Employee employee){
		
		//Try to see if it works
		System.out.println("the save employee working pproperly");
		
		employeeServiceImpl.saveEmployee(employee);
	return employee;
}
	
	// to find all students from database
	
	@GetMapping(value="getAllEmployees")
	public List<Employee> getAllEmployee()
	{
		return employeeServiceImpl.findAllEmployees();
		
		//save it
	}
	
	@PutMapping("updateEmployee")
	public Employee updateEmpoyee(@RequestBody Employee employee)
	{
		return employeeServiceImpl.updateEmployee(employee);
	}
	
	//delete the employee
	
	@DeleteMapping("deleteEmployee")
	public String deleteEmployee(@RequestParam int id)
	{
		employeeServiceImpl.deleteEmployee(id);
		
		return "Employee deleted";
	}
	
}
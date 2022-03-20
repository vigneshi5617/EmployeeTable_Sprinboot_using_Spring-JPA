package com.employee.database.Employee.serviceImplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.database.Employee.dao.EmployeeRepository;
import com.employee.database.Employee.model.Employee;
import com.employee.database.Employee.serviceinterface.EmployeeInterface;

@Service
public class EmployeeServiceImpl implements EmployeeInterface {

	
	
	@Autowired
	private EmployeeRepository employeeRespo;
	
	@Override
	public Employee saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRespo.save(employee);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		
		//Same method to save a employee and and update the employee
		return employeeRespo.save(employee);
	}

	@Override
	public List<Employee> findAllEmployees() {
		// TODO Auto-generated method stub
		
		
		// it returns a list so casting is needed
		return (List<Employee>) employeeRespo.findAll();
		
		
		
		
	}

	@Override
	public void deleteEmployee(int id) {
		// TODO Auto-generated method stub
		
		//to delete a employee
		employeeRespo.deleteById(id);		
	}

}

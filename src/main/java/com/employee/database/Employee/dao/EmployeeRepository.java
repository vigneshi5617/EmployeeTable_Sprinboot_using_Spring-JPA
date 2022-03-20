package com.employee.database.Employee.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.employee.database.Employee.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

}

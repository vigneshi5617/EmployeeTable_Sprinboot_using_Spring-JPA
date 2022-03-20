package com.employee.database.Employee.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee_table", catalog="employee_database" )
public class Employee {

	
	@Id
	private int id;                         //@GeneratedValue(strategy=GenerationType.AUTO)
	private int empid;
	private String nameofPerson;
	private String address;
	private String dept;
	
	//Run application if db connection is properly done
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, int empid, String nameofPerson, String address, String dept) {
		super();
		this.id = id;
		this.empid = empid;
		this.nameofPerson = nameofPerson;
		this.address = address;
		this.dept = dept;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getNameofPerson() {
		return nameofPerson;
	}

	public void setNameofPerson(String nameofPerson) {
		this.nameofPerson = nameofPerson;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

		
	



	
	
}

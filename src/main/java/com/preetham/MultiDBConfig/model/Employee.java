package com.preetham.MultiDBConfig.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
	@Id
	@Column(name="emp_id")
	private Integer id;
	@Column(name="emp_name")
	private String name;
	@Column(name="emp_salary")
	private Double salary;
	@Column(name="department_id")
	private Integer dept_id;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public Integer getDept_id() {
		return dept_id;
	}
	public void setDept_id(Integer dept_id) {
		this.dept_id = dept_id;
	}
	public Employee(Integer id, String name, Double salary, Integer dept_id) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.dept_id = dept_id;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", salary=" + salary + ", dept_id=" + dept_id + "]";
	}
	

}

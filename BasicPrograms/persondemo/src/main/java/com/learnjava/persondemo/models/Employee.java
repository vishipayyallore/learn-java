package com.learnjava.persondemo.models;


import java.time.LocalDate;
import java.util.UUID;

import com.learnjava.common.IEmployee;

/**
 * @author Viswanatha Swamy
 *
 */
public class Employee implements IEmployee {

	public UUID Id = UUID.randomUUID();
	
	public String FirstName;
	
	public String LastName;
	
	public byte Age;
	
	public float Salary;
	
	public static String Department;
	
	public Project ProjectAssigned;
	
	
	public Employee(){
		System.out.println("***** Employee Constructor *****");
	}
	
	public Employee(String firstName) {
		this();
		System.out.println("***** Employee Parameterized Constructor *****");
		FirstName = firstName;
	}
	
	// Instance Initializer Block
	{ 
		System.out.println("---------- Instance Initializer Block of Employee ----------");
		FirstName = "Employee First Name";
		LastName = "Employee Last Name";
		Age = 21;
		Salary = 25000.00f;
		Department = "IT";
		
		ProjectAssigned = new Project("Distributed Cache", LocalDate.of(2019, 12, 01));
	}
	
	public void DescribeJob() {
		System.out.println("\n\n***** Employee Job Profile ******");
		System.out.println("1. Software Development");
	}
	
	@Override
    public String toString() {
        return String.format("Employee [Id: %s, Name: %s, Age: %d, Salary = %f Department = %s \n\tAssigned Project = %s]", 
        		Id, FirstName, Age, Salary, Department, ProjectAssigned);
    }
	
}

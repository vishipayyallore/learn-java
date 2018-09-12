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
	
	public String FirstName = "No Name";
	
	public String LastName = "No Name";
	
	public byte Age = 18;
	
	public float Salary = 25000.00f;
	
	public static String Department = "IT";
	
	public Project ProjectAssigned = new Project();
	
	
	public Employee(){
		System.out.println("***** Employee Constructor *****");
	}
	
	public Employee(String firstName) {
		this();
		System.out.println("***** Employee Parameterized Constructor *****");
		FirstName = firstName;
	}
	
	{ 
		System.out.println("---------- Instance Initializer Block of Employee ----------");
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

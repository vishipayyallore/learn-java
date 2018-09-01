package com.learnjava.persondemo.models;


import java.util.UUID;

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
	
	@Override
    public String toString() {
        return String.format("Person [Id: %s, Name: %s, Age: %d, Salary = %f]", Id, FirstName, Age, Salary);
    }
}

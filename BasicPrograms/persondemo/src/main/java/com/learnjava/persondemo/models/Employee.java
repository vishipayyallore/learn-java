package com.learnjava.persondemo.models;


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
	
	@Override
    public String toString() {
        return String.format("Employee [Id: %s, Name: %s, Age: %d, Salary = %f]", Id, FirstName, Age, Salary);
    }
}

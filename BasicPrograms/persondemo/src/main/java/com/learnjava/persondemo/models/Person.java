/**
 * 
 */
package com.learnjava.persondemo.models;

import java.util.UUID;

/**
 * @author Viswanatha Swamy
 *
 */
public class Person {

	public UUID Id = UUID.randomUUID();
	
	public String Name = "No Name";
	
	public byte Age = 18;
	
	public float Salary = 25000.00f;
	
	@Override
    public String toString() {
        return String.format("Person Details----- \nId = %s \nName = %s \nAge = %d \nSalary = %f", Id, Name, Age, Salary);
    }
}

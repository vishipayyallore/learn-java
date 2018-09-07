/**
 * 
 */
package com.learnjava.persondemo.models;

/**
 * @author Viswanatha Swamy
 *
 */
public class SoftwareEngineer extends Employee {
	public float Bonus = 2500.00f;
	
	@Override
    public String toString() {
        return String.format("SoftwareEngineer [Id: %s, Name: %s, Age: %d, Salary: %f Department: %s Bonus: %f]", 
        		Id, FirstName, Age, Salary, Department, Bonus);
    }
}

/**
 * 
 */
package com.learnjava.persondemo.models;

/**
 * @author Viswanatha Swamy
 *
 */
public class Programmer extends Employee {

	public float Bonus = 2500.00f;
	
	public void DescribeJob() {
		System.out.println("\n\n***** Programmer Job Profile ******");
		System.out.println("1. Coding");
		System.out.println("2. Unit Testing");
	}

	@Override
    public String toString() {
        return String.format("Programmer [Id: %s, Name: %s, Age: %d, Salary: %f Department : %s Bonus: %f Assigned = %s]", 
        		Id, FirstName, Age, Salary, Department, Bonus, ProjectAssigned);
    }
}

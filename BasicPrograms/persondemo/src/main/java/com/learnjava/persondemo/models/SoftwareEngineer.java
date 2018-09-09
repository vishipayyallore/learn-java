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
	
	public void DescribeJob() {
		System.out.println("\n\n***** Software Engineer Job Profile ******");
		System.out.println("1. Writing Spec Document");
		System.out.println("2. Coding");
		System.out.println("3. Unit Testing");
		System.out.println("4. Manual Testing");
	}

	@Override
    public String toString() {
        return String.format("SoftwareEngineer [Id: %s, Name: %s, Age: %d, Salary: %f Department: %s Bonus: %f]", 
        		Id, FirstName, Age, Salary, Department, Bonus);
    }
}

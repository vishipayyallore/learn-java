/**
 * 
 */
package com.learnjava.common;

/**
 * @author Viswanatha Swamy
 *
 */
public class EmployeeHelper {

	public EmployeeHelper DisplayEmployeeDetails(IEmployee employee) {
		System.out.println(employee);
		return this;
	}
	
	
	public EmployeeHelper DiscribeEmployeeJobProfile(IEmployee employee) {
		employee.DescribeJob();
		return this;
	}
}

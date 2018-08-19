/**
 * 
 */
package com.learnjava.models;

/**
 * @author Viswanatha Swamy
 *
 */
public class Person implements IPerson {
	public int Id = 000;
	public String Name = "Un-Known";
	
	
	public Person(int id, String name) {
		Id = id;
		Name = name;
	}
}

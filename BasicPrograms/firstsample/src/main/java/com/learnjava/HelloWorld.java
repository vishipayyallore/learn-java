/**
 * 
 */
package com.learnjava;

import com.learnjava.models.Person;

/**
 * @author Viswanatha Swamy
 *
 */
public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Shiva Sai!");
		var person = new Person(101, "Shiva Sai");
		
		System.out.println("Id : " + person.Id);
		System.out.println("Name : " + person.Name);
	}

}

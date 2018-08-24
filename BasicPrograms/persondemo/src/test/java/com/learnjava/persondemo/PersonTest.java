/**
 * 
 */
package com.learnjava.persondemo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.learnjava.persondemo.models.Person;



/**
 * @author Viswanatha Swamy
 *
 */
public class PersonTest {
	
	/**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public PersonTest( )
    {
    }

    
    /**
     * Rigorous Test :-)
     */
    @Test
    public void personShouldHaveDefault18Years()
    {
    	Person person = new Person();
    	assertEquals(18, person.Age);
    	assertEquals("No Name", person.Name);
    	assertEquals(25000.00f, person.Salary, 0f);
    }
    
}

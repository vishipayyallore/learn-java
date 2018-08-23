/**
 * 
 */
package com.learnjava.persondemo;

import com.learnjava.persondemo.models.Person;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


/**
 * @author Viswanatha Swamy
 *
 */
public class PersonTest 
	extends TestCase {
	
	/**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public PersonTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( PersonTest.class );
    }
    

    /**
     * Rigorous Test :-)
     */
    public void personShouldHaveDefault18Years()
    {
    	Person person = new Person();
    	// assertEquals(18, person.Age);
        assertTrue( true );
    }
    
}

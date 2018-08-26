package com.learnjava.persondemo;

import com.learnjava.persondemo.models.Person;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Person person = new Person();
        String personDetails = String.format("Person Details----- \nId = %s \nName = %s \nAge = %d \nSalary = %f", person.Id, person.Name, person.Age, person.Salary);
        System.out.println(personDetails);
        
        System.out.println(String.format("------ Person.ToString() ------ \n%s", person));
        
        person.Age = 37;
        System.out.println(String.format("Person Age: %d", person.Age));
    }
}

package com.learnjava.persondemo;

import java.util.Scanner;

import com.learnjava.common.EmployeeHelper;
import com.learnjava.common.IEmployee;
import com.learnjava.persondemo.models.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Employee employee1 = new Employee();
        System.out.println(employee1);
        
        Employee employee2 = new Employee("Sri Vari");
        System.out.println(employee2);
        
        Person person = new Person();
        String personDetails = String.format("Person Details----- \nId = %s \nName = %s \nAge = %d \nSalary = %f", person.Id, person.Name, person.Age, person.Salary);
        System.out.println(personDetails);
        
        System.out.println(String.format("------ Person.ToString() ------ \n%s", person));
        
        person.Age = 37;
        System.out.println(String.format("Person Age: %d", person.Age));

        // Added Chaining
        System.out.println("Display of Employee using Helper Class add Chaining too.");
        EmployeeHelper employeeHelper = new EmployeeHelper();
        
        Programmer programmer1 = new Programmer();
        SoftwareEngineer softwareEngineer1 = new SoftwareEngineer();
        
        employeeHelper
        	.DisplayEmployeeDetails(employee2)
        	.DiscribeEmployeeJobProfile(employee2)
        	.DisplayEmployeeDetails(programmer1)
        	.DiscribeEmployeeJobProfile(programmer1)
        	.DisplayEmployeeDetails(softwareEngineer1)
        	.DiscribeEmployeeJobProfile(softwareEngineer1);

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        person.Name = input.nextLine();
        
        System.out.print("Enter Your Age: ");
        person.Age = input.nextByte();
        
        System.out.print("Enter Your Salary: ");
        person.Salary = input.nextFloat();

        input.close();
        
        System.out.println(String.format("Name = %s Age = %s Salary = %f", person.Name, person.Age, person.Salary));
        
        IEmployee employee = new Programmer();
        System.out.println(employee);
        
        System.out.println("\n\nPress any key ...");
    }
}

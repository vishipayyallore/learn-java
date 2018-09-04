package com.learnjava.persondemo.models;


import java.util.UUID;
import java.time.LocalDate;

/**
 * @author Viswanatha Swamy
 *
 */
public class Project {

	public UUID Id = UUID.randomUUID();
	
	public String Name = "Simple Project";
	
	public LocalDate EndDate = LocalDate.of(2019, 12, 01);
	
	@Override
    public String toString() {
        return String.format("Project Details [Id: %s, Name: %s, End Date: %s]", Id, Name, EndDate);
    }
}

package com.learnjava.persondemo.models;


import java.util.UUID;
import java.time.LocalDate;

/**
 * @author Viswanatha Swamy
 *
 */
public class Project {

	public UUID Id = UUID.randomUUID();
	
	public String Name;
	
	public LocalDate EndDate;
	
	public Project() {
		Name = "Simple Project";
		EndDate = LocalDate.of(2019, 12, 01);
	}
	
	
	public Project(String name, LocalDate endDate) {
		Name = name;
		EndDate = endDate;
	}
	
	@Override
    public String toString() {
        return String.format("Project Details [Id: %s, Name: %s, End Date: %s]", Id, Name, EndDate);
    }
}

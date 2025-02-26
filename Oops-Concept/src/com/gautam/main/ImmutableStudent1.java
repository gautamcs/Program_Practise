package com.gautam.main;

import com.gautam.model.Address1;
import com.gautam.model.Student1;

public class ImmutableStudent1 {
	public static void main(String[] args) {
		
		System.out.println(" Immutable class test with Mutable class ... ");
		
		Address1 address = new Address1("Hno-123", "Hyderabad", "Telangana");
		
		Student1 student = new Student1(11, "Babu Thakur", "Diploma", address);
		
		System.out.println(" Student Details: "+student);
		
		System.out.println(" .............. After Update ...........");
		
		student.getAddress().setState("AP");
		System.out.println(" Student Details: "+student); // 
	}

}

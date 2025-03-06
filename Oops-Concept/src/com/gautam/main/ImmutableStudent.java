package com.gautam.main;

import com.gautam.model.Address;
import com.gautam.model.Student;

// Create the Immutable class by using Cloneable interface
public class ImmutableStudent {
	public static void main(String[] args) throws CloneNotSupportedException {

		System.out.println(" Immutable class test with Mutable class ... ");

		Address address = new Address("Hno-123", "Hyderabad", "Telangana");

		Student student = new Student(11, "Babu Thakur", "Diploma", address);

		System.out.println(" Student Details: "+student);

		System.out.println(" .............. After Update ...........");

		student.getAddress().setState("AP");
		System.out.println(" Student Details: "+student);
	}

}

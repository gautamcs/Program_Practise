package com.gautam.main;

import java.util.HashMap;
import java.util.Map;

import com.gautam.model.Employee;

public class ImmutableEmployee {
	public static void main(String[] args) {
		
		System.out.println(" Custom Immutable Class Test: ");
		
		Map<Integer, String> map = new HashMap<Integer, String>(); 
		
		map.put(101, "Gautam");
		map.put(95, "Nutan");
		map.put(111, "Nirmal");
		map.put(45, "Manoj");
		
		Employee emp = new Employee(101, "Gautam", 300000, map);
		
		System.out.println(" Employee: "+emp);
		
		emp.getMap().put(102, "Anirban");
		System.out.println("After Update: ");
		
		System.out.println(" Employee: "+emp);
		
	}
}

package com.gautam.model;

import java.util.HashMap;
import java.util.Map;

public final class Employee {

	private final int empId;
	private final String empName;
	private final int salary;
	private final Map<Integer, String> map; 

	

	public Employee(int empId, String empName, int salary, Map<Integer, String> map) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		
		Map<Integer, String> tempMap = new HashMap<>(); 
		for(Map.Entry<Integer, String> temp : map.entrySet()) {
			tempMap.put(temp.getKey(), temp.getValue());
		}
//		this.map = tempMap;
		this.map = map;
	}

	public int getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}

	public int getSalary() {
		return salary;
	}
	
	// Deep clone is mandatory in getter method 
	public Map<Integer, String> getMap() {
		Map<Integer, String> tempMap = new HashMap<>(); 
		for(Map.Entry<Integer, String> temp : map.entrySet()) {
			tempMap.put(temp.getKey(), temp.getValue());
		}
		// return tempMap; // Immutability does't break
		return map; // Immutablity breaks in this case
		
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + ", map=" + map + "]";
	}

		
}

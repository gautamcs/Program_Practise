package com.gautam.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmployeeData {
    public List<Employee> getEmployeeList() {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(101, "Gautam", 3500000.0));
        employeeList.add(new Employee(111, "Nirmal", 2500000.0));
        employeeList.add(new Employee(95, "Nutan", 7500000.0));
        employeeList.add(new Employee(45, "Manoj", 6500000.0));
        employeeList.add(new Employee(55, "Hirday", 4500000.0));
        employeeList.add(new Employee(56, "Abhinav", 100000.0));
        employeeList.add(new Employee(57, "Avinash", 100000.0));
        employeeList.add(new Employee(02, "Ankit", 2100000.0));
        employeeList.add(new Employee(01, "Prashant", 14500000.0));
        employeeList.add(new Employee(03, "Sunny", 2800000.0));
        employeeList.add(new Employee(155, "Varun", 6500000.0));
        employeeList.add(new Employee(142, "Rohan", 7700000.0));
        employeeList.add(new Employee(121, "Chandan-05", 500000.0));
        employeeList.add(new Employee(05, "Chandan-52", 500000.0));

        return employeeList;
    }

    public List<Employee2> getEmployeeList2() {
        //List<Employee2> employeeList = new ArrayList<>();

        List<Employee2> employeeList = Arrays.asList(
                new Employee2(1, "Alice", "HR", 50000),
                new Employee2(2, "Bob", "IT", 70000),
                new Employee2(3, "Charlie", "HR", 52000),
                new Employee2(4, "David", "Finance", 65000),
                new Employee2(5, "Eve", "IT", 72000),
                new Employee2(6, "Frank", "Finance", 64000)
        );
        return employeeList;
    }
}

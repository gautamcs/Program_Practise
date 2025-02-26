package com.gautam.main;

import com.gautam.model.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApiTest {
    public static void main(String[] args) {
        System.out.println(" Stream API Example ...");

        Employee[] employees = {
                new Employee(101, "Gautam",3500000.0),
                new Employee(111,"Nirmal", 2500000.0),
                new Employee(95,"Nutan", 7500000.0),
                new Employee(45,"Manoj", 6500000.0),
                new Employee(55,"Hirday", 4500000.0),

        };

        Arrays.stream(employees).forEach(System.out::println);

        System.out.println(" Stream.of()");
        Stream.of(employees).forEach(System.out::println);
        System.out.println(" Employee List data Using ArrayList .... ");
        List<Employee> employeeList = Arrays.asList(employees);
        employeeList.stream().forEach(System.out::println);

       List<String> empNameList =  employeeList.stream().map(emp -> emp.getEmpName()).collect(Collectors.toList());

        System.out.println(" List of Employee Name: ");
       empNameList.stream().forEach(System.out::println);
        System.out.println(" Employee Name Starts with M: "); // Employee{empId=45, empName='Manoj', salary=6500000.0}
       employeeList.stream().filter(emp -> emp.getEmpName().charAt(0) == 'M').forEach(System.out::println);
        System.out.println(" Employee Name Starts with N: ");
       employeeList.stream().filter(emp -> emp.getEmpName().charAt(0) == 'N').forEach(System.out::println);
        System.out.println(" ----------------------------------------- ");
       employeeList.stream().filter(emp -> emp.getEmpName().charAt(0) == 'N').
               map(emp -> emp.getEmpName()).
               forEach(System.out::println);

//        employeeList.stream().filter(emp -> emp.getEmpName().charAt(0) == 'N').
//                map(emp -> emp.getEmpName()).
//                max(Comparator.comparingInt(Employee::getEmpId)).get();

        System.out.println(" Stream to Array .... ");
        Object[] array = employeeList.stream().toArray();
        System.out.println(Arrays.toString(array));

        Employee[] array1 = employeeList.stream().toArray(Employee[]::new);

        System.out.println(Arrays.toString(array1));

        System.out.println(" -------------------------------------------- ");
        Arrays.stream(employeeList.stream().toArray(Employee[]::new)).forEach(System.out::println);

        System.out.println(" ================================================================== ");

        System.out.println(" Employee ID List .... ");
       List<Integer> empIdList = employeeList.stream().map(emp -> emp.getEmpId()).collect(Collectors.toList());

       empIdList.stream().forEach(System.out::println);
        System.out.println(" ================================================================== ");

        empIdList.stream().peek(System.out::println);
    }
}

package com.gautam.main;

import com.gautam.model.Employee;
import com.gautam.model.EmployeeData;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class NameSort {
    public static void main(String[] args) {

        Employee[] employees = {
                new Employee(101, "Gautam",3500000.0),
                new Employee(111,"Nirmal", 2500000.0),
                new Employee(95,"Nutan", 7500000.0),
                new Employee(45,"Manoj", 6500000.0),
                new Employee(55,"Hirday", 4500000.0),

        };

       List<String> empNameList =  Arrays.stream(employees).map(emp -> emp.getEmpName()).collect(Collectors.toList());

        System.out.println(" Employee Name List ....");
       empNameList.stream().forEach(e -> System.out.print(" "+e+"\t"));

        System.out.println(" Employee Name List after Sorting .... ");
        System.out.println("\n Natural Sorting ...");
        empNameList.stream().sorted().forEach(e -> System.out.print(" "+e+"\t"));
        System.out.println("\n Sorting in Reversed Order ....");
        empNameList.stream().sorted(Comparator.reverseOrder()).forEach(e -> System.out.print(" "+e+"\t"));
        System.out.println("\n Sorting based on the String length ....");
        empNameList.stream().sorted(Comparator.comparingInt(String::length)).forEach(e -> System.out.print(" "+e+"\t"));

        EmployeeData employeeData = new EmployeeData();
        List<Employee> employeeList =  employeeData.getEmployeeList();

       employeeList.stream().forEach(System.out::println);

        System.out.println(" ------------------------------------------------------------------ ");

         employeeList.stream().map(emp -> emp.getEmpName()).
                sorted(Comparator.comparing(String::length)).
                forEach(str -> System.out.println(str));

        System.out.println(" --------------------------------- ");
        System.out.println(" Sort the Employee Based on the EmpID: ");
        employeeList.stream().
        sorted(Comparator.comparing(Employee::getEmpId)).
                forEach(System.out::println);

        System.out.println(" Sort the Employee Based on the EmpID in Reversed Order: ");

        employeeList.stream().sorted(Comparator.comparing(Employee::getEmpId).reversed()).
                forEach(System.out::println);
        List<Integer> list = Arrays.asList(1,2,3,4,2,3,4,5,6,7,8,9,0,1);

        list.stream().forEach(e -> System.out.print(" "+e+"\t"));

        Set<Integer> collect = list.stream().collect(Collectors.toSet());
        System.out.println(collect.toString());



    }
}

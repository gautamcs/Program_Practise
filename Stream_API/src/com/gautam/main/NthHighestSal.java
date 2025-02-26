package com.gautam.main;

import com.gautam.model.Employee;
import com.gautam.model.EmployeeData;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class NthHighestSal {
    public static void main(String[] args) {
        System.out.println(" 2nd Highest Salary ");

        EmployeeData employeeData = new EmployeeData();
        List<Employee> emplpyeeList = employeeData.getEmployeeList();

//        emplpyeeList.stream().max(Comparator.comparingDouble(Employee::getSalary)).stream().skip(2).
//                forEach(System.out::println);

        Optional<Employee> empOption =  emplpyeeList.stream().
        distinct().
                sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(1).
                findFirst();

        //empOption.ifPresent(emp -> System.out.println(emp));
        empOption.ifPresentOrElse(emp -> System.out.println(emp), () -> System.out.println(" No Data !!"));

        Employee employee = emplpyeeList.stream().sorted(Comparator.comparingDouble(Employee::getSalary)).skip(1).
                findFirst().orElse(null);
        System.out.println(employee);
    }
}

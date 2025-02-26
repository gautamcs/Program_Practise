package com.gautam.main;

import com.gautam.model.Employee;
import com.gautam.model.Employee2;
import com.gautam.model.EmployeeData;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeBusinessOperation {
    public static void main(String[] args) {

        EmployeeData employeeData = new EmployeeData();

        List<Employee2> empList = employeeData.getEmployeeList2();

        System.out.println(" Original Data .... ");
       // empList.stream().forEach(System.out::println);

        Map<String, List<Employee2>> collect = empList.stream().collect(Collectors.groupingBy(Employee2::getDepartment));// Employee2::getEmpId).

        collect.entrySet().forEach(entry -> System.out.println(entry.getKey()+" --> "+entry.getValue().stream().map(Employee2::getEmpName).toList()));
    }
}


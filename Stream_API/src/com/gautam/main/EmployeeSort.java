package com.gautam.main;

import com.gautam.model.Employee;
import com.gautam.model.EmployeeData;

import java.sql.SQLOutput;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeSort {
    public static void main(String[] args) {

        EmployeeData employeeData = new EmployeeData();
        List<Employee> employeeList = employeeData.getEmployeeList();

        List<String> empNameList = employeeList.stream().map(Employee::getEmpName).collect(Collectors.toList());

        System.out.println(empNameList);
        System.out.println(" Sort Based on the Employee Name in REVERSE ORDER ... ");

        employeeList.stream()
                .sorted(Comparator.comparing(Employee::getEmpName).reversed()).
                map(Employee::getEmpName).
                forEach(e -> System.out.print(" "+e+" "));

        System.out.println("\n ----------------------------------------------------------- \n");
        System.out.println(" Sort the Employee Class based on the 3rd character of Employee Name ");
        employeeList.stream()
                .sorted((e1, e2) -> e1.getEmpName().charAt(2) - e2.getEmpName().charAt(2)).
                //map(Employee::getEmpName).
                forEach(e -> System.out.println(" "+e+" "));

        System.out.println(" Sort the Employee based on the Salary then Name ");
        employeeList.stream().
                sorted(Comparator.comparing(Employee::getSalary).
                        thenComparing(Comparator.comparing(Employee::getEmpName))).
                forEach(System.out::println);

    }
}

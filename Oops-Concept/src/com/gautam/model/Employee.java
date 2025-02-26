package com.gautam.model;
public class Employee implements Cloneable {
    private int empIs;
    private String empName;
    private String department;
    private int salary;

    public Employee(int empIs, String empName, String department, int salary) {
        this.empIs = empIs;
        this.empName = empName;
        this.department = department;
        this.salary = salary;
    }

    public int getEmpIs() {
        return empIs;
    }

    public void setEmpIs(int empIs) {
        this.empIs = empIs;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String toString() {
        return "Employee{" +
                "empIs=" + empIs +
                ", empName='" + empName + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }

    public Object clone() throws CloneNotSupportedException {
//        Employee employee = (Employee) super.clone();
        return super.clone();
    }
}

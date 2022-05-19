package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer empId;
    private String employeeName;
    private String employeeTitle;
    private Integer employeeSalary;

    public Integer getEmpId() {
        return empId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeTitle() {
        return employeeTitle;
    }

    public void setEmployeeTitle(String employeeTitle) {
        this.employeeTitle = employeeTitle;
    }

    public Integer getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(Integer employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public Employee(String employeeName, String employeeTitle, Integer employeeSalary) {
        this.employeeName = employeeName;
        this.employeeTitle = employeeTitle;
        this.employeeSalary = employeeSalary;
    }

    public Employee() {
    }

    @Override
    public String toString() {
        return String.format("Employee[Employee ID=%d, Name='%s', Title='%s', Salary=%d]", empId, employeeName, employeeTitle, employeeSalary);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return empId.equals(employee.empId) &&
                Objects.equals(employeeName, employee.employeeName) &&
                Objects.equals(employeeTitle, employee.employeeTitle) &&
                Objects.equals(employeeSalary, employee.employeeSalary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empId, employeeName, employeeTitle, employeeSalary);
    }
}

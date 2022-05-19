package com.example.demo.controller;

import com.example.demo.entities.Employee;
import com.example.demo.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeRestController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/api/employees")
    public List<Employee> getEmployees() {
        List<Employee> employees = employeeService.retrieveEmployees();
        return employees;
    }

    @GetMapping("/api/employees/{empId}")
    public Employee getEmployee(@PathVariable(name="empId")Integer empId) {
        return employeeService.getEmployee(empId);
    }

    @GetMapping("/api/employees/{employeeName}")
    public List<Employee> getEmployeeByName(@RequestParam(value="employeeName")String employeeName) {
        return employeeService.getEmployeeByName(employeeName);
    }
    @PostMapping("/api/employees")
    public void saveEmployee(Employee employee){
        employeeService.saveEmployee(employee);
        System.out.println("Employee Saved Successfully");
    }

    @DeleteMapping("/api/employees/{empId}")
    public void deleteEmployee(@PathVariable(name="empId")Integer empId){
        employeeService.deleteEmployee(empId);
        System.out.println("Employee Deleted Successfully");
    }

    @PutMapping("/api/employees/{empId}")
    public void updateEmployee(@RequestBody Employee employee,
                               @PathVariable(name="empId")Integer empId){
        Employee emp = employeeService.getEmployee(empId);
        if(emp != null){
            employeeService.updateEmployee(employee);
        }

    }
}

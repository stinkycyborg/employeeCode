package com.example.demo.Service;

import com.example.demo.entities.Employee;
import com.example.demo.repos.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> retrieveEmployees() {
        List<Employee> employees = employeeRepository.findAll();
        return employees;
    }

    public Employee getEmployee(Integer empId) {
        Optional<Employee> optEmp = employeeRepository.findById(empId);
        return optEmp.get();
    }

    public List<Employee> getEmployeeByName(String name) {
        List<Employee> emp = employeeRepository.findByEmployeeName(name);
        return emp;
    }

    public void saveEmployee(Employee employee){
        employeeRepository.save(employee);
    }

    public void deleteEmployee(Integer empId){
        employeeRepository.deleteById(empId);
    }

    public void updateEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

}
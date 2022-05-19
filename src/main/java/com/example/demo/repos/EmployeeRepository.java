package com.example.demo.repos;

import com.example.demo.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

    List<Employee> findByEmployeeName(String name);
}

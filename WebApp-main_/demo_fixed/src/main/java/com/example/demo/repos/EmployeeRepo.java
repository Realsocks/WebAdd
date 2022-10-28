package com.example.demo.repos;

import com.example.demo.Employees;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployeeRepo extends JpaRepository<Employees, Integer> {
    List<Employees> findAllById(Integer id);
}

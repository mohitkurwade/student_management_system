package com.jspiders.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jspiders.demo.entity.Employee;

@Repository
public interface EmpRepo extends JpaRepository<Employee, Integer> {

}

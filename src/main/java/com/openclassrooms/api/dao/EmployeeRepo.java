package com.openclassrooms.api.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.openclassrooms.api.model.Employee;

@Repository
public interface EmployeeRepo extends CrudRepository<Employee, Long> {

}
package com.ajtech.repository;

import com.ajtech.entity.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


public interface EmployeeRepository extends MongoRepository<Employee,String> {
    Employee findByFirstName(String empName);
}

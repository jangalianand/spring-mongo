package com.ajtech.service;

import com.ajtech.entity.Employee;
import com.ajtech.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public Employee saveEmloyee(Employee emp){
        return employeeRepository.save(emp);
    }

    public Employee getEmployeeByFirstName(String empName){
        return employeeRepository.findByFirstName(empName);
    }

    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }

    public void deleteAllEmployees(){
        employeeRepository.deleteAll();
    }
}

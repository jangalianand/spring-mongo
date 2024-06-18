package com.ajtech.controller;

import com.ajtech.entity.Employee;
import com.ajtech.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping
    public Employee saveEmployee(@RequestBody Employee employee){

        return  employeeService.saveEmloyee(employee);
    }

   @GetMapping("/{empFirstName}")
    public Employee getEmployeeByFirstName(@PathVariable String empFirstName){

        return employeeService.getEmployeeByFirstName(empFirstName);
    }
    @GetMapping
    public List<Employee> getAllEmployees(){
       return employeeService.getAllEmployees();
    }

    @DeleteMapping
    public void deleteAllEmployees(){

        employeeService.deleteAllEmployees();
    }


}

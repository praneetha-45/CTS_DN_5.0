package com.cognizant.springlearn.controller;


import java.util.ArrayList;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RestController;


import com.cognizant.springlearn.model.Employee;

import com.cognizant.springlearn.service.EmployeeService;



@RestController

public class EmployeeController {


@Autowired

EmployeeService employeeService;



@GetMapping("/employees")

public ArrayList<Employee> getAllEmployees(){


return employeeService.getAllEmployees();


}



@GetMapping("/employees/{id}")

public Employee getEmployee(

@PathVariable int id){



return employeeService.getEmployee(id);



}



}
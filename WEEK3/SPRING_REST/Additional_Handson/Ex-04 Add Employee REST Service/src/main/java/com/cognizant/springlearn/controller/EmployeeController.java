package com.cognizant.springlearn.controller;


import java.util.ArrayList;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;


import com.cognizant.springlearn.model.Employee;

import com.cognizant.springlearn.service.EmployeeService;



@RestController

public class EmployeeController {



@Autowired

EmployeeService service;




@GetMapping("/employees")

public ArrayList<Employee> getAllEmployees(){


return service.getAllEmployees();


}




@PostMapping("/employees")

public String addEmployee(

@RequestBody Employee employee){



service.addEmployee(employee);



return "Employee added successfully";


}



}
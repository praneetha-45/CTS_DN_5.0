package com.cognizant.springlearn.service;


import java.util.ArrayList;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;


import com.cognizant.springlearn.dao.EmployeeDao;

import com.cognizant.springlearn.model.Employee;



@Service

public class EmployeeService {


@Autowired

EmployeeDao dao;



@Transactional

public ArrayList<Employee> getAllEmployees(){


return dao.getAllEmployees();

}



@Transactional

public void addEmployee(Employee employee){


dao.addEmployee(employee);


}



}
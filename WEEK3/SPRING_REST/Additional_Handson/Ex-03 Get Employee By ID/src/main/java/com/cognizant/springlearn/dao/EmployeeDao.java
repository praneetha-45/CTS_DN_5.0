package com.cognizant.springlearn.dao;


import java.util.ArrayList;


import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.springframework.stereotype.Repository;


import com.cognizant.springlearn.model.Employee;



@Repository

public class EmployeeDao {


    public static ArrayList<Employee> EMPLOYEE_LIST;



    public EmployeeDao(){


        ApplicationContext context =
                new ClassPathXmlApplicationContext(
                        "employee.xml"
                );


        EMPLOYEE_LIST =
                context.getBean(
                        "employeeList",
                        ArrayList.class
                );


    }



    public ArrayList<Employee> getAllEmployees(){


        return EMPLOYEE_LIST;


    }



    public Employee getEmployee(int id){



        for(Employee employee : EMPLOYEE_LIST){


            if(employee.getId()==id){


                return employee;


            }


        }


        return null;


    }



}
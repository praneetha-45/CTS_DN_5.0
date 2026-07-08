package com.cognizant.springlearn;


import java.util.ArrayList;


import org.slf4j.Logger;

import org.slf4j.LoggerFactory;


import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;


import com.cognizant.springlearn.dao.EmployeeDao;

import com.cognizant.springlearn.model.Employee;



@SpringBootApplication

public class SpringLearnApplication {



	private static final Logger LOGGER =

			LoggerFactory.getLogger(SpringLearnApplication.class);




	public static void main(String[] args) {



		LOGGER.info("START");



		SpringApplication.run(
				SpringLearnApplication.class,
				args
		);



		displayEmployees();



		LOGGER.info("END");


	}





	public static void displayEmployees(){



		EmployeeDao employeeDao =

				new EmployeeDao();



		ArrayList<Employee> list =

				employeeDao.getAllEmployees();




		for(Employee employee : list){



			System.out.println(employee);



		}


	}


}
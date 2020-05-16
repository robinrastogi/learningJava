package com.journaldev.spring.jdbc.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Random;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.journaldev.spring.jdbc.dao.EmployeeDAO;
import com.journaldev.spring.jdbc.model.Employee;

public class SpringMain {

	public static void main(String[] args) {
		//Get the Spring Context
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");

		//Get the EmployeeDAO Bean
		//EmployeeDAO employeeDAO = ctx.getBean("employeeDAO", EmployeeDAO.class);
		//To use JdbcTemplate
		EmployeeDAO employeeDAO = ctx.getBean("employeeDAOJDBCTemplate", EmployeeDAO.class);

		//Run some tests for JDBC CRUD operations
		Employee emp = new Employee();
		int rand = new Random().nextInt(1000);
		emp.setId(rand);
		emp.setName("Robin");
		emp.setRole("Rastogi");

		/////////////////
		try {
			char choice;
			do {
				InputStreamReader in = new InputStreamReader(System.in);
				BufferedReader br = new BufferedReader(in);
				//char choice;
				System.out.print("\n Enter a character as below:\n");
				//n=Integer.parseInt(br.readLine());
				System.out.println("c: create");
				System.out.println("r: read");
				System.out.println("u: update");
				System.out.println("d: delete");
				System.out.println("g: getAll");
				System.out.println("e: Exit");
				System.out.println("Enter your choice:\n");
				choice = (char) br.read();
				switch (choice) {
				case 'C':
				case 'c':
					//Create
					employeeDAO.save(emp);

					break;

				case 'R':
				case 'r':

					//Read
					Employee emp1 = employeeDAO.getById(rand);
					System.out.println("Employee Retrieved::" + emp1);

					break;

				case 'U':
				case 'u':

					//Update
					emp.setRole("CEO");
					employeeDAO.update(emp);

					break;

				case 'G':
				case 'g':

					//Get All
					List<Employee> empList = employeeDAO.getAll();
					System.out.println(empList);

					break;

				case 'D':
				case 'd':

					//Delete
					employeeDAO.deleteById(rand);

					break;
				case 'E':
				case 'e':
					System.out.print("Exiting... \n");
					break;
				default:
					System.out.print("Wrong choice.....");
				}
			} while (choice != 'e');
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//////////////////
		/*
		//Create
		employeeDAO.save(emp);

		//Read
		Employee emp1 = employeeDAO.getById(rand);
		System.out.println("Employee Retrieved::"+emp1);

		//Update
		emp.setRole("CEO");
		employeeDAO.update(emp);

		//Get All
		List<Employee> empList = employeeDAO.getAll();
		System.out.println(empList);

		//Delete
		employeeDAO.deleteById(rand);
		 */

		//Close Spring Context
		ctx.close();

		System.out.println("DONE");
	}

}

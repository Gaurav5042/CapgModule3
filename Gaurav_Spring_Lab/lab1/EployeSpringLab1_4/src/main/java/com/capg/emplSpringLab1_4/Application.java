package com.capg.emplSpringLab1_4;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
	public static void main(String[] args) {
		
		System.out.println("Gaurav Chand Singh");
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		SBU sbu = (SBU) context.getBean("sbu");
		
		System.out.println("SBU Details");
		
		System.out.println("---------------------------------------");
		
		System.out.println("[ " + "sbuCode=" + sbu.getSbuCode() + ", sbuHead=" + sbu.getSbuHead() + ", sbuName="		+ sbu.getSbuName() + "]");
		
		System.out.println("Employee Details:");
		
		System.out.println("----------------------------------");
		
		List<Employee> emp = sbu.getEmplist();
		
		for (Employee data : emp) {

			System.out.println("empId=" + data.getEmployeeId());
			System.out.println("empName=" + data.getEmployeeName());
			System.out.println("empSalary=" + data.getSalary());
			System.out.println("---------------------------------");
			 
		}

	}
}

package com.crimsonLogic.EmployeeOperations;

import java.time.LocalDate;
import java.util.Scanner;

import com.crimsonLogic.EmployeeData.Employee;
import com.crimsonLogic.EmployeeData.Programmer;

public class EmployeeOperations extends Employee{
	
	Scanner sc =new Scanner(System.in);
	Programmer s=new Programmer();
	public void readEmployeeDetails() {
		System.out.println("Enter the Employee details");
		System.out.println("Generate the Employee Id:");
		s.setEmployeeId(new Double((Math.random())*1000).toString());
		System.out.println("Enter the Employee Name:");
		s.setEmpName(sc.nextLine());
		System.out.println("Enter the Employee Address:");
		s.setEmpAddress(sc.nextLine());
		System.out.println("Enter the Employee Salary:");
		s.setSalary(sc.nextFloat());
		
	}
	public float displayEmployeeDetails() {
		System.out.println("Employee details:");
		System.out.println("Employee Id:"+s.getEmployeeId());
		System.out.println("Employee Name:"+s.getEmpName());
		System.out.println("Employee Address:"+s.getEmpAddress());
		System.out.println("Employee Salary:"+s.getSalary());
		return s.getSalary();
		
		
	}


}

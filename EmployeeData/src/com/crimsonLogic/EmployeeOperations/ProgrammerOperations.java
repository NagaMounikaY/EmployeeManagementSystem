package com.crimsonLogic.EmployeeOperations;

public class ProgrammerOperations extends EmployeeOperations{
	
	public void displayProgrammerDetails() {
		System.out.println("enter the project name:");
		s.setProjectName(sc.nextLine());
		System.out.println("enter the project id :");
		s.setProjectId(sc.nextLine());
		System.out.println("enter the bonus:");
		s.setBonus(sc.nextFloat());
		System.out.println("project name:"+s.getProjectName());
		System.out.println("project id:"+s.getProjectId());
		System.out.println(s.getSalary()+s.getBonus()+"total salary");
	}

}

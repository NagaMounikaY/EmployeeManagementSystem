package com.crimsonLogic;

import com.crimsonLogic.EmployeeOperations.ProgrammerOperations;

public class EMS {
	public static void main(String[] args) {
		ProgrammerOperations p=new ProgrammerOperations();
		p.readEmployeeDetails();
		p.displayEmployeeDetails();
		p.displayProgrammerDetails();
	}

}

package com.monocept.model.test;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import com.monocept.model.Accountant;
import com.monocept.model.Developer;
import com.monocept.model.Employee;
import com.monocept.model.Manager;

public class EmployeeTest {

	public static void main(String[] args) throws IOException {
		Employee emp1 = new Manager(101, "Vishak", 10000);
		Employee emp2 = new Developer(102, "Abhi", 11000);
		Employee emp3 = new Accountant(103, "Harshini", 9000);
		printDetails(emp1);
		System.out.println();
		printDetails(emp2);
		System.out.println();
		printDetails(emp3);
		generateSalarySlip(emp1);
		generateSalarySlip(emp2);
		
	}

	private static void printDetails(Employee emp) {
		System.out.println("Employee id:" + emp.getempnum());
		System.out.println("Employee name:" + emp.getempname());
		System.out.println("Employee basic:" + emp.getempbasic());
		System.out.println("Annual Ctc: " + emp.getcalcAnnualCTC());
	}
	
	public static void generateSalarySlip(Employee emp) throws IOException {
	    File file = new File("data\\" + emp.getempnum() + "_" + emp.getempname() + ".html");
	    FileWriter fw = new FileWriter(file);
	    fw.write("<html>\r\n" + "<head><title>Employee Salary Slip</title></head>\r\n" + "<body>\r\n" + "Employee Name: "
	        + emp.getempname() + "\n" + "Employee Number: " + emp.getempnum() + "\n" + "Salary: " + emp.getempbasic() + "\n" + "Gross Salary: " + emp.getcalcAnnualCTC() + "</body>\r\n"
	        + "</html>");
	    fw.close();
	  }


}

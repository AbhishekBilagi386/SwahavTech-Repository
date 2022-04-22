package com.monocept.model.test;

import java.io.IOException;

import com.monocept.model.CSVFileReader;
import com.monocept.model.DataAnalysis;

public class EmployeeTest {

	public static void main(String[] args) throws IOException {
		DataAnalysis analyzer = new DataAnalysis(new CSVFileReader("data.csv"));
		System.out.println("Details Of CEO:" + analyzer.findCeoOfCompany());
		System.out.println("Count the number of employees in each department: " + analyzer.empCount());

	}
}

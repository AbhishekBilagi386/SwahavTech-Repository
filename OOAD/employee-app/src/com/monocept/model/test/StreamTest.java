package com.monocept.model.test;

import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.monocept.model.Employee;

public class StreamTest {

	public static void main(String[] args) {
		
		Pattern pattern = Pattern.compile(",");
		Path filePath = FileSystems.getDefault().getPath("data.csv");
		try (Stream<String> lines = Files.lines(filePath)) {
		  
		  List<Employee> emp = lines.skip(1).map(line -> {
		    String[] empDetails = pattern.split(",");
		    return new Employee(
		    		String id = empDetails[0];
					String name = empDetails[1];
					String job = empDetails[2];
					int mId = Integer.parseInt(empDetails[3]);
					String doj = empDetails[4];
					int salary = Integer.parseInt(empDetails[5]);
					int commission = Integer.parseInt(empDetails[6]);
					int deptNum = Integer.parseInt(empDetails[7]);

					Employee emp1 = new Employee(id, name, job, mId, doj, salary, commission, deptNum);
					emp.add(emp1);
		  }).collect(Collectors.toList());

		  emp.forEach(System.out::println);
		}
	}
}

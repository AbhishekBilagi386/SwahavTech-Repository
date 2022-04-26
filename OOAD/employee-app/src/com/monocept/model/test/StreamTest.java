package com.monocept.model.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.HashSet;
import java.util.stream.Collectors;

import com.monocept.model.Employee;

public class StreamTest {

	public static void main(String[] args) throws IOException {
		Path filePath = Paths.get("data.csv");
		
		@SuppressWarnings("unchecked")
		HashSet<Employee> emp = (HashSet<Employee>) Files
				.lines(filePath)
				.map(x -> x.split(","))
				.map(x -> {
					return (new Employee(x[0], x[1], x[2], x[3], x[4], x[5], x[6], x[7]));
				}).collect(Collectors.toSet());
					
		emp.stream().filter(f -> f.getEid()
				.contains("NULL"))
				.forEach(x -> {
					System.out.println(x.getEname());
				});
		System.out.println(emp);
		
		HashMap<String, Integer> Count = new HashMap<String, Integer>();
		
		emp.stream().map(employee ->{
			if (Count.containsKey(employee.getJob()))
				Count.put(employee.getJob(), Count.get(employee.getJob()) + 1);
			if (!Count.containsKey(employee.getJob()))
				Count.put(employee.getJob(), 1);
			return null;
		}).forEach(x -> System.out.println(" "));
		
		System.out.println(Count);
		
}

}

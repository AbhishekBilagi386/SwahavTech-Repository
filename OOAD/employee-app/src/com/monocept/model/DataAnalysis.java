package com.monocept.model;

import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DataAnalysis {
	private IDataSource reader;

	public DataAnalysis(IDataSource read) {
		this.reader = read;
	}

	Set<Employee> emp = new HashSet<Employee>();

	public String findCeoOfCompany() throws IOException {
		emp = reader.read();
		for (Employee employee : emp) {
			if (employee.getManagerId() == 0) {
				return employee.emp.toString();
			}
		}
		return null;
	}

	public Map<String, Integer> empCount() throws IOException {
		Map<String, Integer> count = new HashMap<String, Integer>();
		emp = reader.read();

		for (Employee employee : emp) {
			if (count.containsKey(employee.getJob()))
				count.put(employee.getJob(), count.get(employee.getJob()) + 1);
			if (!count.containsKey(employee.getJob()))
				count.put(employee.getJob(), 1);
		}
		return count;
	}

}

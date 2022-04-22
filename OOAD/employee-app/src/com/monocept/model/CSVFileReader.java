package com.monocept.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class CSVFileReader implements IDataSource {
	private String address;

	public CSVFileReader(String address) {
		this.address = address;
	}

	@Override
	public Set<Employee> read() throws IOException {
		Set<Employee> emp = new HashSet<Employee>();
		String fileToParse = "data.csv";
		BufferedReader bufferedReader = new BufferedReader(new FileReader(fileToParse));

		try {
			String line = bufferedReader.readLine();
			if (line == null)
				throw new IllegalArgumentException("File is empty");
			while ((line = bufferedReader.readLine()) != null) {
				String[] empDetails = line.split(",");
				try {
					if (empDetails.length > 8)
						throw new ArrayIndexOutOfBoundsException();
					String id = check(empDetails[0]);
					String name = check(empDetails[1]);
					String job = check(empDetails[2]);
					int mId = Integer.parseInt(check(empDetails[3]));
					String doj = check(empDetails[4]);
					int salary = Integer.parseInt(check(empDetails[5]));
					int commission = Integer.parseInt(check(empDetails[6]));
					int deptNum = Integer.parseInt(check(empDetails[7]));

					Employee emp1 = new Employee(id, name, job, mId, doj, salary, commission, deptNum);
					emp.add(emp1);
				} catch (ArrayIndexOutOfBoundsException | NumberFormatException | NullPointerException e) {
					System.out.println(e);
				}
			}
			return emp;
		} finally {
			bufferedReader.close();
		}
	}

	public String check(String value) {
		if (value.equalsIgnoreCase("NULL")) {
			return "0";
		}
		return value;
	}

}

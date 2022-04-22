package com.monocept.model;

import java.io.IOException;
import java.util.Set;

public interface IDataSource {
	Set<Employee> read() throws IOException;
}

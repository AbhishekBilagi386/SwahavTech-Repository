package com.monocept.model.test;

import com.monocept.model.File;
import com.monocept.model.Folder;

public class Test {

	public static void main(String[] args) {
		Folder root_folder = new Folder("department");
		
		Folder subFolder = new Folder("employee");
		root_folder.addChild(subFolder);
		
		File emp_file = new File("abhishek_details", "40kb");
		subFolder.addChild(emp_file);
		
		Folder subFolder2 = new Folder("client");
		root_folder.addChild(subFolder2);
		root_folder.showHierarchy();
	}

}

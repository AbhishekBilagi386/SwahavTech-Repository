package com.monocept.model.test;

import com.monocept.model.File;
import com.monocept.model.Folder;

public class Test2 {

	public static void main(String[] args) {
		Folder root_folder = new Folder("Movies");
	
		Folder subFolder1 = new Folder("Hindi");
		root_folder.addChild(subFolder1);
		Folder subFolder2 = new Folder("English");
		root_folder.addChild(subFolder2);
		
		File file1 = new File("abc.av1","20kb");
		subFolder1.addChild(file1);
		
		File file2 = new File("pqr.mp4","30kb");
		subFolder2.addChild(file2);
		
		File file3 = new File("lmn.mp4","40kb");
		subFolder2.addChild(file3);
		
		root_folder.showHierarchy();
	}

}

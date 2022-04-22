package com.monocept.model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class HtmlFile {

	public static void main(String[] args) throws IOException {
		String name = "Swabhav Tech";
		String address = "Mumbai";
		File file = new File("C:\\Users\\User\\OneDrive\\Desktop\\SwabhavTechRepo\\Java\\textfile-app\\file2.html");
		FileWriter fw = new FileWriter(file);
		PrintWriter pw = new PrintWriter(fw);
		pw.println( "<html>\r\n" + "<head></head>\r\n" + "<body>\r\n" +name+ "<div></div>\r\n" +address+ "</body\r\n>" + "</html>");
		fw.close();
	}

}

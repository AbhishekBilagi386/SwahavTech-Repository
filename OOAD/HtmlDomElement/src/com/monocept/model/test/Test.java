package com.monocept.model.test;

import java.io.FileWriter;
import java.io.IOException;

import com.monocept.model.HtmlDomGrpElement;
import com.monocept.model.HtmlDomIndvElement;

public class Test {

	public static void main(String[] args) throws IOException {
		HtmlDomGrpElement root = new HtmlDomGrpElement("div");

		HtmlDomIndvElement txt = new HtmlDomIndvElement("input", "text", "Hello_Monocept");
		root.addChildTag(txt);
		HtmlDomIndvElement btn = new HtmlDomIndvElement("input", "button", "Click_Me!");
		root.addChildTag(btn);
		System.out.println(root.render());
		generateHtmlFile(root.render());
	}

	private static void generateHtmlFile(String text) throws IOException {
		FileWriter myWriter = new FileWriter("htmldom.html");
		String writeText = "<html>\n<head>\n<title>HtmlDomElement</title>\n<head>\n</head>\n<body>\n" + text
				+ "\n</body>\n</html>";
		myWriter.write(writeText);
		myWriter.close();
		System.out.println("Successfully wrote!");
	}

}

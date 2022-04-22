package com.monocept.product.factory.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

import com.monocept.product.factory.AudiFactory;
import com.monocept.product.factory.BmwFactory;
import com.monocept.product.factory.IAuto;
import com.monocept.product.factory.IAutoFactory;
import com.monocept.product.factory.TeslaFactory;

public class Test {

	public static void main(String[] args)
			throws FileNotFoundException, IOException, Exception, IllegalArgumentException, InvocationTargetException,
			NoSuchMethodException, SecurityException, ClassNotFoundException {

		// part1
		System.out.println("Part 1");
		IAutoFactory factory;
		factory = new AudiFactory();
		IAuto auto = factory.make();
		auto.start();
		auto.stop();
		System.out.println();
		// part2
		System.out.println("Part 2");
		IAutoFactory factory1;
		factory1 = TeslaFactory.getInstance();
		IAuto auto1 = factory1.make();
		auto1.start();
		auto1.stop();
		System.out.println();
		// part3
		System.out.println("Part 3");
		IAutoFactory factory2;
		factory2 = loadInstanceFromPropFile();
		IAuto auto2 = factory2.make();
		auto2.start();
		auto2.stop();

	}

	private static IAutoFactory loadInstanceFromPropFile()
			throws FileNotFoundException, IOException, IllegalAccessException, IllegalArgumentException,
			InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException {

		Properties prop = new Properties();
		prop.load(new FileReader("auto.properties"));

		String path = prop.getProperty("name");
		return (IAutoFactory) Class.forName(path).getMethod("getInstance", null).invoke(null, null);
	}

}

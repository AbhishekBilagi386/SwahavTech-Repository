package com.monocept.model.test;

import com.monocept.model.CarInspection;
import com.monocept.model.CarService;
import com.monocept.model.OilChange;
import com.monocept.model.TyreRotation;

public class Test {

	public static void main(String[] args) {
		CarService service = new OilChange(new TyreRotation(new CarInspection()));

		System.out.println(service.getDetails());
		System.out.println("Total Cost: " + service.getCost());
	}

}

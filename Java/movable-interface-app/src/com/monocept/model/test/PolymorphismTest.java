package com.monocept.model.test;

import com.monocept.model.Bike;
import com.monocept.model.Car;
import com.monocept.model.IMovable;
import com.monocept.model.Truck;

public class PolymorphismTest {

	public static void main(String[] args) {
		
		IMovable[] movables = new IMovable[] {
				new Car("Ferrari"),
				new Car("Maseratti"),
				new Truck("Tesla"),
				new Bike("Honda"),
				new Bike("Suzuki")
		};
			startRace(movables);
	}

	public static void startRace(IMovable[] movables) {
		System.out.println("Starting the Race..");
		
		for(IMovable mov: movables) {
			mov.move();
			}
		System.out.println("Race Ends.");
	}

}

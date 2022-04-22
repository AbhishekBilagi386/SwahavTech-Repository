package com.monocept.model.test;

import com.monocept.model.Bark;
import com.monocept.model.BarkRecognizer;
import com.monocept.model.DogDoor;
import com.monocept.model.Remote;

public class DogDoorTest {

	public static void main(String[] args) {
		DogDoor door = new DogDoor();
		door.addAllowedBark(new Bark("rowlf"));
		door.addAllowedBark(new Bark("rooowlf"));
		door.addAllowedBark(new Bark("rawlf"));
		door.addAllowedBark(new Bark("woof"));
		BarkRecognizer recognizer = new BarkRecognizer(door);
		Remote remote = new Remote(door);

		// After hearing a bark
		System.out.println("Fido barks to go outside...");
		recognizer.recognize(new Bark("woof"));

		System.out.println("\nFido has gone outside...");

		try {
			Thread.currentThread().sleep(10000);
		} catch (InterruptedException e) {
		}

		System.out.println("\nFido's all done...");
		System.out.println("...but he's stuck outside!");

		//Some other dog barks
		Bark AnotherDogBark = new Bark("yip");
		System.out.println("Another random dog starts barking.");
		recognizer.recognize(AnotherDogBark);
		
		try {
			Thread.currentThread().sleep(5000);
		} catch (InterruptedException e) {
		}
		
		//Fido barks Again
		System.out.println("\nFido starts barking...");
		recognizer.recognize(new Bark("Woof"));

		System.out.println("\nFido's back inside...");
	}

}

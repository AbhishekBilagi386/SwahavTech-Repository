package com.monocept.model.test;

import java.util.Iterator;
import java.util.List;

import com.monocept.model.Builder;
import com.monocept.model.Guitar;
import com.monocept.model.GuitarSpec;
import com.monocept.model.Inventory;
import com.monocept.model.Type;
import com.monocept.model.Wood;

public class InventoryTest {

	public static void main(String[] args) {
		Inventory inventory = new Inventory();
		initializeInventory(inventory);

		GuitarSpec whatErinLikes = new GuitarSpec(Builder.ABHISHEK, "Stratocastor", Type.ELECTRIC, 6,
				Wood.INDIAN_ROSEWOOD, Wood.MAHOGANY);
		List<Guitar> matchingGuitars = inventory.search(whatErinLikes);
		if (!matchingGuitars.isEmpty()) {
			System.out.println("Erin, you might like these guitars:");
			for (Iterator<Guitar> i = matchingGuitars.iterator(); i.hasNext();) {
				Guitar guitar = (Guitar) i.next();
				GuitarSpec spec = guitar.getSpec();
				System.out.println("  We have a " + spec.getBuilder() + " " + spec.getModel() + " " + spec.getType()
						+ " guitar:\n     " + spec.getBackWood() + " back and sides,\n     " + spec.getTopWood()
						+ " top.\n  You can have it for only $" + guitar.getPrice() + "!\n  ----");
			}
		} else {
			System.out.println("Sorry, Erin, we have nothing for you.");
		}
	}

	private static void initializeInventory(Inventory inventory) {
		inventory.addGuitar("11277", 3999.95, Builder.ABHISHEK, "CJ", Type.ACOUSTIC, Wood.INDIAN_ROSEWOOD,
				Wood.MAHOGANY);
		inventory.addGuitar("V95693", 1499.95, Builder.HIMANSHU, "Stratocastor", Type.ELECTRIC, Wood.MAHOGANY,
				Wood.BRAZILIAN_ROSEWOOD);
		inventory.addGuitar("V9512", 1549.95, Builder.ROHAN, "Stratocastor", Type.ELECTRIC, Wood.BRAZILIAN_ROSEWOOD,
				Wood.INDIAN_ROSEWOOD);
		inventory.addGuitar("V9513", 1549.96, Builder.ABHISHEK, "Stratocastor", Type.ELECTRIC, Wood.BRAZILIAN_ROSEWOOD,
				Wood.INDIAN_ROSEWOOD);
		inventory.addGuitar("V9513", 1449.56, Builder.ABHISHEK, "Stratocastor", Type.ELECTRIC, Wood.BRAZILIAN_ROSEWOOD,
				Wood.INDIAN_ROSEWOOD);
	}
}

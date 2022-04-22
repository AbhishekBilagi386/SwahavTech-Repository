package com.monocept.model;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
	private List<Guitar> guitars;

	public Inventory() {
		guitars = new LinkedList<Guitar>();
	}

	public void addGuitar(String serialNum, double price,
	                        Builder builder, String model,
	                        Type type, Wood backWood, Wood topWood) {
	    Guitar guitar = new Guitar(serialNum, price, builder,
	                               model, type, backWood, topWood);
	    guitars.add(guitar);
	  }

		public Guitar getGuitar(String serialNumber) {
			for (Iterator<Guitar> i = guitars.iterator(); i.hasNext();) {
				Guitar guitar = (Guitar) i.next();
				if (guitar.getSerialNum().equals(serialNumber)) {
					return guitar;
				}
			}
			return null;
		}

		public List<Guitar> search(GuitarSpec searchSpec) {
			List<Guitar> matchingGuitars = new LinkedList<Guitar>();
			for (Iterator<Guitar> i = guitars.iterator(); i.hasNext();) {
				Guitar guitar = (Guitar) i.next();
				if (guitar.getSpec().matches(searchSpec))
					matchingGuitars.add(guitar);
			}
			return matchingGuitars;
		}
	}

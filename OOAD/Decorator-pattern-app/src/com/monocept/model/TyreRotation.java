package com.monocept.model;

public class TyreRotation extends Decorator implements CarService {

	public TyreRotation(CarService service) {
		super(service);

	}

	@Override
	public double getCost() {
		return 350 + service.getCost();
	}

	@Override
	public String getDetails() {
		return "\n" + getClass().getSimpleName() + " Cost: 350" + "\n" + service.getDetails();
	}

}

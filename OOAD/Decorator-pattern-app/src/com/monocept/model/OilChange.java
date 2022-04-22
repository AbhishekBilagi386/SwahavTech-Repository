package com.monocept.model;

public class OilChange extends Decorator implements CarService {

	public OilChange(CarService service) {
		super(service);

	}

	public CarService getService() {
		return service;
	}

	@Override
	public double getCost() {
		return 1200 + service.getCost();
	}

	@Override
	public String getDetails() {
		return getClass().getSimpleName() + " Cost: 1200" + service.getDetails();

	}
}

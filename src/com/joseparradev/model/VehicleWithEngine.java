package com.joseparradev.model;

import com.joseparradev.interfaces.IEngine;

public abstract class VehicleWithEngine extends Vehicle {

	private IEngine engine;
	private int numberEngine;

	protected VehicleWithEngine(IEngine engine) {
		super();
		this.engine = engine;
	}

	protected VehicleWithEngine(IEngine engine, int numberEngine) {
		super();
		this.engine = engine;
		this.numberEngine = numberEngine;
	}

	protected VehicleWithEngine() {
		super();

	}

	protected VehicleWithEngine(String nameCompany, String mailCompany, String functionVehicleCompany, String color) {
		super(nameCompany, mailCompany, functionVehicleCompany, color);
	}

	public IEngine getEngine() {
		return engine;
	}

	public void setEngine(IEngine engine) {
		this.engine = engine;
	}

	public int getNumberEngine() {
		return numberEngine;
	}

	public void setNumberEngine(int numberEngine) {
		this.numberEngine = numberEngine;
	}

}

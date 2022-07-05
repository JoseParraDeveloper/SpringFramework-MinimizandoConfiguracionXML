package com.joseparradev.model;

import com.joseparradev.interfaces.IEngine;

public class Airplane extends VehicleWithEngine {

	public Airplane() {
		super();
	}

	public Airplane(IEngine engine) {
		super(engine);
	}

	@Override
	public String getCharacteristicsVehicle() {
		return String.format(
				"Nombre de la Empresa: %s, Email de la Empresa: %s, Función del Vehiculo dentro de la Empresa: %s, Color: %s, Engine :  %s y tiene %s motores.",
				getNameCompany(), getMailCompany(), getFunctionVehicleCompany(), getColor(),
				getEngine().getDescriptionEngine(), getNumberEngine());
	}

}

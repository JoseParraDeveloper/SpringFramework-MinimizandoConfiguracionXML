package com.joseparradev.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.joseparradev.interfaces.IEngine;

@Component("motorCycle")
public class MotorCycle extends VehicleWithEngine {

	public MotorCycle() {
		super();

	}

	public MotorCycle(IEngine engine, int numberEngine) {
		super(engine, numberEngine);

	}

	@Autowired
	public MotorCycle(@Qualifier("engineMotorCycle") IEngine engine) {
		super(engine);

	}

	public MotorCycle(String nameCompany, String mailCompany, String functionVehicleCompany, String color) {
		super(nameCompany, mailCompany, functionVehicleCompany, color);

	}

	@Override
	public String getCharacteristicsVehicle() {

		return String.format(
				"Nombre de la Empresa: %s, Email de la Empresa: %s, Función del Vehiculo dentro de la Empresa: %s, Color: %s, Engine :  %s y tiene %s motores.",
				getNameCompany(), getMailCompany(), getFunctionVehicleCompany(), getColor(),
				getEngine().getDescriptionEngine(), getNumberEngine());
	}

}

package com.joseparradev.model;

import com.joseparradev.interfaces.IEngine;

public class EngineAirplane implements IEngine {

	@Override
	public String getDescriptionEngine() {
		return "Estas son las características del Motor de un Avión...";
	}

}

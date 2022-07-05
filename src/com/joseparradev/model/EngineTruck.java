package com.joseparradev.model;

import com.joseparradev.interfaces.IEngine;

public class EngineTruck implements IEngine{

	@Override
	public String getDescriptionEngine() {
		return "Estas son las características del Motor de un Camión...";
	}

}

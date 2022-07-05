package com.joseparradev.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.joseparradev.interfaces.IEngine;

@Component
@Qualifier("engineMotorCycle")
public class EngineMotorCycle implements IEngine {

	@Override
	public String getDescriptionEngine() {
		return "Estas son las características del Motor de una Moto...";
	}

}

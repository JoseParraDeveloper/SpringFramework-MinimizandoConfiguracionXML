package com.joseparradev.model;

import org.springframework.stereotype.Component;

import com.joseparradev.annotations.SpecialEngineForMotorCycle;
import com.joseparradev.interfaces.IEngine;

@Component
@SpecialEngineForMotorCycle
public class SpecialEngineMotorCycle implements IEngine {

	@Override
	public String getDescriptionEngine() {
		return "Este es un Motor especial para una Moto de cuatro ruedas....";
	}

}

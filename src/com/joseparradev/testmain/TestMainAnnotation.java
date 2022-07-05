package com.joseparradev.testmain;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.joseparradev.model.MotorCycle;

public class TestMainAnnotation {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");

		MotorCycle motorCycle = contexto.getBean("motorCycle", MotorCycle.class);

		System.out.println(motorCycle.getCharacteristicsVehicle());

		contexto.close();

	}

}

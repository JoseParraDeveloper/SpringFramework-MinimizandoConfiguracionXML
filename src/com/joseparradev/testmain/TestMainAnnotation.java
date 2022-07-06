package com.joseparradev.testmain;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.joseparradev.model.FourWheelMotorcycle;
import com.joseparradev.model.MotorCycle;

public class TestMainAnnotation {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");

		MotorCycle motorCycle = contexto.getBean("motorCycle", MotorCycle.class);
		motorCycle.setColor("Rojo");
		motorCycle.setNumberEngine(1);
		FourWheelMotorcycle fourWheelMotorcycle = contexto.getBean(FourWheelMotorcycle.class);
		fourWheelMotorcycle.setColor("Azul");
		fourWheelMotorcycle.setNumberEngine(2);

		System.out.println(motorCycle.getCharacteristicsVehicle());
		System.out.println(fourWheelMotorcycle.getCharacteristicsVehicle());

		contexto.close();

	}

}

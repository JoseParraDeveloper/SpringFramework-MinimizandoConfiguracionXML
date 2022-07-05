package com.joseparradev.testmain;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.joseparradev.model.Car;
import com.joseparradev.model.Vehicle;
import com.joseparradev.model.Airplane;
import com.joseparradev.model.Truck;

public class TestMain {

	private static final Logger LOGGER = Logger.getLogger("testmain");

	public static void main(String[] args) {
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");

		Car car = contexto.getBean("car", Car.class);
		car.setNumberEngine(1);
		car.setColor("Azul");

		Car car1 = contexto.getBean("car1", Car.class);
		car1.setNumberEngine(1);
		car1.setColor("Negro");

		Truck truck = contexto.getBean("truck", Truck.class);
		truck.setNumberEngine(2);
		truck.setColor("Rojo");
		Airplane airplane = contexto.getBean("airplane", Airplane.class);
		airplane.setNumberEngine(4);
		airplane.setColor("Verde");

		List<Vehicle> listVehicle = new ArrayList<>();
		listVehicle.add(car);
		listVehicle.add(car1);
		listVehicle.add(truck);
		listVehicle.add(airplane);
		for (Vehicle vehicle : listVehicle) {
			LOGGER.log(Level.INFO, vehicle.getCharacteristicsVehicle());
		}
		contexto.close();
	}

}

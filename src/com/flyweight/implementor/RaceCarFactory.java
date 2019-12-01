package com.flyweight.implementor;

import java.util.HashMap;

import com.flyweight.Implementation.MultiplayerCar;
import com.flyweight.Implementation.SprintCar;
import com.flyweight.model.RaceCar;

public class RaceCarFactory {
	
	
	private static HashMap<String, RaceCar> flyweightObject = new HashMap<>();
	
	public static RaceCar getCar(String carAsKey) {
		RaceCar raceCar;
		
		if(flyweightObject.containsKey(carAsKey)) {
			return flyweightObject.get(carAsKey);
		}
		
		
		switch(carAsKey) {
		
		case "Sprint":
			raceCar = new SprintCar();
			raceCar.name="Sprint";
			raceCar.speed=120;
			raceCar.hp=500;
			flyweightObject.put(carAsKey, raceCar);
			return raceCar;
			
		case "Multiplayer":
			raceCar = new MultiplayerCar();
			raceCar.name = "Multiplayer";
			raceCar.hp = 1000;
			flyweightObject.put(carAsKey, raceCar);
			return raceCar;
			
		default:
			throw new IllegalArgumentException("Unsupported car type");
		}
	}
}

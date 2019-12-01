package com.flyweight.client;

import com.flyweight.implementor.RaceCarFactory;
import com.flyweight.model.RaceCar;

public class RaceCarClient {
	private RaceCar raceCar;
	public RaceCarClient(String carName) {
		 raceCar = RaceCarFactory.getCar(carName);
	}
	
	private int currentX = 0;
	private int currentY = 0;
	
	public void moveCar(int newX, int newY) {
		raceCar.moveCar(currentX, currentY, newX, newY);
		currentX = newX;
		currentY = newY;
	}
}

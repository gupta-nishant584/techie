package com.flyweight.Implementation;

import com.flyweight.model.RaceCar;

public class MultiplayerCar extends RaceCar{
	public static int num;
	
	public MultiplayerCar() {
		num++;
	}

	@Override
	public void moveCar(int currentX, int currentY, int newX, int newY) {
		System.out.println("New Location of multiplayer car: "+this.name+" is X : "+newX+ " and Y :"+newY );
		
	}
	
	
}

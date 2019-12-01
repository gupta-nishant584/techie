package com.flyweight.Implementation;

import com.flyweight.model.RaceCar;

public class SprintCar extends RaceCar{
	public static int num;
	
	public SprintCar(){
		num++;
	}

	@Override
	public void moveCar(int currentX, int currentY, int newX, int newY) {
		System.out.println("New Location of sprint car: "+this.name+" is X : "+newX+ " and Y :"+newY );
		
	}
}

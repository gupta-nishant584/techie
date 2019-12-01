package com.flyweight.model;

public abstract class RaceCar {
	
	public String name;
	
	public int speed;
	
	public int hp;
	
	public abstract void moveCar(int currentX, int currentY, int newX, int newY);

}

package com.flyweight.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.flyweight.Implementation.MultiplayerCar;
import com.flyweight.Implementation.SprintCar;
import com.flyweight.client.RaceCarClient;

public class RaceCarTest {

	@Test
	public void test() {
		
		RaceCarClient raceCarClient[] = {
				new RaceCarClient("Sprint"),
				new RaceCarClient("Sprint"),
				new RaceCarClient("Sprint"),
				new RaceCarClient("Multiplayer"),
				new RaceCarClient("Multiplayer"),
				new RaceCarClient("Multiplayer")
				};
		raceCarClient[0].moveCar(30,100);
		raceCarClient[1].moveCar(40,110);
		raceCarClient[2].moveCar(12,23);
		raceCarClient[3].moveCar(30,45);
		raceCarClient[4].moveCar(20,104);
		raceCarClient[5].moveCar(33,155);
		
		System.out.println("Sprint Car Instances" + SprintCar.num);
		System.out.println("Sprint Multiplayer" + MultiplayerCar.num);
	}

}

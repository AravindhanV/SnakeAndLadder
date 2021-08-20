package com.bridgelabz.snakeandladder;

public class SnakeAndLadder {
	public static void main(String[] args) {
		System.out.println("Welcome to Snake And Ladder Simulator");
		
		int playerPos = 0;
		//Roll a Die
		int dieRoll = (int) Math.floor(Math.random()*6)+1;
		int action = (int)Math.floor(Math.random()*3);
		System.out.println("Player Rolled "+dieRoll);
		
		switch(action) {
		case 0: break; //Do Nothing
		case 1: playerPos += dieRoll; //Ladder
		break;
		case 2: playerPos -= dieRoll;
		break;
		}
	}
}

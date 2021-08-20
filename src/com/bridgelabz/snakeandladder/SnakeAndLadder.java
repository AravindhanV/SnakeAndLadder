package com.bridgelabz.snakeandladder;

public class SnakeAndLadder {
	public static void main(String[] args) {
		System.out.println("Welcome to Snake And Ladder Simulator");
		
		int playerPos = 0;
		//Roll a Die
		while(playerPos<100) {
			int dieRoll = (int) Math.floor(Math.random()*6)+1;
			int action = (int)Math.floor(Math.random()*3);
			switch(action) {
			case 0: break; //Do Nothing
			case 1: playerPos += dieRoll; //Ladder
			playerPos = playerPos>100 ? playerPos-dieRoll : playerPos;
			break;
			case 2: playerPos -= dieRoll; //Snake
			playerPos = playerPos<0 ? 0 : playerPos;
			break;
			}
		}
	}
}

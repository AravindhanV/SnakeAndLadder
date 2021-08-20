package com.bridgelabz.snakeandladder;

public class SnakeAndLadder {
	public static void main(String[] args) {
		System.out.println("Welcome to Snake And Ladder Simulator");
		
		int playerPos = 0;
		//Roll a Die
		int dieRoll = (int) Math.ceil(Math.random()*6);
		System.out.println("Player Rolled "+dieRoll);
	}
}

package com.bridgelabz.snakeandladder;

public class SnakeAndLadder {
	public static void main(String[] args) {
		System.out.println("Welcome to Snake And Ladder Simulator");
		
		int[] playerPos = {0,0};
		int turnFlag = 0;
		int[] noOfTurns = {0,0};
		//Roll a Die
		while(playerPos[0]<100 && playerPos[1]<100) {
			int dieRoll = (int) Math.floor(Math.random()*6)+1;
			int action = (int)Math.floor(Math.random()*3);
			noOfTurns[turnFlag]++;
			switch(action) {
			case 0: break; //No Move
			case 1: playerPos[turnFlag] += dieRoll; //Ladder
			playerPos[turnFlag] = playerPos[turnFlag]>100 ? playerPos[turnFlag]-dieRoll : playerPos[turnFlag];
			break;
			case 2: playerPos[turnFlag] -= dieRoll; //Snake
			playerPos[turnFlag] = playerPos[turnFlag]<0 ? 0 : playerPos[turnFlag];
			break;
			}
			System.out.println("Player "+(turnFlag+1)+" is now at "+playerPos[turnFlag]);
			
			if(action == 0 || action == 2) {
				turnFlag = (turnFlag+1)%2; 
			}
		}
		
		int winner = playerPos[0] == 100 ? 1 : 2;
		System.out.println("\nPlayer "+winner+" won the game in "+noOfTurns[winner-1]+" turns");
	}
}

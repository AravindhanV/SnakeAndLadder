package com.bridgelabz.snakeandladder;

public class SnakeAndLadder {
	public static final int NO_PLAY=0;
	public static final int LADDER=1;
	public static final int SNAKE=2;
	

	public static void main(String[] args) {
		System.out.println("Welcome to Snakes and Ladders Simulator");
		
		int positionOfPlayer1=0,positionOfPlayer2=0;
		int rollsOfPlayer1=0,rollsOfPlayer2=0;
		int roll=0, option=0, turn=1;
		while(positionOfPlayer1<100 && positionOfPlayer2<100) {
			roll=(int)Math.floor(Math.random()*6)+1;
			if(turn==1)
				rollsOfPlayer1++;
			else
				rollsOfPlayer2++;
			option=(int)Math.floor(Math.random()*3);
			
			if(option==NO_PLAY)
				turn=(turn==1)?2:1;
			else if(option==LADDER) {
				switch(turn) {
				case 1: positionOfPlayer1=(positionOfPlayer1+roll>100?positionOfPlayer1: positionOfPlayer1+roll);
						break;
				case 2: positionOfPlayer2=(positionOfPlayer2+roll>100?positionOfPlayer2: positionOfPlayer1+roll);
						break;
				}
				
			}
			else {
				switch(turn) {
				case 1: positionOfPlayer1=(positionOfPlayer1-roll<0?0: positionOfPlayer1-roll);
						turn=2;
						break;
				case 2: positionOfPlayer2=(positionOfPlayer2-roll<0?0: positionOfPlayer2-roll);
						turn=1;
						break;
				}
			}
			
		
		}
		int winner=positionOfPlayer1==100?1:2;
		System.out.println("Winner of the game is Player "+winner);
	}
}

package com.bridgelabz;

import java.util.Scanner;

/***
 * 
 * @author Admin
 *
 */
public class SnakeAndLadder {
	/***
	 * 
	 * @param args
	 */
	static int startPosition=0;
	static int method1() {
		int player1=startPosition;
		int diceRoll=(int)Math.floor(Math.random()*10)%6+1;
		player1=diceRoll;
		return player1;
	}
	

public static void main(String args[]) {
	int player1=method1();
	System.out.println(player1);
}
}
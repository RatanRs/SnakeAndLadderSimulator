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
public static void main(String args[]) {
	/*
	 * Printing welcome meassge.
	 */
	System.out.println("Enter the Number of players");
	Scanner object=new Scanner(System.in);
	int player1=object.nextInt();
	player1=startPosition;
	System.out.println("player1 Starting position = "+startPosition);
	
}
}

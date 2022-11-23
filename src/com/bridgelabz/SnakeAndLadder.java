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
	 static final int START_POSITION=0;
	    static final int NO_PLAY=0;
	    static final int LADDER=1;
	    static final int SNAKE=2;
	    static int move=0;
	    static int snakeLadder(){
	        int player=START_POSITION;
	        int i=1;
	        while(move<++move){
	            int diceRoll = (int) Math.floor(Math.random() * 10) % 6 + 1;
	            int checkOption = (int) Math.floor(Math.random() * 10) % 3;
	            switch (checkOption) {
	                case NO_PLAY:
	                    player = player;
	                    break;
	                case LADDER:
	                    player = player+diceRoll;
	                    break;
	                case SNAKE:
	                    player = player - diceRoll;
	                    break;
	            }
	            if(player<START_POSITION){
	                player=START_POSITION;
	            }
	            if(player>100){
	                player=player-diceRoll;
	            }
	            if(player==100)
	                    break;
	            System.out.println("Position after "+i+" roll "+player);
	            ;
	            move++;
	        }
	        return player;
	    }
	    public static void main(String[] args) {
	        int player=snakeLadder();
	        System.out.println("Reached the winning position "+player);
	        System.out.println("Number of time dice rolled "+move/2);
	    }
	}


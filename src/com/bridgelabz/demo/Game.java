package com.bridgelabz.demo;

public class Game {
	public static void main(String[] args) {
		int player = 0;
		System.out.print("Player intitial position: " + player);
		
		int dice = (int) ((Math.random() * 10) % 6) + 1;
		System.out.println("Dice is rolled " + dice);

	}
}

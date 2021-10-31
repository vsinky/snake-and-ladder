package com.bridgelabz.demo;

public class Game {
	public static void main(String[] args) {
		final int NO_PLAY = 0;
		final int snake = 1;
		final int ladder = 2;
		int player = 0;
		int dice = (int) ((Math.random() * 10) % 6) + 1;
		int act = (int) ((Math.random() * 10) % 3);
		switch (act) {
		case NO_PLAY:
			break;
		case snake:
			player = player - dice;
			break;
		case ladder:
			player = player + dice;
			break;

		}
		System.out.println("Dice is rolled " + dice);
		System.out.println("player position " + player);

	}
}

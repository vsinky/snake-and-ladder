package com.bridgelabz.demo;

public class Game {
	final static int MAX_POSITION = 100;

	public static void main(String[] args) {
		final int NO_PLAY = 0;
		final int snake = 1;
		final int ladder = 2;
		int player = 0;

		while (player < MAX_POSITION) {

			int dice = (int) ((Math.random() * 10) % 6) + 1;

			int act = (int) ((Math.random() * 10) % 3);

			switch (act) {

			case NO_PLAY:
				break;

			case snake:
				int temp1 = player - dice;
				if (temp1 < 0)
					player = 0;
				else
					player = temp1;
				break;

			case ladder:

				int temp2 = player + dice;
				if (temp2 <= 100)
					player = temp2;

				break;

			}
			System.out.println("Dice is rolled " + dice);
			System.out.println("player position " + player);

		}
	}
}

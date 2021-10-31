package com.bridgelabz.demo;

public class Game {
	final static int MAX_POSITION = 100;

	public static void main(String[] args) {
		final int NO_PLAY = 0;
		final int snake = 1;
		final int ladder = 2;
		int player = 0;
		int NO_OF_DICE_ROLLED = 0;

		while (player < MAX_POSITION) {

			int dice = (int) ((Math.random() * 10) % 6) + 1;

			int act = (int) ((Math.random() * 10) % 3);
			String action = "";
			switch (act) {

			case NO_PLAY:
				action = "no_play";
				break;

			case snake:
				action = "snake ";
				int temp1 = player - dice;
				if (temp1 < 0)
					player = 0;
				else
					player = temp1;
				break;

			case ladder:
				action = "ladder";
				int temp2 = player + dice;
				if (temp2 <= 100)
					player = temp2;

				break;

			}
			NO_OF_DICE_ROLLED++;

			System.out.println("Die:" + dice + " \t action: " + action + " \t player position " + player);
		}
		System.out.println("Total number of dice rolled to win the game is " + NO_OF_DICE_ROLLED);

	}
}

package com.aurionpro;

import java.util.Scanner;
import java.util.Random;

public class PigGame {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		int totalScore = 0;
		int currentTurnScore = 0;
		int turn = 1;

		System.out.println("Let's Play PIG!");

		while (totalScore < 20) {
			System.out.println("TURN " + turn);
			System.out.print("Roll or hold? (r/h): ");
			char choice = scanner.next().charAt(0);

			if (choice == 'r') {
				int die = random.nextInt(6) + 1;
				System.out.println("Die: " + die);

				if (die == 1) {
					System.out.println("Turn over. No score.");
					currentTurnScore = 0;
					turn++;
				} else {
					currentTurnScore += die;
				}
			} else if (choice == 'h') {
				totalScore += currentTurnScore;
				currentTurnScore = 0;
				System.out.println("Score for turn: " + totalScore);
				System.out.println("Total score: " + totalScore);
				turn++;
			} else {
				System.out.println("Invalid choice. Please enter 'r' to roll or 'h' to hold.");
			}
		}

		System.out.println("You finished in " + (turn - 1) + " turns!");
		System.out.println("Game over!");

		scanner.close();
	}
}

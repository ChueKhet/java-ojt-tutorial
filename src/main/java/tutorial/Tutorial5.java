package main.java.tutorial;
import java.util.Scanner;
import java.util.*;
public class Tutorial5 {

	public static void main(String[] args) {

		final int rock = 0;
		final int paper = 1;
		final int scissor = 2;

		Scanner scanDiff = new Scanner(System.in);
		System.out.print("Enter Computer Difficult (easy,normal): ");
		String difficult = scanDiff.next().toString();

		Scanner scanChoice = new Scanner(System.in);

		if (difficult.equals("easy")) {

			int userChoice = 0;
			for (int i = 0; i < 3; i++) {

				System.out.print("Enter your input(rock,paper,scissor): ");
				String uChoice = scanChoice.nextLine();

				if (uChoice.equals("rock")) {

					userChoice = rock;

				} else if (uChoice.equals("paper")) {

					userChoice = paper;

				} else if (uChoice.equals("scissor")) {
					userChoice = scissor;

				}

				Random rnd = new Random();
				int computerChoice = rnd.nextInt(3);
				
				if (computerChoice == userChoice) {
					System.out.println("This is same choice,Please try again");
				} else {

					if (computerChoice == rock) {
						if (userChoice == paper) {
							System.out.println("User wins!");
						} else {
							System.out.println("Computer Wins");
						}
					} else if (computerChoice == paper) {
						if (userChoice == rock) {
							System.out.println("Computer wins");
						} else {
							System.out.println("User Wins!");
						}
					} else if (userChoice == rock) {
						System.out.println("User Wins");
					} else {
						System.out.println("Computer Wins");
					}
				}
			}
		} else {
			System.out.println("System break!");
		}
		scanDiff.close();
		scanChoice.close();
	}

}

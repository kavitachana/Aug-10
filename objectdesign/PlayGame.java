package com.kavita.objectdesign;

import java.util.Scanner;

public class PlayGame {

	static Scanner play = new Scanner(System.in);
	static boolean userFailed = false;
	static boolean stillPlaying = true;

	public static void main(String[] args) {

		while (stillPlaying) {

			startGame();
		}
	}

	public static boolean startGame() {

		System.out.println("\nWelcome to the Best of Them All game!\n");
		System.out.println("Please enter 1 if you want to be a Wizard, or 2 if you want to be an Archer: ");
		String charChoice = play.nextLine();

		switch (charChoice) {
		case "1":
			theWizard();
			break;

		case "2":
			theArcher();
			break;

		default:
			System.out.println("I'm sorry, you've made an error. Please restart the game.");
			System.exit(0);
		}

		return stillPlaying;
	}

	public static boolean theWizard() {

		String userInput = null;
		String playAgain = null;

		Wizard wizardA = new Wizard();

		System.out.println("Please enter a name for your wizard: ");
		userInput = play.nextLine();
		wizardA.setName(userInput);

		System.out.println("Is your wizard a female or male? ");
		userInput = play.nextLine();
		wizardA.setGender(userInput);

		System.out.println("What color eyes does your wizard have? ");
		userInput = play.nextLine();
		wizardA.setEyeColor(userInput);

		System.out.println("What color hair does your wizard have? ");
		userInput = play.nextLine();
		wizardA.setHairColor(userInput);

		do {

			System.out.println("How old is your wizard? ");
			userInput = play.nextLine();
			userFailed = ageIsValid(userInput);

		} while (userFailed);

		int age = Integer.parseInt(userInput);
		wizardA.setAge(age);

		do {

			System.out.println("How tall is your wizard? ");
			userInput = play.nextLine();
			userFailed = heightIsValid(userInput);

		} while (userFailed);

		float height = Float.parseFloat(userInput);
		wizardA.setHeight(height);

		System.out.println("What color cape does your wizard have? ");
		userInput = play.nextLine();
		wizardA.setCapeColor(userInput);

		do {

			System.out.println("How many staffs does your wizard have? ");
			userInput = play.nextLine();
			userFailed = ageIsValid(userInput);

		} while (userFailed);

		int staffNums = Integer.parseInt(userInput);
		wizardA.setNumOfStaffs(staffNums);

		System.out.println("\nCongratulations! You have created a wizard named " + wizardA.getName() + " with a "
				+ wizardA.getCapeColor() + " cape.");
		System.out.println("\t" + wizardA.getName() + " is a " + wizardA.getGender() + " with " + wizardA.getHairColor()
				+ " hair and " + wizardA.getEyeColor() + " eyes.");
		System.out.println("\t" + wizardA.getName() + " the wizard is " + wizardA.getAge() + " years old, "
				+ wizardA.getHeight() + " ft tall, and has " + wizardA.getNumOfStaffs() + " staffs.");
		System.out.print("\t" + wizardA.getName() + " ");
		wizardA.eats();
		wizardA.sleeps();
		wizardA.moves();
		wizardA.attackPoints();

		System.out.println("\nWould you like to play again? Y or N");
		playAgain = play.nextLine();
		restart(playAgain);

		return stillPlaying;
	}

	public static boolean theArcher() {

		String userInput = null;
		String inForest = null;
		String playAgain = null;

		Archer archerA = new Archer();

		System.out.println("Please enter a name for your archer: ");
		userInput = play.nextLine();
		archerA.setName(userInput);

		System.out.println("Is your archer a female or male? ");
		userInput = play.nextLine();
		archerA.setGender(userInput);

		System.out.println("What color eyes does your archer have? ");
		userInput = play.nextLine();
		archerA.setEyeColor(userInput);

		System.out.println("What color hair does your archer have? ");
		userInput = play.nextLine();
		archerA.setHairColor(userInput);

		do {

			System.out.println("How old is your archer? ");
			userInput = play.nextLine();
			userFailed = ageIsValid(userInput);

		} while (userFailed);

		int age = Integer.parseInt(userInput);
		archerA.setAge(age);

		do {

			System.out.println("How tall is your archer? ");
			userInput = play.nextLine();
			userFailed = heightIsValid(userInput);

		} while (userFailed);

		float height = Float.parseFloat(userInput);
		archerA.setHeight(height);

		do {

			System.out.println("How many bows does your archer have? ");
			userInput = play.nextLine();
			userFailed = ageIsValid(userInput);

		} while (userFailed);

		int bowNums = Integer.parseInt(userInput);
		archerA.setNumOfBows(bowNums);

		do {

			System.out.println("Does your archer live in the forest? (Please enter y for yes or n for no)");
			userInput = play.nextLine();

			if (userInput.equalsIgnoreCase("yes") || userInput.equalsIgnoreCase("y")) {

				inForest = "lives in the forest";
				userFailed = false;

			} else if (userInput.equalsIgnoreCase("no") || userInput.equalsIgnoreCase("n")) {

				inForest = "does not live in the forest";
				userFailed = false;
			} else {

				System.out.println("Please enter y or n only.");
				userFailed = true;

			}

		} while (userFailed);

		archerA.setLivesInForest(inForest);

		System.out.println("\nCongratulations! You have created an archer named " + archerA.getName() + " who "
				+ archerA.getLivesInForest() + ".");
		System.out.println("\t" + archerA.getName() + " is a " + archerA.getGender() + " with " + archerA.getHairColor()
				+ " hair and " + archerA.getEyeColor() + " eyes.");
		System.out.println("\t" + archerA.getName() + " the archer is " + archerA.getAge() + " years old, "
				+ archerA.getHeight() + " ft tall, and has " + archerA.getNumOfBows() + " bows.");
		System.out.print("\t" + archerA.getName() + " ");
		archerA.eats();
		archerA.sleeps();
		archerA.moves();
		archerA.attackPoints();

		System.out.println("\nWould you like to play again? Y or N");
		playAgain = play.nextLine();
		restart(playAgain);

		return stillPlaying;
	}

	public static boolean ageIsValid(String ageNum) {

		try {
			int isANum = Integer.parseInt(ageNum);
			return false;

		} catch (NumberFormatException e) {
			return true;
		}
	}

	public static boolean heightIsValid(String heightNum) {

		try {
			float isANum = Float.parseFloat(heightNum);
			return false;

		} catch (NumberFormatException e) {
			return true;

		}
	}

	public static boolean livesIsValid(String livesInForest) {

		if ((livesInForest == "y") || (livesInForest == "n")) {
			return true;

		} else {

			return false;
		}
	}

	private static boolean restart(String playAgain) {

		if (playAgain.equalsIgnoreCase("yes") || playAgain.equalsIgnoreCase("y")) {

			stillPlaying = true;
		} else {

			System.out.println("Game Over.");
			stillPlaying = false;
		}

		return stillPlaying;
	}

} 

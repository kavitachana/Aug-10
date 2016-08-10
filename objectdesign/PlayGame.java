package com.kavita.objectdesign;

import java.util.Scanner;

public class PlayGame {

	static Scanner play = new Scanner(System.in);
	static boolean userFailed = false;

	public static void main(String[] args) {

		System.out.println("Welcome to the Best of Them All game!\n");
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
		} // switch

	} // main

	public static void theWizard() {

		String userInput = null;

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

		System.out.println(wizardA.toString());
	}

	public static void theArcher() {

		String userInput = null;
		String inForest = null;

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


		System.out.println("Does your archer live in the forest? ");
		userInput = play.nextLine().toLowerCase();

		if (userInput.equalsIgnoreCase("y")) {
			inForest = "live in the forest";
		} 
		
		else {
			inForest = "do not live the forest";
		}
		
		archerA.setLivesInForest(inForest);
		System.out.println(archerA.toString());
		
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
//			System.out.println("Please Enter 'y' or 'n' only");
			return false;
		}
	}

} // class

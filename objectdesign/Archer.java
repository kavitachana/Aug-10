package com.kavita.objectdesign;

public class Archer extends Human {

	protected int numOfBows = 0;
	protected String livesInForest = null;
	
	public Archer(String name, String gender, String eyeColor, String hairColor, int age, float height, int numOfBows,
			String livesInForest) {
		super(name, gender, eyeColor, hairColor, age, height);
		this.numOfBows = numOfBows;
		this.livesInForest = livesInForest;
	}

	public Archer() {
		
	}
	
	@Override
	public void eats() {

		System.out.println("You are a vegetarian.");
		
	}

	public void moves() {
		
		int location = 0;
		location += 2;
		System.out.println("You moved " + location + " spaces.");
		
	}

	@Override
	public void attackPoints() {

		int damageCaused = 3;
		System.out.println("You casued " + damageCaused + " point of damage.");
		
	}

	public int getNumOfBows() {
		return numOfBows;
	}

	public void setNumOfBows(int numOfBows) {
		this.numOfBows = numOfBows;
	}

	public String isLivesInForest() {
		return livesInForest;
	}

	public void setLivesInForest(String livesInForest) {
		this.livesInForest = livesInForest;
	}

	@Override
	public String toString() {
		return "Congratulations!  You have created a " + gender + " archer named " + name + " who is " + age + " years old and has " + eyeColor + " eyes, " +  hairColor + " hair, and is "  
		+ height + "ft tall.  They " + livesInForest + " and have " + numOfBows + " bows.";
	}

	
}

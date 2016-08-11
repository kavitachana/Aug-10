package com.kavita.objectdesign;

public class Archer extends Human {

	protected int numOfBows = 0;
	protected String livesInForest = null;

	public Archer() {

	}

	@Override
	public void eats() {

		System.out.print("is a vegetarian who ");

	}

	public void moves() {

		int location = 0;
		location += 2;
		System.out.print("Your archer moved " + location + " spaces and ");

	}

	@Override
	public void attackPoints() {

		int damageCaused = 3;
		System.out.println("casued " + damageCaused + " points of damage.");

	}

	public int getNumOfBows() {
		return numOfBows;
	}

	public void setNumOfBows(int numOfBows) {
		this.numOfBows = numOfBows;
	}

	public String getLivesInForest() {
		return livesInForest;
	}

	public void setLivesInForest(String livesInForest) {
		this.livesInForest = livesInForest;
	}

}

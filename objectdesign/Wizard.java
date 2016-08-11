package com.kavita.objectdesign;

public class Wizard extends Human {

	protected String capeColor = null;
	protected int numOfStaffs = 0;

	public Wizard() {

	}

	@Override
	public void sleeps() {

		System.out.println("sleeps during the day and attacks at night. ");

	}

	public void moves() {

		int location = 0;
		location += 3;
		System.out.print("Your wizard moved " + location + " spaces and ");

	}

	@Override
	public void attackPoints() {

		int damageCaused = 5;
		System.out.println("casued " + damageCaused + " points of damage.");

	}

	public String getCapeColor() {
		return capeColor;
	}

	public void setCapeColor(String capeColor) {
		this.capeColor = capeColor;
	}

	public int getNumOfStaffs() {
		return numOfStaffs;
	}

	public void setNumOfStaffs(int numOfStaffs) {
		this.numOfStaffs = numOfStaffs;
	}

}

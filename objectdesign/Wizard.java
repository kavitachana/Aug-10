package com.kavita.objectdesign;

public class Wizard extends Human {

	protected String capeColor = null;
	protected int numOfStaffs = 0;

	
	public Wizard(String name, String gender, String eyeColor, String hairColor, int age, float height,
			String capeColor, int numOfStaffs) {
		super(name, gender, eyeColor, hairColor, age, height);
		this.capeColor = capeColor;
		this.numOfStaffs = numOfStaffs;
	}

	public Wizard() {
		
	}

	@Override
	public void sleeps() {

		System.out.println("You sleep during the day and attack at night.");
		
	}

	public void moves() {
		
		int location = 0;
		location += 3;
		System.out.println("You moved " + location + " spaces.");
		
	}

	@Override
	public void attackPoints() {

		int damageCaused = 5;
		System.out.println("You casued " + damageCaused + " point of damage.");
		
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

	@Override
	public String toString() {
		return "Congratulations!  You have created a " + gender + " wizard named " + name + " who is " + age + " years old and has " + eyeColor + " eyes, " +  hairColor + " hair, and is "  
				+ height + "ft tall.  They have a " + capeColor + " cape and " + numOfStaffs + " staffs.";
	}
	
	


}

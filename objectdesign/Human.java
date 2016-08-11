package com.kavita.objectdesign;

public class Human extends Character implements HumanInterface {

	public String name = null;
	public String gender = null;
	public String eyeColor = null;
	public String hairColor = null;
	public int age = 0;
	public float height = 0.0f;

	public Human(String name, String gender, String eyeColor, String hairColor, int age, float height) {
		this.name = name;
		this.gender = gender;
		this.eyeColor = eyeColor;
		this.hairColor = hairColor;
		this.age = age;
		this.height = height;
	}

	public Human() {

	}

	@Override
	public void eats() {

		System.out.print("is an omnivore who ");

	}

	@Override
	public void sleeps() {

		System.out.println("sleeps at night and attacks during the day. ");

	}

	@Override
	public void moves() {

		int location = 0;
		location++;
		System.out.println("Your human moved " + location + " spaces and ");

	}

	@Override
	public void attackPoints() {
		
		int damageCaused = 1;
		System.out.println("casued " + damageCaused + " points of damage.");

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEyeColor() {
		return eyeColor;
	}

	public void setEyeColor(String eyeColor) {
		this.eyeColor = eyeColor;
	}

	public String getHairColor() {
		return hairColor;
	}

	public void setHairColor(String hairColor) {
		this.hairColor = hairColor;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

}

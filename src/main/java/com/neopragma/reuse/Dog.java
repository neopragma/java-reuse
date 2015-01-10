package com.neopragma.reuse;

public class Dog {
	
	private String name;
	private Breed breed;
	private int steps;
	private static final int STAMINA = 100;
	
	public Dog(String name, Breed breed) {
		this.name = name;
		this.breed = breed;
	}
	
	public String getName() {
		return name;
	}
	
	public Breed getBreed() {
		return breed;
	}
	
	public String bark() {
		return "Woof!";
	}
	
	public boolean walk(int steps) {
		this.steps += steps;
		return isReadyForAction();
	}

	public boolean drink(int licks) {
		this.steps -= licks * 3;
		return isReadyForAction();
	}
	
	public boolean isReadyForAction() {
		return this.steps < STAMINA ? true : false;		
	}
}

package edu.monmouth.assignment1;

public class Dog implements Animal {

	String furColor = "";
	
//getter and setter methods for dogs fur color
	public Dog(String furColor) {
		setFurColor(furColor);
	}


	private void setFurColor(String furColor) {
		this.furColor = furColor;
	}
	
	
	protected String getFurColor() {
		return furColor;
	}
	
	
	@Override
	public void move() {
		System.out.println("Dog has moved");
		
	}

	@Override
	public void sound() {
		System.out.println("dog is barking");
		
	}

	
	public String toString() {
		return "The dogs fur color is: " + getFurColor();
	}


	
	
	
	
	
	
	
	
	
	
}

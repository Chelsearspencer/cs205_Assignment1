package edu.monmouth.assignment1;

public class Fish implements Animal {
	String color = "";

//getter and setter methods for fish color
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}

	@Override
	public void move() {
		System.out.println("Fish has moved");	
	}

	@Override
	public void sound() {
		System.out.println("fish making noise");
		
	}
	
	public Fish(String color) {
		setColor(color);
	}

	public String toString() {
		return "The fishs' color is, " + getColor();
		
	}
	
	
}

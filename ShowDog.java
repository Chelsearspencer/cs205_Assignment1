package edu.monmouth.assignment1;

public class ShowDog extends Dog{
//Show dog extends dog class, in order to print furColor string
	String breed = "";
//getter and setter methods for dog breed 
	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	public String getBreed() {
		return breed;
	}
	
	public ShowDog(String furColor,String breed) {
		super(furColor);
		setBreed(breed);
	}
	
	public String toString() {
		return "The dogs fur color is, " + furColor + " and the breed is a " + breed;
		
	}
	
	
	
}

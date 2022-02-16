package edu.monmouth.assignment1;

public class GuardDog extends Dog{
//guard dog extends dog class, in order to print furColor string
	private short meanness = 0;
//getter and setter methods for meanness levels of guard dog
	private void setMeanness(short meanness) {
		this.meanness = meanness;	
	}
	
	public int getMeanness() {
		return meanness;
	}
	
	public GuardDog(String furColor,short meanness) {
		super(furColor);
		setMeanness(meanness);
	}
	
	public String toString() {
		return "The dogs fur color is, " + getFurColor() + " and the meanness level is " + meanness;	 
	}
	
	
	
}

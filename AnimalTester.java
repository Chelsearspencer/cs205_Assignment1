package edu.monmouth.assignment1;

public class AnimalTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//Creating array and adding the elements. 	
	Animal[] animalsArray = new Animal[4];
	
	animalsArray[0] = new Dog("Black");
	animalsArray[1] = new GuardDog("Brindle",(short) 3);
	animalsArray[2] = new ShowDog("Golden","Golden Retriver");
	animalsArray[3] = new Fish("Orange");
	
	
	System.out.println(animalsArray[0]);
	System.out.println(animalsArray[1]);
	System.out.println(animalsArray[2]);
	System.out.println(animalsArray[3]);
	
	//an array to try and print the movement or noise the animals make, depending on 
	//if the word "black" is detected. 
	 for (int i=0; i < animalsArray.length; i++)
     {
         if(animalsArray[i].equals("Black"))
         
         i++;
         
     {
         if(i > 0)
     {
        System.out.println();
        animalsArray[i].move();
     }   
     
         else
     {
         System.out.println();
         animalsArray[i].sound();
     }
     }
	
		
	

}
	}}

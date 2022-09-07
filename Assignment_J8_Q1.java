/*
 *Fahduddin Khaja
 *CS120
 *Mr.Pope
 *Assignment J8
 *May 10, 2022
 */
 
 /*
 Purpose: Basketball program with Player objects and some actions
 */
 

public class Assignment_J8_Q1{																				//start of the class
	public static void main(String[] args){																	//main method start
	
		Basketball player1 = new Basketball("Lebron James",51,"Moncton");									//creating objects
		Basketball player2 = new Basketball("Michael Jordal",84,"Moncton");
		Basketball player3 = new Basketball("Shaquilled O'Neal" , 73 , "Riverview");
		Basketball player4 = new Basketball("Kobe Bryant",93,"Riverview");
		
		player1.dribble();																					//calling methods for the objects
		player2.shoot();
		player3.dribble();
	}																										//end of main method
	
}																											//end of the class

class Basketball{																							//Blueprint class
	
	String strName;																							//initializing instance variables
	String strTeam;
	int intNumber;
	
	public Basketball(String strName, int intNumber, String strTeam){										//Constructor class
		
		this.strName = strName;																				//setting the variables
		this.intNumber = intNumber;
		this.strTeam = strTeam;
		
	}
	
	public void dribble(){																					//method
		System.out.println(strName + " (Number: " + intNumber + ") playing for "+ strTeam + " is Dribbling");//output
	}
	
	public void shoot(){																					//method
		System.out.println(strName + " (Number: " + intNumber + ") playing for "+ strTeam + " Shoots");		//output
	}
	
	
}																											//end of blueprint class
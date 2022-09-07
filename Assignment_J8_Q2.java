/*
 *Fahduddin Khaja
 *CS120
 *Mr.Pope
 *Assignment J8
 *May 10, 2022
 */
 
 /*
 Purpose: Coverting Celcius to farenhight and viceversa whilst using getters and setters
 */
 
 import java.lang.*;																						//importing packages

public class Assignment_J8_Q2{																				//start of the class
	public static void main(String[] args){																	//main method start
		
		Conversion conversion1 = new Conversion();															//creating a new object
		
		conversion1.setFarenhight(25.5);																	//using the setter method
		System.out.println(String.format("%.2f", conversion1.getFarenhight()));								//outputting whatever we got back whilst formatting it and using the getter method
		
	}																										//main method end
}																											//end of class

class Conversion{																							//blueprint class
	
	private double dblCelcius;																				//declaring private variables
	private double dblFarenhight;
	
	public void setCelcius(double dblFarenhight){															//setter method
		
		this.dblCelcius = (5.0/9.0) * (dblFarenhight-32);													//calculation performed and srtting the variable
		
		
	}
		
	public double getCelcius(){																				//getter method
		
		return dblCelcius;																					//getting the varaiable
		
	}
	
	public void setFarenhight(double dblCelcius){															//setter method for the celcius to farenhight conversion
		
		this.dblFarenhight = (5.0/9.0) * (dblCelcius-32);													//Calculating the farenhight
		
	}

	public double getFarenhight(){																			//getter method
		
		return dblFarenhight;																				//getting the value of calculated farenhight
		
	}
	
	
}																											//end of blueprint class
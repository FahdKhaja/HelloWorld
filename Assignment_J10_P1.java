/*
 *Fahduddin Khaja
 *CS120
 *Mr.Pope
 *Assignment J10
 *May 24, 2022
 */
 
 /*
 Purpose: finding average of 10 numbers inputed by the user
 */
 
 import java.util.Scanner;																						//importing packages
 
 public class Assignment_J10_P1{																				//start of the class
	public static void main(String[] args){																		//main method start
	
	 Scanner fetch = new Scanner(System.in);																	//declaring a new scanner
	 double[] dblInputNumbers = new double[10];																	//declaring variables and initializing them
	 int intIndex = 0;
	 double dblTotal = 0;
	 double dblAverage = 0;
	 
	 
	 System.out.print("Please enter a number");																	

	 for(intIndex = 0; intIndex < 10; intIndex++){																//loops to get input from the user and add it to the total amount
		 
		 System.out.println();

		 System.out.print("No." + (intIndex + 1) + ":");														//asking them for input
		 

		 dblInputNumbers[intIndex] = fetch.nextDouble();														//getting inputs from the users
		
		 dblTotal += dblInputNumbers[intIndex];																	//adding numbers to the total
	 }
	 
	 System.out.println();
	 dblAverage = dblTotal / 10;																				//calculating the average
	 System.out.println("Your Average was " + dblAverage);														//output
	 
	 
	 
	 
	 
	  
	}																											//ending main method
 }																												//end of class
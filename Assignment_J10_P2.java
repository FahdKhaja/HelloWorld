/*
 *Fahduddin Khaja
 *CS120
 *Mr.Pope
 *Assignment J10
 *May 24, 2022
 */
 
 /*
 Purpose: Outputting the integers that the user inputted in the reverse order
 */
 
 import java.util.Scanner;																						//importing packages
 
 public class Assignment_J10_P2{																				//start of the class
	public static void main(String[] args){																		//main method start
	
	 Scanner fetch = new Scanner(System.in);																	//declaring a new scanner
	 int[] intInputNumbers = new int[10];																		//declaring variables and initializing them
	 int intIndex = 0;
	 int intIndexReversed = 0;
	 
	 System.out.print("Please enter a number");																	

	 for(intIndex = 0; intIndex < 10; intIndex++){																//loops in order to get the input from the users
		 
		 System.out.println();

		 System.out.print("No." + (intIndex + 1) + ":");														//asking them for input
		 
		 intInputNumbers[intIndex] = fetch.nextInt();															//getting inputs from the users
		
	 }
	 
	 System.out.println();																						//outputs
	 System.out.print("Your Numbers in Reverse Order are:");																	
	 
	 for(intIndexReversed = 9; intIndexReversed > 0; intIndexReversed--){										//loop for outputing it in reverse orders
		 
		 System.out.print("   " + intInputNumbers[intIndexReversed]);
	 
	 } 
	 

	  
	}																											//ending main method
 }																												//end of class
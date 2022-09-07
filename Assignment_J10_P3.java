/*
 *Fahduddin Khaja
 *CS120
 *Mr.Pope
 *Assignment J10
 *May 24, 2022
 */
 
 /*
 Purpose: Find the average of one column of 4 numbers for a total of 5 columns at once 
 */
 
 import java.util.Scanner;																						//importing packages
 import java.lang.*;
 
 public class Assignment_J10_P3{																				//start of the class
	public static void main(String[] args){																		//main method start
	
	 Scanner fetch = new Scanner(System.in);																	//declaring a new scanner
	 int[][] intInputNumbers = new int[4][5];																		//declaring variables and initializing them
	 int intIndexForRow = 0;
	 int intIndexForColumn = 0;
	 int intNumberNo = 0;
	 double[] dblAverage = new double[5]; 
	 int intTotalOfColumn = 0;
	 int intIndexForAverageOutput = 0;
//	 int intNumberOfNumbersOutput = 0;
	 
	 System.out.print("Please enter a number");																	//asking for input

	 for(intIndexForColumn = 0; intIndexForColumn< 5; intIndexForColumn++){										//loops in order to get the input from the users. It takes inputs filling in inputs per comlumn
		 
		 intTotalOfColumn = 0;																					//resetting the variable beacuse its a temp var that stores the total of each column that helps in finding the average wihich is stored in another array
		 
		 for (intIndexForRow = 0; intIndexForRow < 4; intIndexForRow++){										//getting input per row
			 
			 intNumberNo++;																						//checking what number it is on, helps in outputting it to the user
			 
			 System.out.println();																				//formatting the output to make it more readable to the user

			 System.out.print("No." + (intNumberNo) + ":");														//asking them for input
		 
			 intInputNumbers[intIndexForRow][intIndexForColumn] = fetch.nextInt();								//getting inputs from the users
			 
			 intTotalOfColumn += intInputNumbers[intIndexForRow][intIndexForColumn];							//adding the user inputted value into the variable so that we can calculate the average after the loop ends
			 
		 }
		 
		 dblAverage[intIndexForColumn] = intTotalOfColumn / 4;													//calculating and storing the average of the values inputed
	 }
	 
	 System.out.println();																						//outputs
	 System.out.println("Your Output Is: ");																	
	 
	 for(intIndexForRow = 0; intIndexForRow< 4; intIndexForRow++){												//Loops to output the table
		 
		 System.out.print("Row No." + (intIndexForRow + 1) + ":");												//showing the row no.
		 
		 for (intIndexForColumn = 0; intIndexForColumn < 5; intIndexForColumn++){								
			 
//			 intNumberOfNumbersOutput++

			 System.out.print("       " + intInputNumbers[intIndexForRow][intIndexForColumn]);					//outputitng the values
			 
			 
		 }
		 
		 System.out.println();																					//formatting to make it more readable for the user
		 System.out.println();
	 }
	 
	 System.out.println();																						
	 System.out.print("Averages:  " );																			// outputting the averages
	 for(intIndexForAverageOutput = 0; intIndexForAverageOutput < 5; intIndexForAverageOutput++){				//loop for outputting the averages from the array
		 
		 System.out.print("    " + String.format("%.2f", dblAverage[intIndexForAverageOutput]));				//formatting the decimals just in case
		 
	 }

	 
	 
	 
	}																											//ending main method
 }																												//end of class
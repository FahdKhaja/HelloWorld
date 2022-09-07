/*
 *Fahduddin Khaja
 *CS120
 *Mr.Pope
 *Assignment J3
 *March 23, 2022
 */
 
 /*
 Purpose: Conversion of meters, which are input by the user, into feet
 used the conversion factor of 1 metere = 1 / 0.305 foot
 */
 import java.io.*;						 																				//importing the import output stream
 
public class Assignment_J4_Q1{ 																							//declaring class
	 
	  public static void main (String[] args) throws IOException{ 														//declaing the main method; added an extra chuck that allows the program to handel exceptions and "end gracefully"  
		 
		 InputStreamReader inFetch = new InputStreamReader(System.in); 													//part of the io package, reads whats inputed bit by bit //assignment statement
		 BufferedReader stdWaitFetch = new BufferedReader(inFetch); 													//part of the io package reads whats in the input stream but in chunks //assignment statement
		 
		 String userInput; 																								//assignment statements
		 double userInputDoubleFeet, convertedValue;
		 
		 
		 System.out.println("Enter the number of feet you want to convert:"); 											//output
		 userInput = stdWaitFetch.readLine(); 																			//reads the input
		 
		 userInputDoubleFeet = Double.parseDouble(userInput); 															//converts the input from string to int so that we can do mathamatical operations
		 
		 convertedValue = userInputDoubleFeet / 0.305; 																	//converting
		 
		 System.out.println(userInputDoubleFeet + " feet in meters is " + Math.round(convertedValue * 100.0) / 100.0); 	//output
		 
		 
	 }
	 
	 
	 
 }
 
 
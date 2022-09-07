/*
 *Fahduddin Khaja
 *CS120
 *Mr.Pope
 *Assignment J9
 *May 24, 2022
 */
 
 /*
 Purpose: Checking the number of charecters input by the user
 */
 
 import java.util.Scanner;																						//importing packages
 
 public class Assignment_J9_P4{																					//start of the class
	public static void main(String[] args){																		//main method start
	
	 Scanner fetch = new Scanner(System.in);																	//declaring a new scanner
	 
	 String strAllStrings = "";																					//declaring and initializing variables
	 String strPresent = "";
	 
	 while (!strPresent.equals(".")){																			//loop to check if my input is . or not
		 
		 strPresent = fetch.nextLine();																			//getting the user input
		 
		 //System.out.println(strPresent);
		 
		 strAllStrings = strAllStrings + strPresent;															//Combinign all the strings so that we can check the length at the end
		 
		 //System.out.println(strAllStrings);
		 
	 }
	 
	 
	 System.out.println("The Total Number of Charecters You Typed was: " + strAllStrings.length()); 			//output
	 
	}
 }
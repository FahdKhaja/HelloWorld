/*
 *Fahduddin Khaja
 *CS120
 *Mr.Pope
 *Assignment J9
 *May 24, 2022
 */
 
 /*
 Purpose: Check If the 2 names inputed by the user are equal
 */
 
 import java.util.Scanner;																						//importing packages
 
 public class Assignment_J9_P3_Q1{																				//start of the class
	public static void main(String[] args){																		//main method start
	
	 Scanner fetch = new Scanner(System.in);																	//declaring a new scanner
	 
	 System.out.print("Please enter the name: ");																//askign for names and initializing into a string var
	 String strFirstNameGiven = fetch.nextLine();
	 System.out.println();
	 System.out.print("Please enter the name you want to comapre the previous name with: ");
	 String strSecondNameGiven = fetch.nextLine();
	 System.out.println();
	 System.out.println();
	 
	 if (strFirstNameGiven.equals(strSecondNameGiven)) {														//checkign if they are equal or not an then showing an output based on that
		 System.out.println("The names are equal");
	 }
	 else{
		 System.out.println("The names are not equal");
	 }	 
	}																											//ending main method
 }																												//end of class
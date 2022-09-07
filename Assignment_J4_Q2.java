/*
 *Fahduddin Khaja
 *CS120
 *Mr.Pope
 *Assignment J3
 *March 23, 2022
 */
 
 /*
 Purpose: Finding the sum of digits of a number inputted by the user
 */
 import java.util.Scanner; 																													//imports the scanner package 
 
 public class Assignment_J4_Q2{ 																											// declaring the class
	 
	 public static void main (String[] args) { 																								//main method
		 
		 Scanner fetch = new Scanner (System.in); 																							// assignment statement, makes a new scanner using the Scanner library that we imported that can read what the user inputs
		 
		 System.out.println("Please input a number inbetween 0 and 1000");																	// output
		 
		 int userInput = fetch.nextInt(); 																									// getting the number that is inputted by the user
		 
		 int thousandsPlace, hundredsPlace, tensPlace, onesPlace; 																			//declaring variables
		 
		 thousandsPlace = userInput / 1000; 																								// calculating the maximum amount of times that 1000 can go into the number inputted by the user
		 userInput -= thousandsPlace * 1000;																								//"taking the digit out"
		 System.out.println("Your Thousands Digit Contains:" + thousandsPlace ); 															//output
		 
		 hundredsPlace = userInput / 100; 																									//calculating the mximum amount of time sthat 1000 can go into the number 
		 userInput -= hundredsPlace *100;																									//"taking the digit out"
		 System.out.println("Your Hundreds Digit Contains:" + hundredsPlace);																//output
		 
		 tensPlace = userInput / 10;																										//calculating the maximum amount of times that 10 can go into the number (ie the tens place)
		 userInput -= tensPlace * 10;																										//"removing the digit"
		 System.out.println("Your Tens Digit Contains:" + tensPlace);																		//output
		 
		 onesPlace = userInput;																												//showing the last digit (ones place)
		 System.out.println("Your Ones Digit Contains: " + onesPlace); 																		//output
		 
		 System.out.println("The sum of all the digits in your number is: " + (thousandsPlace + hundredsPlace + tensPlace + onesPlace)); 	//output after calculating the sum 

	 }	 
 }
/*
 *Fahduddin Khaja
 *CS120
 *Mr.Pope
 *Assignment J3
 *March 23, 2022
 */
 
 /*
 Purpose: Destribution of cents(user inputted) into toonies loonies quarters dimes nickels and pennies
 */
 import java.util.Scanner;											//imports the scanner package
 
 public class Assignment_J4_Q3{										// declaring the class
	 
	 public static void main (String[] args) {						//main method
		 
		 Scanner fetch = new Scanner(System.in); 					// assignment statement, makes a new scanner using the Scanner library that we imported that can read what the user inputs
		 
		 System.out.println("Please input the number of cents:");	//output
		 int amountToBeConverted = fetch.nextInt();					//gets input from the user(cents)
		 
		 int toonies, loonies, quarters, dimes, nickels, pennies; 	//variable declarations
		 
		 toonies = amountToBeConverted / 200; 						// checking the max amount of toonies
		 amountToBeConverted -= toonies * 200;						//subtracting the value of the toonies
		 System.out.println("Number of Toonies:" + toonies );		// output
		 
		 loonies = amountToBeConverted / 100;						//checking the max amout of loonies
		 amountToBeConverted -= loonies * 100;						// subtracting the value of the loonies
		 System.out.println("Number of Loonies:" + loonies );		//output
		 
		 quarters = amountToBeConverted / 25;						//checkign the max amount of quarters
		 amountToBeConverted -= quarters * 25;						//subtracting the value of the quarters
		 System.out.println("Number of Quarters:" + quarters );		// output
		 
		 dimes = amountToBeConverted / 10;							//checking the max amount of dimes
		 amountToBeConverted -= dimes * 10;							//subtracting the value of the dimes
		 System.out.println("Number of Dimes:" + dimes );			//output
		 
		 nickels = amountToBeConverted / 5;							//checking the max about of nickels
		 amountToBeConverted -= nickels * 5;						//subtracting the value of the nickels 
		 System.out.println("Number of Nickles:" + nickels );		//output
		 
		 pennies = amountToBeConverted;								//left over pennies
		 System.out.println("Number of Pennies:" + pennies );		//output
	 }
}
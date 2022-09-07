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
 import java.io.*;
 
public class Assignment_J4_Q1{
	 
	  public static void main (String[] args) throws IOException{
		 
		 InputStreamReader inFetch = new InputStreamReader(System.in);
		 BufferedReader stdWaitFetch = new BufferedReader(inFetch);
		 
		 String userInput;
		 double userInputDoubleFeet, convertedValue;
		 
		 
		 System.out.println("Enter the number of feet you want to convert:");
		 userInput = stdWaitFetch.readLine();
		 
		 userInputDoubleFeet = Double.parseDouble(userInput);
		 
		 convertedValue = userInputDoubleFeet / 0.305;
		 
		 System.out.println(userInputDoubleFeet + " feet in meters is " + Math.round(convertedValue * 100.0) / 100.0);
		 
		 
	 }
	 
	 
	 
 }
 
 
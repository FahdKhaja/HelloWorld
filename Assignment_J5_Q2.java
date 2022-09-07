/*
 *Fahduddin Khaja
 *CS120
 *Mr.Pope
 *Assignment J5
 *March 31, 2022
 */
 
 /*
 Purpose: Taking inputs for the number of nuts, bolts and washers to calculate subtotal, taxes and the total amount
 */
 
 //package com.mkyong.io.utils;
 import java.util.Scanner;						 																		//importing the scanner
 import java.text.DecimalFormat;
public class Assignment_J5_Q2{ 																							//declaring class
	 
	  public static void main (String[] args){ 																			//declaing the main method  <add spases before>
	
		Scanner fetch = new Scanner(System.in);																			//declaring the new scanner
		int intNuts, intBolts, intWashers;																				//declaring variables
		String strRunningTotal;
		
		System.out.println("Welcome to the Home Depot order page.");													//output
		System.out.println();																							

		System.out.print("Please enter the quantity for nuts: ");														//output
		intNuts = fetch.nextInt();																						// getting the input from the user
		System.out.println();																								
		System.out.println(intNuts + " Nuts Have Been Reequested");														//output
				System.out.println();
		if(intNuts < 50){																								//if the number they input is under 50
			System.out.println("A mimnimum of 50 nuts must be oredered before your order and be processed/ Please re-enter the quantity requested");//output
			intNuts = fetch.nextInt();																					//asking for them to re-enter the amount
			System.out.println(intNuts + " Nuts Have Been Reequested");													//output
					System.out.println();																				

				if(intNuts < 50){																						//if still under 50 then default to 50
					System.out.println("A minimm of 50 nuts must be ordered. The number of nuts has been set ot 50.");
					intNuts = 50;
				}
		}
		System.out.println();

		
		System.out.print("Please enter the quantity for bolts: "); 														//similar code from last one
		intBolts = fetch.nextInt();
		System.out.println();
		System.out.println(intBolts + " Bolts Have Been Reequested");
		System.out.println();

		if(intBolts < 50){
			System.out.println("A mimnimum of 50 bolts must be oredered before your order and be processed/ Please re-enter the quantity requested");
			intBolts = fetch.nextInt();
			System.out.println(intBolts + " Bolts Have Been Reequested");
				System.out.println();
				if(intBolts < 50){
					System.out.println("A minimm of 50 bolts must be ordered. The number of bolts has been set ot 50.");
					intBolts = 50;
				}
		}
		System.out.println();

		System.out.print("Please enter the quantity for Washers: ");													//similar code from the last block
		intWashers = fetch.nextInt();
		System.out.println();
		System.out.println(intWashers + " Washers Have Been Reequested");
		System.out.println();

		if(intWashers < 50){
			System.out.println("A mimnimum of 50 Washers must be oredered before your order and be processed/ Please re-enter the quantity requested");
			intWashers = fetch.nextInt();
			System.out.println(intWashers + " Washers Have Been Reequested");
			System.out.println();

				if(intWashers < 50){
					System.out.println("A minimm of 50 washers must be ordered. The number of washers has been set ot 50.");
					intWashers = 50;
				}
		}
		System.out.println();
		System.out.println();


		System.out.println("Please wait while your order is processed");											//comments
		System.out.println();

		System.out.println("-----------------------------------------------------------------------------------------------------");	//seperator
		System.out.println();
		
		System.out.println("Nuts : " + ((5 * intNuts)/100) + " dollars and " + ((5 * intNuts)%100) + " cents"); 	//displaying the dollars and cents for each of the quantity that the user typed in 
		System.out.println("Bolts : " + ((5 * intBolts)/100) + " dollars and " + ((5 * intBolts)%100) + " cents");
		System.out.println("Washers : " + ((2 * intWashers)/100) + " dollars and " + ((2 * intWashers)%100) + " cents");
		
		System.out.println();
		
//		DecimalFormat df = new DecimalFormat("0.00");
/* 		String formate = df.format(); 
		double subTotal = (((5*intNuts)+(5*intBolts)+(2*intWashers)))/100;
		double finalValue = subTotal (df.parse(formate)); */

		DecimalFormat df = new DecimalFormat("0.00"); 																//declaing a new deciaml format
		
		System.out.println("Sub-total : $" + df.format((((5*intNuts)+(5*intBolts)+(2*intWashers)))/100)); 			//outputting the calculated costs per each catergory
		System.out.println("HST : $" + df.format(((((5*intNuts)+(5*intBolts)+(2*intWashers))*0.15))/100));
		System.out.println("Total: $" + df.format(((((5*intNuts)+(5*intBolts)+(2*intWashers))*1.15))/100));
		
		System.out.println("Thank You for shopping at Home Depot.");												//final finishing output

	  }																												//end of main method
}																													//end of class
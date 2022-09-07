/*
 *Fahduddin Khaja
 *CS120
 *Mr.Pope
 *Assignment J7
 *April 13, 2022
 */
 
 /*
 Purpose: Calculating the tution of U of T in the next 10 years assuming the fee increases by 6% each year
 */
 
import java.lang.*;																							//importing packages
import java.util.Scanner;

public class Assignment_J7_Q2{																				//start of the class
	public static void main(String[] args){																	//main method start
		
		Scanner fetch = new Scanner(System.in);																//declaring the scanner
		
		System.out.println("The Tuition Cost for University Of Toronto for the year 2021-2022 is 6100");	//output
		
		int intIndex = 0; 																					//declaring and initializing variables
		double dblInitialAndFinal = 6100.0;
		
		while(intIndex < 10){																				//does the loop 10 times
				intIndex++;																					//increasing the counter
				dblInitialAndFinal = dblInitialAndFinal * 1.06;												//compunding the cost 
		}
		
			System.out.println("Cost after 10 years(2031-2032) " + String.format("%.2f", dblInitialAndFinal));//output and also formattin the decimal to 2 places
		/*
		System.out.println("Cost after 10 years(2031-2032) " + String.format("%.2f", (6100 * Math.pow(1.06,10))));	//ALTERNATE EASIER METHOD WITHOUT LOOPS
		System.out.print("Please Input how many years in the future you want to see the Cost:");
		int intCustom = fetch.nextInt();
		System.out.println("Cost after "+ intCustom +" years (" + (2021+intCustom) + "-" + (2022+intCustom)+ ") " + String.format("%.2f", (6100 * Math.pow(1.06,intCustom))));
		//2021-2022 = 6100
		System.out.print(String.format("%.2f", 2.65983));
		*/
	}																										//end of main method
}																											//end of class
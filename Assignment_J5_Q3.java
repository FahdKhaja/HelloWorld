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
 
 import java.util.Scanner;						 																		//importing the scanner
 
 public class Assignment_J5_Q3{																							//declaring class
	 public static void main(String[] args){																			//declaring main method
		 
		 Scanner fetch = new Scanner(System.in);																		//delaring a scanner
		 
		 System.out.print("Welcome. Please Input The Number Of Items That Need Heating: ");								//output
		 int intNumberOfItems = fetch.nextInt();																		//taking users input
		 
		 System.out.println();																							//adding extra lines
		 
		 System.out.print("Please input the heating time (in seconds): ");												
		 int intHeatingTime = fetch.nextInt();
		 
		 System.out.println();
		 
		 double dblTotalCookTime;																						//variable declaration
		 
		 switch(intNumberOfItems){																						//switch statement to check for what type of equation to use
			 case 0:
				System.out.println("You Cant Heat Nothing, Aha moment!!!");												//output msg
			 
				break;																									//break statement
				
			 case 1:
				dblTotalCookTime = intHeatingTime;																		
				System.out.println(dblTotalCookTime + " seconds");														//output

				break;																									//break statement

			 case 2:
				dblTotalCookTime = intHeatingTime * 1.25;
				System.out.println(dblTotalCookTime + " seconds");														//output

				break;																									//break statement
			 
			 case 3:
				dblTotalCookTime = intHeatingTime * 1.5;
				System.out.println(dblTotalCookTime + " seconds");														//output

				break;																									//break statement
				
			 case 4:
				dblTotalCookTime = intHeatingTime * 2;
				System.out.println(dblTotalCookTime + " seconds");														//output

				break;																									//break statement
		 }
		 
		 if(intNumberOfItems < 0 || intNumberOfItems > 4){																//checkikng for numbers out of range
			 if(intNumberOfItems < 0){
				System.out.println("The Number of items cannot be negative, please try again");							//output
			}
			 else{
				System.out.println("Warning:  heating more than four items at once is not recomended");					//output
			 }
		 }
		
	 }																													//end of main method
 } 																														//end of public class
/*
 *Fahduddin Khaja
 *CS120
 *Mr.Pope
 *Assignment J7
 *April 13, 2022
 */
 
 /*
 Purpose: A guessing game in which the first player chooses a number and the scond player tried to guess it in the least amount of tries as possible
 */

//import java.lang.*;
import java.util.Scanner;																		//importing packages

public class Assignment_J7_Q3{																	//start of the class
	public static void main(String[] args){														//start of the main method
		 
		 Scanner fetch = new Scanner(System.in);												//declaring a new scanner
		 
		 System.out.println();																	//outputs
		 System.out.print("Please enter a number to check if it is a prime number: ");
		 
		 int intCheckingNumber = fetch.nextInt();												//taking user input
		 
		 System.out.println();
		 
		 int intIndex = 0;																		//declaring and initallizing the variable
		 boolean bolExit = false;
		 
		 
		if (intCheckingNumber < 0){																//checking if the number is less than if it is then giving them an error
			
			System.out.println("This version of the app dosent support negative numbers");
		}
		else if(intCheckingNumber != 0 && intCheckingNumber != 1){								//checking if it isnt 1 and 0 becuse they are nither prime nor composite
			if (intCheckingNumber % 2 != 0) {													//checking if it is divisible by 2 if, if it is then its not a prime number. If it is not then we can rule out (not check) all the even numbers making the program 50% faster
			
			
				for (intIndex = 3; intIndex < (intCheckingNumber); intIndex = intIndex + 2){   	//checking for all odd numbers inbetween 0 and the number (other than one and the number itself) since we know that its not an even number ecause of our previous check
				
					if (intCheckingNumber % intIndex == 0){										//checking if the user's number is totally divisible by that number(the contorl variable of the loop)
						bolExit = true;															//changing the bol (which later effects the output)
					}
				
					if (bolExit == true){														//if the number is divisible by some other number then it will exit the loop
						break;
					} 
				
				 //System.out.println(intIndex);
				}
			
			} 
			else{																				//checking if the "even number" is not 2, if it isnt 2 then all positive even numbers are non prime
				if(intCheckingNumber != 2){														
					bolExit = true;
				}
			}

			if(bolExit == true){																//output depending on the boolean
				System.out.println("Your number was not a prime number");
			}
			else{
				System.out.println("Your Number was a prime number");
			}
		}
		else{																					//output for if the number is 0 or 1
			
			System.out.println("Your Number is nither prime nor composite");
		}
		}	 																					//end of main method
	}																							//end of class

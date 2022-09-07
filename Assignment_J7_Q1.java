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
import java.io.Console;																	//importing packages
import java.util.Scanner;

public class Assignment_J7_Q1{															//start of the class
	public static void main(String[] args){												//start of the main method
		
	 Scanner fetch = new Scanner(System.in);											//declaring a new scanner

		
		System.out.println("Welcome to Striker-a Guessing Game!");						//ouputs
		
		int intNumberInputed = 0, intRealGuessCount = 0, intP2Guess = 0;				//declarations and initializations
		//intDummyCount = 0										
		do{																				//start of loop, this loop is for P1 who is going to choose a number that P2 is going to guess, all this loop is doing is making sure that P1 is choosing a number within range
			System.out.print("Player one please enter the number to be guessed: ");		//output
			Console console = System.console();											//using a class/library from the package, this one makes the charecters taht are being typed on the screen invisible

			char[] chrInputP1User = console.readPassword();								//reding the input

			intNumberInputed = Integer.parseInt(new String(chrInputP1User));			//convering the input
		
			if(intNumberInputed < 1000 && intNumberInputed > 0){						//checking if it is within range
				break;																	//exiting out of the loop if it is
			}
		
			System.out.println("Sorry, the number was not with the range, please try again");//output
			System.out.println();															
			//System.out.println(intNumberInputed);
		}while(intNumberInputed > 1000 || intNumberInputed < 0);						//checking if the statemnt is true 
		
		do{																				//loop for P2 to guess the number
			System.out.print("Player two guess a number:");								
			intP2Guess = fetch.nextInt();												//getting his guess
			if (intP2Guess >=1000 || intP2Guess <= 0){									//checking if it is within range before adding the guess counter
				System.out.println("Number Out Of Range!! Please try again");
			}
			else if(intP2Guess > intNumberInputed){										//check if the numebr is higher than the P1's number
				intRealGuessCount +=1;													//incresing the counter
				System.out.println("Your Guess is too High! Try a lower number.");		//output
			}
			else if(intP2Guess < intNumberInputed){										//checking if the number is lower than P1's number
				intRealGuessCount +=1;													//increasin the counter
				System.out.println("Your Guess is too low! please try again");			//output
			}
		}while(intP2Guess != intNumberInputed);											//keep looping this untill the P2 guess is equal to P1
		
		System.out.println("Congraguations, you guessed it!");							//output
		System.out.println("It took " + intRealGuessCount + " guesses to determine the number."); //tellign them how many guesses it took
		System.out.println("Thanks for playing Striker!"); 
		
		//System.out.print(String.format("%.2f", 2.65983));
		
	}																					//end of main method
}																						//end of class
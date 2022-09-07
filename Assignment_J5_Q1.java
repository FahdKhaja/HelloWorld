/*
 *Fahduddin Khaja
 *CS120
 *Mr.Pope
 *Assignment J5
 *March 31, 2022
 */
 
 /*
 Purpose: Taking user input to check if the inflation of the tires are up to the standards
 */
 
 import java.util.Scanner;						 																		//importing the scanner
 
public class Assignment_J5_Q1{ 																							//declaring class
	 
	  public static void main (String[] args){ 																			//declaing the main method
	
		Scanner fetch = new Scanner(System.in);																			//declaring variables
		int intFrontRight, intFrontLeft, intBackRight, intBackLeft;																	
		
		System.out.println("Welcome to the tire check program");														//output
		System.out.println();
		System.out.println();
		
		System.out.print("please enter the tire pressure in the front-right tire: ");
		intFrontRight = fetch.nextInt();																				//getting user input
		
		System.out.println();
		
		System.out.print("Please enter the tire pressure in the front-left tire: ");
		intFrontLeft = fetch.nextInt();																					//getting user-input
		
		System.out.println();
		
		System.out.print("Please enter the tire pressure in the back-right tire: ");
		intBackRight = fetch.nextInt();																					//getting user input
		
		System.out.println();
		
		System.out.print("Please enter the tire pressure in the back-left tire: ");
		intBackLeft = fetch.nextInt();																					//getting user input
		
		System.out.println();
		System.out.println("-----------------------------------------------------------------------------------------------------");//seperator
		System.out.println();
		
		System.out.println("Your Results:");																					//output
		System.out.println();
		
		String strTirePressureProblem = "Tires Not in the Recomended Pressure Range: ";											//making a string that has teh error im gonna add upon 	
		boolean  bolRange = false;																								//declaring a boolen to check if the tires are within the given range
		boolean bolPass = true;																									//declaring a boolen to check if it passed all the tests
		
			if(intFrontRight <= 32 || intFrontRight >= 38){																		// checking for each indivisual tire
				strTirePressureProblem = strTirePressureProblem + "   " + "Front Right";										
				bolRange = true;																								//turnigng the boolen false true cuz tires are not within range
			} 
			if(intFrontLeft < 32 || intFrontLeft > 38){
				strTirePressureProblem = strTirePressureProblem + "   " + "Front Left";
				bolRange = true;
			}
			if(intBackRight < 32 || intBackRight > 38){
				strTirePressureProblem = strTirePressureProblem + "   " + "Back Right";
				bolRange = true;		
			}
			if(intBackLeft < 32 || intBackLeft > 38){
				strTirePressureProblem = strTirePressureProblem + "    " + "Back Left.";
				bolRange = true;
			}
		
		if(bolRange == false){																									//if its within range
			System.out.println("No Range Disparancies");																		//output
		}
		else{
			System.out.println(strTirePressureProblem);																			//output
			bolPass = false;																									//turning the boolean that says "everyting is alright" to false
		}
		
		if(intBackLeft == intBackRight){ 																						//checking if the back tires have equal pressure
			System.out.println("Pressure Equal In Your Back Tires: Yes");
		}
		else {
			System.out.println("Pressure Equal In Your Back Tires: No");
			bolPass = false;																									//trunigng the boolean false
		}
		
		if(intFrontLeft==intFrontRight){																						//doing the samw thing for the front wheels
			System.out.println("Pressure Equal In Your Front Tires: Yes");		
		}
		else{
			System.out.println("Pressure Equal In Your Front Tires: No");
			bolPass = false;																								
		}
		
		if (bolPass==true){																										// if everything is alright it ouputs that everythign is alright
			System.out.println("Tire Inflation OK");
		}
	}																															//end of main method
}																																//end of class
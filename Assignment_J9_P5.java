/*
 *Fahduddin Khaja
 *CS120
 *Mr.Pope
 *Assignment J9
 *May 24, 2022
 */
 
 /*
 Purpose: maintaining a count for how many charecters have been changed from upper case to lower case and vice versa
 */
 
 import java.util.Scanner;																														//importing packages
 
 public class Assignment_J9_P5{																													//start of the class
	public static void main(String[] args){																										//main method start
		
		Scanner fetch = new Scanner(System.in);																									//declaring a new scanner
		System.out.println("Please enter one charecter at a time and enter a period (.) to count how many times you have changed cases.");
		System.out.println("Please note that if more than one charecter is entered at a time then only the first charecter is counted");
		
		String strPresent = "";																													//declaring and initializing variables
		int intCountToLower = 0;
		int intCountToHigher = 0;
		
		do{
			
			System.out.print("Input: ");																										//asking for input
			
			strPresent = fetch.nextLine();
			
			
			strPresent = strPresent.substring(0,1);																								//trimming the input just in case
			
			if (strPresent.equals(".")){																										//breaking the loop if the user inputs .
				
				break;
				
			}
			
			System.out.print("Output: ");																										//displaying output
			
			if ((strPresent.equals(strPresent.toUpperCase())) && (strPresent.equals(strPresent.toLowerCase()))) {								//checkign if it is a sepcial symbol by checking if both its to higher and to lower give the same value
				System.out.println(strPresent);																									//output
				System.out.println();
			}
			else{
				
				if(strPresent.equals(strPresent.toUpperCase())){																				//if its equal to its to upper counterpart then it need to be changed to lower
					System.out.println(strPresent.toLowerCase());
					System.out.println();
					intCountToLower += 1;																										//incrementing the counter
				}
				else{
					System.out.println(strPresent.toUpperCase());																				//similar to last part but for to lwercase
					System.out.println();
					intCountToHigher += 1;
				}
			}
			
			
		}while(strPresent != ".");																												//still checking if its equal to .
		
		System.out.println("The number of times you changed cases into lower case is " + intCountToLower + " and the number of times you changed into higher case is " + intCountToHigher + " giving you a total of " + (intCountToHigher + intCountToLower) + " changes"); //output
	 
	 
	 
	 
	 
	} 																																			//end of main method
}																																				//end of class
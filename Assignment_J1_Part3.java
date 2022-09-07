/*
 *Fahduddin Khaja
 *CS120
 *Mr.Pope
 *Assignment J1
 *February 15, 2022
 */

/*taking 3 numbers and calculating the average
 *The programme then checks the avarage and gives
 *us a message on if we need more practice or if we did good enough
*/

public class Assignment_J1_Part3{                            //declaring class
	
	public static void main(String[] args){                  // main method
		
		// declaring variables 
		int testOne, testTwo, testThree;
		
		double average;
		
		// assignment statement 
		testOne = 23;
		
		testTwo = 49;
		
		testThree = 100;
		
		// calculate the average of the three variables */
		average = ((testOne + testTwo + testThree) / 3);
		
		// output
		System.out.println("The average is " + average);
		
		// checking if the avarage was more than 80 or less than 80 and then displaying the appropriate message 
		if (average >= 80)
			
			System.out.println("GreatJob!");
			
			else
				System.out.println("You need more practice!");
				
	}
	
}
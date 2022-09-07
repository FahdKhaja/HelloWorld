/*
 *Fahduddin Khaja
 *CS120
 *Mr.Pope
 *Assignment J3
 *March 14, 2022
 */

/*
Purpose: Calculating the pay amount
*/

class Example_Q4{									//declaring class
	public static void main (String[]args){		//declaring the main method
	
		//declare and initalize variables
		
		long hoursWorked = 50; 		
		double payRate = 50, taxRate = 0.10;
			
		
		//output employee pay amount
		
		System.out.println("Hours worked: " + hoursWorked);
		
		System.out.println("Pay amount: " + (hoursWorked*payRate)) ;
		
	}
}

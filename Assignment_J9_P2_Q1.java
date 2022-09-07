/*
 *Fahduddin Khaja
 *CS120
 *Mr.Pope
 *Assignment J9
 *May 24, 2022
 */
 
 /*
 Purpose: Find the number of letters in my Name
 */
 
 
 
 public class Assignment_J9_P2_Q1{																				//start of the class
	public static void main(String[] args){																		//main method start
 
			String strFirstName = "Fahduddin";																	//Initializing Variables
			String strMiddleName = "\"Blank\"";																	//My Middle Name doesn't exist so I put my "tag" in
			String strLastName = "Khaja";
			
			String strFullNameWithTag = strFirstName + " " + strMiddleName + " " + strLastName;								//Adding all my strings together
			String strFullName = strFirstName + " " + strLastName;
			
			System.out.println();																							//output(s)
			System.out.println(strFullNameWithTag);
			System.out.println("The total unmber of charecters in my name (with tag) is : " + strFullNameWithTag.length() );
			System.out.println();
			System.out.println(strFullName);
			System.out.println("The total unmber of charecters in my name (without tag) is : " + strFullName.length() );
			
			
	}
 }
 
import java.util.Scanner; // importing the "scanner class"

public class InputDemo{
	public static void main(String[]args){
	
	Scanner fetch = new Scanner(System.in); //initailizing the scanner
	
//collecting data from the user

	System.out.println("What is your name?");
	String name = fetch.next();
	
	System.out.println("How old are you?");
	double age = fetch.nextDouble();
	
//output
	
	System.out.println("Thank you " + name + ", your age is " + age + "years");
		
	
	}
	
}
	
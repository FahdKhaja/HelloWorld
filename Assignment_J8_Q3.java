/*
 *Fahduddin Khaja
 *CS120
 *Mr.Pope
 *Assignment J8
 *May 10, 2022
 */
 
 /*
 Purpose: calculating the numerical and alpabetical greade for different students
 */
 
public class Assignment_J8_Q3{																				//start of the class
	public static void main(String[] args){																	//main method start
		
		Student testSubject1 = new Student("Progression,Arthemetic",1,2,3,4,5,60,70);						//intializing 5 objects
		Student testSubject2 = new Student("DaMeme Boy",6,9,6,9,6,60,90);
		Student testSubject3 = new Student("JOE MAMA",3,7,9,4,3,67,93);
		Student testSubject4 = new Student("hdaf",10,8,8,10,9,98,88);
		Student testSubject5 = new Student("nerad",10,10,10,10,10,100,100);
		
		System.out.print(testSubject1.strStudentName);
		testSubject1.additionQuizMarks();																	
		testSubject1.alphabeticalGrade();
		System.out.print("     " + testSubject1.getFinalLetterGrade());												
		System.out.println("   " + testSubject1.getFinalNumericGrade());
		
		System.out.print(testSubject2.strStudentName);
		testSubject2.additionQuizMarks();																	
		testSubject2.alphabeticalGrade();
		System.out.print("     " + testSubject2.getFinalLetterGrade());												
		System.out.println ("     " + testSubject2.getFinalNumericGrade());

		System.out.print(testSubject3.strStudentName);
		testSubject3.additionQuizMarks();																	
		testSubject3.alphabeticalGrade();
		System.out.print("    " + testSubject3.getFinalLetterGrade());												
		System.out.println ("    " + testSubject3.getFinalNumericGrade());

		System.out.print(testSubject4.strStudentName);
		testSubject4.additionQuizMarks();																	
		testSubject4.alphabeticalGrade();
		System.out.print("    " + testSubject4.getFinalLetterGrade());												
		System.out.println("    " + testSubject4.getFinalNumericGrade());
		
		System.out.print(testSubject5.strStudentName);
		testSubject5.additionQuizMarks();																	//calling methods
		testSubject5.alphabeticalGrade();
		System.out.print("    " + testSubject5.getFinalLetterGrade());												//outputs
		System.out.println ("    " + testSubject5.getFinalNumericGrade());											
		
	}																										//end of main method
}																											//end of class

class Student{																								//Start of blueprint class
		
	String strStudentName; 																			//decaring variables
	private double dblFinalExam, dblQuiz1,dblQuiz2,dblQuiz3, dblQuiz4,dblQuiz5, dblMidTerm;
	
	
	private double dblNumericGrade;																			
	private char chrFinalLetterGrade;
	
	public Student(String strStudentName, double dblQuiz1,double dblQuiz2,double dblQuiz3,double dblQuiz4,double dblQuiz5,double dblMidTerm,double dblFinalExam){	//constructor class
		
		this.strStudentName = strStudentName;																//assigning the arguments to the parameters
		this.dblQuiz1 = dblQuiz1;
		this.dblQuiz2 = dblQuiz2;
		this.dblQuiz3 = dblQuiz3;
		this.dblQuiz4 = dblQuiz4;
		this.dblQuiz5 = dblQuiz5;
		this.dblMidTerm = dblMidTerm;
		this.dblFinalExam = dblFinalExam;
		
	}
	
	public void additionQuizMarks(){																		//method to add quizmaks and get a numerical value
		
		dblNumericGrade = ((dblMidTerm)/4) + ((dblFinalExam)/4) + (dblQuiz1+dblQuiz2+dblQuiz3+dblQuiz4+dblQuiz5);
		
	}
	
	public void alphabeticalGrade(){																		//method to calculate the different allphabatecal grades
		
		if (dblNumericGrade >= 90){
			chrFinalLetterGrade = 'A';
		}
		else if (dblNumericGrade >= 80){
			chrFinalLetterGrade = 'B';
		}
		else if (dblNumericGrade >= 70){
			chrFinalLetterGrade = 'C';
		}
		else if (dblNumericGrade >= 60){
			chrFinalLetterGrade = 'D';
		}
		else if (dblNumericGrade <60){
			chrFinalLetterGrade = 'F';
		}
		
		
	}
	
	public double getFinalNumericGrade(){																	//method for getting the numeric grade
			return dblNumericGrade;
		}
	public char getFinalLetterGrade(){																		//method for getting the alphabetical grade
		return chrFinalLetterGrade;
	}	
		
}																											//end of blueprint class
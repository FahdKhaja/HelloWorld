
public class pets{
	
	public static void main(String[] args){
		
		Animals animal1 = new Animals("","",5,"");
		Animals animal2 = new Animals("","",5,"");
		Animals animal3 = new Animals("","",5,"");
		
		Animals.NumberOfAnimals();
		
	}
	
}

class Animals{

	String name;
	static int intPetCount;
	String type;
	String color;
	int age;
	//type name age color and numeber
	
	Animals(String strType, String strName, int intAge, String strColor){
	
		name = strName;
		type = strType;
		color = strColor;
		age = intAge;
		
		intPetCount++;
	
	}
	
static void NumberOfAnimals(){

	System.out.println("You Have " + intPetCount + " Pets Added.");

}

}



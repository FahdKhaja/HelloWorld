//Add a constructor
class Vehicle{
	int passengers;		// number of passenfers
	int fuelcap; 		//fuel capacity in gallons
	int mpg;			//fuel consumprion in milles per gallon

	// This is a constructor for Vehicle.
	Vehicle(int p,int f, int m)	{
		passengers = p;
		fuelcap = f;
		mpg = m;
		
	}
	
	//Return the range/
	int range(){
		return mpg * fuelcap;
	}
	
	//compute fuel needed for a given distance
	double fuelneeded(int miles) {
		return (double) miles / mpg;
		
	}
	
}

class VehConsDemo{
	public static void main(String args[]){
	
		Vehicle sportscar = new Vehicle (2,14,12);
		Vehicle minivan = new Vehicle(7, 16 , 21);
		
		double gallons;
		
		int dist = 252;
		
		gallons = minivan.fuelneeded(dist);
		
		System.out.println("To go " + dist + "mmiles minican needs " + gallons + " gallons of fuel");
	 
		gallons = sportscar.fuelneeded(dist);
	 
		System.out.println("To go " + dist + "miles minican needs " + gallons + "gallons of fuel");
		
		
		
	}
}
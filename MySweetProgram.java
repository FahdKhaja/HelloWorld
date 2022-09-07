import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class MySweetProgram{
	public static void main(String args[]){
		
		
		User me = new User();
		User you = new User();
		
		Integer[] arrayFN = {1,2,3,4,5};
		Integer[] arrayLN = {5,4,3,2,1};
		
		List<User> users = new ArrayList<User>();
		
		
		
		me.setFirstName("Fahd");
		me.setLastName("Khaja");
		me.setAge(17);
		
		you.setFirstName("Maybe");
		
		
		
		users.add(me);
		users.add(you);
		
		users.get(1);
		
		for(int i = 0; i < arrayFN.length ; i++){
			
			User u = new User();
			
			users.add(u);
			u.setFirstName(arrayFN[i].toString());
			u.setLastName(arrayLN[i].toString());
			
		}
		
		for(User u : users){
			
			System.out.println(u.getFullName());
			
		}
		
		User.printUser(users);
		
		for(User u: users){
			
			System.out.println(u.toString());
			
		}
		
	 users.get(2).outputMethodOverload(true);
		
	 System.out.println("");
		
	 User.outputMethodOverload(users);
		
	 System.out.println(User.searchIndexOfUser(users, "1", "5"));
		
	 System.out.println(me.toString());
	 
	 System.out.println(me.hashCode() == you.hashCode());
	 
	 System.out.println(User.searchIndexOfUser(users, "1 5"));
	 
	 
	}
	
}

class User{
	
	private String firstName;
	private String lastName;
	private int age;
	
	
	public void setFirstName(String fn){
		
		firstName = fn;
		
	}
	public void setLastName(String ln){
		
		lastName = ln;
		
	}
	public void setAge(int age){
		
		age = this.age;
		
	}
	
	public String getFirstName(){
		
		return firstName;
		
	}
	
	public String getLastName(){
		
		return lastName;
		
	}
	
	public Integer getAge(){
		
		return age;
		
	}
	
	
	public String getFullName(){
		
		return getFirstName() + " " + getLastName();
		
	}
	
	public static void printUser(List<User> users){
	
		for(User u : users){
			
			System.out.println(u.getFullName());
			
		}
		
	}
	
	public static void outputMethodOverload(List<User> u){
		
		if(u.get(2).getFirstName().equals("1")){
			
			System.out.println("You are a lucky man");
			
		}else{
			
			System.out.println("Unlucky ");
			
		}
		
	}
	
	public void outputMethodOverload(boolean bol){
		
		if(bol == true){
			
			System.out.println("Intersting, so you have followed this route");
			
		}else{
			
			System.out.println("So you have finally arrived");
			
		}
		
	}

	public static int searchIndexOfUser(List<User> users, String firstName, String lastName){
		
		return searchIndexOfUser(users, firstName + " " + lastName);
		
	}
	
	public static int searchIndexOfUser(List<User> users, String fullName){
		
		for(int i = 0; i < users.size(); i++ ){
			
			if (users.get(i).getFullName().equals(fullName)){
				
				return i;
				
			}
			
		}
		return -1;
	}
	
	public static int searchIndexOfUser(List<User> users, User u){
		
		int i = 0;
		
		for(User m : users){
		 
		 if (m.equals(u)){
			 
			 return i;
			 
			 
		 }else{
			 i++;
		 }
		 
		}
		return -1;
		//return searchIndexOfUser(users, u.fullName());
		
	}

	@Override
	public String toString(){
		
		return getFullName();
		
	}

	@Override
	public int hashCode(){
		
		final int prime = 31;
		int result = 1;
		
		result = prime*result + ((firstName == null) ? 0: firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		
		return result;
		
	}

}
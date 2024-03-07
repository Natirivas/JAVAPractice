
public class ClassorInstanceVariable {
	static int varSec = 456;  /* this variable can be accessed for any method in this class, it is called class variable or instance variable*/
	

	public static void firstMethod() {
		int number = 12345;
			String name = "New York";
			System.out.println(number);
			System.out.println(name);
			System.out.println(varSec);
			
		
	}
	public static void main(String[] args) {
ClassorInstanceVariable.firstMethod();
System.out.println(varSec); 
	}

}


public class FirstMethod {
	public static void firstMethod() {
		
		int number = 12345;   /* first the variable type, then variable number and then we assign the value)*/
		String city = "New York"; /* do not forget  " " when declaring String*/
	System.out.println(number);
	System.out.println(city);
	}

	public static void main(String[] args) {
		FirstMethod.firstMethod();
		/* this method here does not know the variables
		 * we declared into the body of the firstmethod
		 * those are called local variables
		 */
		
	}

}

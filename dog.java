
public class dog {
	String name= "Valky";
	String breed = "Bullterrier";
	int height = 4;
	
	public void barking() {
		
		System.out.println(name + " is barking ");
		
	}
	
	public void eating() {
		System.out.println(name + "is eating ");
	}

	public static void main(String[] args) {
		
		dog dogclass = new dog();  /* all that is presented inside this class it is wrapped in this object*/
						 /* a class is a collection of objects */
		
		System.out.println(dogclass.name + " is a  "+ dogclass.breed);
dogclass.barking();
	}

}

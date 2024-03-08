
public class Students {
	
	public  Students() {
		System.out.println("Hi, I am inside constructor");
		System.out.println("Hi, I am a second Method");
	}
	
	int rollNumber;
	String Name;
	public Students(int i, String n) {
		rollNumber = i;
		Name = n;
	}

	public void display() {
		System.out.println("Roll number is:" +  rollNumber + " " + "and Name is:"+ Name);
		
	}
	public static void main(String[] args) {
		
Students std = new Students();
Students std1 = new Students(10, "James");
Students std2 = new Students (15, "Natalia");

   std1.display();
   std2.display();

	}

}

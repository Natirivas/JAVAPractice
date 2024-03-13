package opps;

public class Addition {

	public void addValue(int a, int b) {
		int c = a+b;
		System.out.println("Addition is : " + c);
			}
	
public void addValue (int a, int b, int c) {
	
	int d = a+ b+c;
	
	System.out.println("Addition is : " + d);
	
}
public double addValue(double a, double b) {
	double c= a+b;
	return c;
	
}



public static void main(String[] args) {
	
	Addition addVal  = new Addition();
	addVal.addValue(1, 2);
	addVal.addValue(1,2,3);
	
	
	
}



	}



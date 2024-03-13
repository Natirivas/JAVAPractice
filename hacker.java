package array;

import java.util.Scanner;

public class hacker {
	

  	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.println("Please insert your name:");
 String name = sc.nextLine();
  
 System.out.println("Enter your sex as in your ID:  F or M");
 char gender = sc.next().charAt(0);
 
 System.out.println("enter you age : ");
 int age = sc.nextInt();
 
 
 System.out.println("enter your mobile number : ");
 long mobileNo = sc.nextLong();
 
 System.out.println("Nombre: "+name);
 System.out.println("Género: "+gender);
 System.out.println("Edad: "+age);
 System.out.println("Teléfono: "+mobileNo);
 
 
 
 
 
 sc.close();
 
 
	}

}

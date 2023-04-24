package Java.com;

import java.util.Scanner;

public class Get_Input_From_User {

	public static void main(String[] args) 
	{
		int a;
		float b;
		String s;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter a String");
		s = sc.nextLine();
		
		System.out.println("Enter a Integer Value");
		a = sc.nextInt();
		
		System.out.println("Enter a Float Value");
		b = sc.nextFloat();
		
	}

}

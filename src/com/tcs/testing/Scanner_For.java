package com.tcs.testing;

import java.util.Scanner;

public class Scanner_For {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the First value");
		  int First_Value =sc.nextInt();
		  System.out.println("The first value is :" + First_Value);
		  
		  System.out.println("Enter the second value");
		  int Second_Value = sc.nextInt();
		System.out.println("The second  value is :"+Second_Value);
		
	
		sc.close();
	}
	
	
	
	
}

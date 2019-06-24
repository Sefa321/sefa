package com.scanner_string.java;

import java.util.Scanner;


public class scanner_string {

	public static void main(String[] args) {

		String s1;
		String s2;
		
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the string S1 and S2: ");
		s1 = Sc.next();//Single Word Input through keyboard
		System.out.println(s1);
		/*
		while(Sc.hasNext())
		{
			System.out.println(Sc.next());
		}
		*/
		
		s2 = Sc.nextLine(); //Multiple word input
		
		System.out.println(s2);
		
		boolean bool = true;
		System.out.println(!true);
		
	}

}

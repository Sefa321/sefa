package com.scanner.java;

import java.util.Scanner;

public class scanner {

	public static void main(String[] args) {
		
		byte b;
		int a;
		short s;
		long l;
		
		String s1;
		String s2;
		
		double d;
		float f;
		
		Scanner Sc = new Scanner(System.in);
		
		System.out.println("Enter byte, int, short, long, double, float: ");
		b = Sc.nextByte();
		a = Sc.nextInt();
		s = Sc.nextShort();
		l = Sc.nextLong();
		d = Sc.nextDouble();
		f = Sc.nextFloat();
		
		System.out.println("Enter the string S1 and S2: ");
		s1 = Sc.next();
		
		System.out.println("Elements Are: ");
		System.out.println(b+" "+a+" "+s+" "+l+" "+s1+" "+d+" "+f);
		
	}

}

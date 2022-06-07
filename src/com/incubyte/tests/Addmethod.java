package com.incubyte.tests;
import java.util.Scanner;

import com.incubyte.Calculator.*;

public class Addmethod {

	public static void main(String[] args) {
		System.out.println("Enter the number 1.");
		Calculator c1 = new Calculator();
		Scanner sc = new Scanner(System.in);
		String a1 = sc.next();
		System.out.println("Enter the number 2.");
		String b1 = sc.next();
		String a = a1+","+b1;
		sc.close();
		int k = c1.add(a);
		System.out.println("Input String is " + a);
		System.out.println("sum is: "+k);
	}

}

package com.incubyte.Calculator;

public class Calculator {

	String a1= null;

	
	public int add(String a1) {
		int num1 = a1.charAt(0);
		int num2 = a1.charAt(2);
		int a = Character.getNumericValue(num1);
		int b = Character.getNumericValue(num2);
		int sum = a+b;
		return sum;
	}
}

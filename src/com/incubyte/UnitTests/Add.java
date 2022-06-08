package com.incubyte.UnitTests;

import com.incubyte.Calculator.Calculator;

public class Add {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		int k = c.add("2","2");
		System.out.println("Required sum is " + k);

	}

}

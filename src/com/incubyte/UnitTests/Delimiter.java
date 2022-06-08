package com.incubyte.UnitTests;

import com.incubyte.Calculator.Calculator;

public class Delimiter {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		String n = c.delimiter("//;\n11;2\n");
		System.out.println(n);
	}

}

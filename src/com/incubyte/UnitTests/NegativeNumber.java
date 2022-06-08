package com.incubyte.UnitTests;

import com.incubyte.Calculator.Calculator;
import com.incubyte.CustomExceptions.NegativeNumberException;

public class NegativeNumber {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		try {
		c.split("-25,2");
		int a = Integer.valueOf(c.a4);
		int b = Integer.valueOf(c.a5);
		if(a<0 || b<0) {
			throw new NegativeNumberException("Addition not possible as negative number exist");
		}
		}
		catch(NegativeNumberException ex) {
			System.out.println(ex.getMessage());
		}
	}
}

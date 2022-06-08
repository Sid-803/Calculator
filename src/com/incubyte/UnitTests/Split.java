package com.incubyte.UnitTests;
import com.incubyte.Calculator.*;

public class Split {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.split("2\n5,2");
		System.out.println("Required integers are " + c.a4 + " and " + c.a5);
	}
}

package com.incubyte.UnitTests;
import com.incubyte.Calculator.*;

public class SearchCommas {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		int k = c.searchCommas("2506,2", ',');
		System.out.println("Required index is " + k);
	}

}

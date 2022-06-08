package com.incubyte.UnitTests;

import com.incubyte.CustomExceptions.LineBreakException;

public class LineBreak {

	public static void main(String[] args) {

		try {
			String k = "\n";
			if(k == "\n") {
				throw new LineBreakException("Post comma string contains line break.");
			}
		}
		catch(LineBreakException ex) {
			System.out.println(ex.getMessage());
		}

	}

}

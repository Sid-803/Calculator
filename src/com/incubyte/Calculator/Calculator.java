package com.incubyte.Calculator;

public class Calculator {
	//Data members
	//Three strings data types
	public String a3 = null;
	public String a4 = "";
	public String a5 = "";
	
	public String delimiter(String a3) {
		String s ="";
		a3 = a3.replace("\n", "");
		for(int i = 3; i<a3.length();i++) {
			char c = a3.charAt(i);
			if(c==';'|| c==' '|| c=='.') {
				s = s+",";
			}else                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           
				s=s+c;
		}
		return s;
	}
	
	//To search for distributing comma
	public int searchCommas(String a3, char key) {
		for(int i = 0; i<a3.length();i++) {
			if(a3.charAt(i)==key) {
				return i;
			}
		}
		return -1;
	}
	
	//Method to split a String into saperate strings. Spaerated by a comma in between.
	public void split(String a3) {
		int k = searchCommas(a3, ',');
		for(int j = 0; j<k;j++) {
			char a = a3.charAt(j);
			a4 = a4 +a;
		}
		for(int j = k+1; j<a3.length();j++) {
			char b = a3.charAt(j);
			a5 = a5 +b;
		}	
	}
	
	//Method to quantify the string on the left side of comma if line break("\n") is present.
	public int firsthalf(String s) {
		s = s.replace("\n", "");
		int p = 0;
		for(int i = 0;i<s.length();i++) {
			char g = s.charAt(i);
			int k = Character.getNumericValue(g);
			p = p+k;
		}
		a4=Integer.toString(p);
		return p;
	}
	
	//Method to add the sub strings formed after splitting the parent string.
	public int add(String a4, String a5) {
		int sum =0;
		int k1 = Integer.valueOf(a4);
		int k2 = Integer.valueOf(a5);
		sum = k1 + k2;
		return sum;
	}
}

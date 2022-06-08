package Driver;

import com.incubyte.Calculator.Calculator;
import com.incubyte.CustomExceptions.NegativeNumberException;


public class Driver {

	public static void main(String[] args) {
		
		Calculator c = new Calculator(); //Object of Calculator Class
		String s1="";
		String s2="";
		int i1 = 0,i2 = 0,i3=0;
		 
		String k = "3\n6,5"; //Input String
		
		
		try {
			//If entered in delimiter format
			char c1 =k.charAt(0);
			char c2 =k.charAt(2);
			if(c1=='/' & c2==';')
			k =c.delimiter(k);
			
			c.split(k); //Called split method to split String K into two sub strings
			s1 =c.a4; //Sub string 1
			s2 =c.a5; //Sub string 2
			
			//to check if sub string 1 contains a line break("\n")
			boolean b1 = s1.contains("\n"); //Checks the presence of line break
			if(b1 == true){ //If yes then call firstjhalf method from Claculator class
				i1 = c.firsthalf(s1); //Quantified value from string
				s1 = c.a4; //Newly assigned sub string after removing line breaks
			}else {
				i1=Integer.valueOf(s1); //If no, then simply convert the sub string into an integer
			}
			i2 = Integer.valueOf(s2); //Conversts second sub string into Integer
			i3 = c.add(s1, s2); //Method to add two substrings after conversion into Integral values

			//Exceptuon Handling
			//1. Check for negative values
			//Allowed-None and Print both if both are negative
			if(i1<0||i2<0 ) {
				//Custom Exception NegativeNumberException - prints if any one is negative and gives sum=0
				throw new NegativeNumberException("Error Message: Addition not possible as negative number exist");
				}
		//Standard Unchecked Exception from Java.lang.
		//Gives runtime error if input format is non integral.
		}catch (NumberFormatException nfe) {
            System.out.println("Error Message: NumberFormat Exception: invalid input string");
            System.exit(0);
        }
		//Standard Unchecked Exception from java,lang
		//Gives runtime error if String is out of bound or character asked for index which is out of bound for that declared string.
		catch(StringIndexOutOfBoundsException e) {
			System.out.println("Error Message: Null String or single number only entered");
			if(k.isEmpty()==false) {
				for(int j = 0; j<k.length();j++) {
					char a1 = k.charAt(j);
					s1 = s1 +a1;
				}
				s2="0";
				i3 = c.add(s1, s2);
				System.out.println("the sum is: " + i3);
			}
			System.exit(0);
		}
		catch(NegativeNumberException ex) {
			System.out.println(ex.getMessage());
			if(i1<0 & i2<0 )
			System.out.println("i.e " + i1 + "," + i2);
			System.exit(0);
		}
		
		System.out.println("the sum is: " + i3); //Prints the added sum.
	}

}

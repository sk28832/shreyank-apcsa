//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class StringOddOrEven
{
	private String word;

	public StringOddOrEven()
	{
	}

	public StringOddOrEven(String s)
	{
		s = "";
	}

	public void setString(String s)
	{
		word = s;
	}

 	public String isEven(String word)
 	{
		if(word.length()%2 == 0) {
			return word + " is even";
		}
		else {
			return word + " is odd";
		}
 		
	}
}
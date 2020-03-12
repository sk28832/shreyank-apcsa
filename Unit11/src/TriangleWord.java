//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class TriangleWord
{
	//instance variables and constructors could be present, but are not necessary
		
	public static void printTriangle(String word)
	{
		String output = "";
		
		for (int row = 1; row <= word.length(); row++)
		{
			for (int line = 0; line < row; line++)
			{
				output += word.substring(0, row);
			}
			output += "\n";

		}
		System.out.println(output);
	}
}
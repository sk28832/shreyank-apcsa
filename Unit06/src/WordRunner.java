//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class WordRunner
{
	public static void main ( String[] args )
	{
		//add test cases	
		Word bruh = new Word();
		bruh.setString("nikki");
		bruh.getFirstChar();
		bruh.getLastChar();
		bruh.getBackWards();
		System.out.println(bruh.toString());
	}
}
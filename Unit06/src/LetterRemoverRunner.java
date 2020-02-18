//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class LetterRemoverRunner
{
	public static void main( String args[] )
	{
		LetterRemover bruh = new LetterRemover();
		bruh.setRemover("sskfjsdjfkjsdfsdf", 's');
		bruh.removeLetters();
		System.out.println(bruh.toString());
											
	}
}
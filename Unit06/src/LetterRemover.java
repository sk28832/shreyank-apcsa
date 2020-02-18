//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class LetterRemover
{
   private String sentence;
   private char lookFor;

	public LetterRemover()
	{
		setRemover("", ' ');
	}

	
	public void setRemover(String s, char rem)
	{
		sentence = s;
		lookFor = rem;
	}

	public String removeLetters()
	{
		int loc = sentence.indexOf(lookFor);
		while(loc >= 0) {
			sentence = sentence.substring(0, loc) + sentence.substring(loc + 1, sentence.length());
			loc = sentence.indexOf(lookFor);
		}
		return sentence;
	}

	public String toString()
	{
		return sentence + " - letter to remove " + lookFor;
	}
}
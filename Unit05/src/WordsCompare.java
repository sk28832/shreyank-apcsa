//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class WordsCompare
{
	private String wordOne, wordTwo;
   private int compare;

	public WordsCompare()
	{
	}

	public WordsCompare(String one, String two)
	{
		one = "";
		two = "";
	}

	public void setWords(String one, String two)
	{
		wordOne = one;
		wordTwo = two;
	}

	public void compare(String wordOne, String wordTwo)
	{
		String shorter =  wordOne.toLowerCase();
		String longer = wordTwo.toLowerCase();
		if(shorter.length() > longer.length()) {
			shorter = wordTwo;
			longer = wordOne;
		}
		for(int i = 0; i < shorter.length(); i++) {
			if (shorter.charAt(i) < longer.charAt(i) && shorter.equals(wordOne)) {
				compare = -1;
				break;
			}
			if(shorter.charAt(i) < longer.charAt(i) && shorter.equals(wordTwo)) {
				compare = 1;
				break;
			}
			if(shorter.charAt(i) > longer.charAt(i) && shorter.equals(wordOne)) {
				compare = 1;
				break;
			}
			if(shorter.charAt(i) > longer.charAt(i) && shorter.equals(wordTwo)) {
				compare = -1;
				break;
			}
		}
		if(compare == 0) {
			compare = -1;
		}
	}

	public String toString()
	{
		if(compare<0)
		{
			return wordOne + " should be placed before " + wordTwo + "\n";
		}
		else
		{
			return wordOne + " should be placed after " + wordTwo + "\n";
		}
	}
}
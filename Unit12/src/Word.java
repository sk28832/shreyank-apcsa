//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Word implements Comparable<Word>
{
private String word;
	
	public Word()
	{
		setWord("");
	}

	public Word(String s)
	{
		setWord(s);
	}
	
	public void setWord(String s)
	{
		word = s;
	}
	
	public String getWord()
	{
		return word;
	}

	public int compareTo( Word wrd )
	{		
		if (word.length() - wrd.getWord().length() == 0)
		{
			return word.compareTo(wrd.getWord());
		}
		else
		{
			return word.length() - wrd.getWord().length();
		}
	}

	public String toString()
	{
		return word;
	}
}
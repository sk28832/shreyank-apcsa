//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class WordsCompareRunner
{
   public static void main( String args[] )
   {
		//add test cases
	   WordsCompare bruh = new WordsCompare();
	   String w1 = "trevor";
	   String w2 = "shreyank";
	   bruh.setWords(w1, w2);
	   bruh.compare(w1, w2);
	   System.out.println(bruh.toString());
	   
	}
}
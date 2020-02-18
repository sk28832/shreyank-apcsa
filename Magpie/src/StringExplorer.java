/**
 * A program to allow students to try out different 
 * String methods. 
 * @author Laurie White
 * @version April 2012
 */
public class StringExplorer
{

	public static void main(String[] args)
	{
		String sample = "The quick brown fox jumped over the lazy dog.";
		
		//  Demonstrate the indexOf method.
		int position = sample.indexOf("quick");
		System.out.println ("sample.indexOf(\"quick\") = " + position);
		
		//  Demonstrate the toLowerCase method.
		String lowerCase = sample.toLowerCase();
		System.out.println ("sample.toLowerCase() = " + lowerCase);
		System.out.println ("After toLowerCase(), sample = " + sample);
		
		//  Try other methods here:	
		int pos = sample.indexOf("slow");
		if(pos != -1)
		System.out.println("slow is found at position " + pos);
		else
		System.out.println("slow is not found");
		
		String sentence = "Computer Science is the best, the greatest, and the most wonderful subject to study!";
		String bruh = "The word 'the' appears at these indexes:";
		int store = 0;
		int loc = sentence.indexOf("the");
		while(loc >= 0) {
			bruh += (store + loc) + " ";
			sentence = sentence.substring(loc + 3, sentence.length());
			store +=loc;
			loc = sentence.indexOf("the");
		}
		System.out.println(bruh);
	}

}

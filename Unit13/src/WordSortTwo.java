//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

public class WordSortTwo
{
	private String[] wordRay;

	public WordSortTwo(String sentence)
	{
		wordRay = sentence.split(" ");
	}

	public void sort()
	{
		boolean action = true;
		while(action) {
			action = false;
			
			for(int i = 1; i < wordRay.length; i++) {
				if(wordRay[i - 1].compareTo(wordRay[i]) > 0) {
					
					String temp = wordRay[i-1];
					
					wordRay[i-1] = wordRay[i];
					wordRay[i] = temp;
					
					action = true;
				}
			}
		}
	}

	public String toString()
	{
		String output = "";
		
		for(String s : wordRay) {
			output += s + "\n";
		}
		
		return output + "\n\n";
	}
}
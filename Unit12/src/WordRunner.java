//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File; 
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.*;

public class WordRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner bruh = new Scanner(new File("src//words.dat"));

		int size = bruh.nextInt();
		Word words[] = new Word[size];
		bruh.nextLine();
		
		int cnt = 0;
		for (int i = 0; i < size; i++)
		{
			words[cnt] = new Word(bruh.nextLine());
			cnt++;
		}
		bruh.close();
		
		Arrays.sort(words);
		
		for (Word item: words)
		{
			System.out.println(item);
		}


	}
}
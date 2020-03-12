//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStoreRunner
{
	public static void main( String args[] )
	{
		ToyStore bruh = new ToyStore("sorry bat sorry sorry sorry train train teddy teddy ball ball");
		bruh.sortToysByCount();
		System.out.println(bruh);
		System.out.println("Max == " + bruh.getMostFrequentToy());
	}
}
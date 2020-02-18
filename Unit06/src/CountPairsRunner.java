//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*; 

public class CountPairsRunner
{
	public static void main( String[] args )
	{
		//add in all of the provided test cases from the lab handout
		CountPairs bruh = new CountPairs();
		System.out.println(bruh.pairCounter("ddogccatppig"));
		System.out.println(bruh.pairCounter("dogcatpig"));
		System.out.println(bruh.pairCounter("xxyyzz"));
		System.out.println(bruh.pairCounter("a"));
		System.out.println(bruh.pairCounter("abc"));
		System.out.println(bruh.pairCounter("aabb"));
		System.out.println(bruh.pairCounter("dogcatpigaabbcc"));
		
	}
}
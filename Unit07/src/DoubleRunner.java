//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class DoubleRunner
{
	public static void main(String[] args)
	{
		BiggestDouble run = new BiggestDouble(4.5,6.7,7.8,9.0);
		System.out.println(run);
		System.out.println();

		//add more test cases
		run.setDoubles(2.3, 1.7, 6.4, 5.7);		
		run.getBiggest();
		System.out.println(run.toString());
	}
}
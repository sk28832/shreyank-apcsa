//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class RecursionFunOne
{
	public static int countOddDigits(int num)
	{

		int count = 0;
		
		if(num % 2 == 1)
			count = 1;
		

		if(num / 10 == 0)
			return count;
		
			
		return count + countOddDigits(num / 10);
	}
}
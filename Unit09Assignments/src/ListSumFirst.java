//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.List;
import java.util.ArrayList;

public class ListSumFirst
{
	public static int go(List<Integer> ray)
	{
		boolean larger = false;
		int sum = 0;
		if (ray.size() == 0) return -1;
		else 
		{
			for (Integer i: ray) {
				if (i > ray.get(0))
				{
					larger = true;
					sum += i;
				}
			}
		}
		if (larger == false) return -1;
		else return sum;
	}
}
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;

public class TotalRow
{
    public static List<Integer> getRowTotals( int[][] m )
    {
    	List<Integer> bruh = new ArrayList<Integer>();
		
		int sum;
		
		for(int[] i : m) {
			sum = 0;
			
			for(int j : i) {
				sum += j;
			}
			bruh.add(sum);
		}
		
		return bruh;
    }
}

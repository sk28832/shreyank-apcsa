import java.util.List;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class TotalRowRunner
{
	public static void main( String args[] ) throws Exception
	{
		printing((new int[][] { { 4, 7, 6 }, { 2, 6, 9, 4 } }));

		printing((new int[][] { { 1, 2, 3 }, { 4 }, { 5 }, { 6, 7 } }));
		
		printing((new int[][] { { 8, 9 }, { 4, 2 }, { 2, 1 }, { 8, 2, 4, 5 }, { 1, 3} }));		
	}
	
	private static void printing(int[][] matrix) {

		List<Integer> totals = TotalRow.getRowTotals(matrix);
		
		System.out.println("Row totals are :: " + totals);
	}
}




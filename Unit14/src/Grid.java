//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Grid
{
   private String[][] grid;

   //load vals into the rows x cols grid randomly
	public Grid(int rows, int cols, String[] vals)
	{
		grid = new String[cols][rows];
		
		for(int i = 0; i < cols; i++) {
			
			for(int jTemp = 0; jTemp < rows; jTemp++) {
				int x = (int) Math.floor(Math.random() * vals.length);
		
				grid[i][jTemp] = vals[x];
			}
		}

		for(int i = 0; i < cols; i++) {
		
			for(int jTemp = 0; jTemp < rows; jTemp++) {
				
				System.out.print(grid[i][jTemp] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("\n" + findMax(vals));
	}

	//find out which of the vals occurs the most
	public String findMax(String[] vals)
	{
		int[] counts = new int[vals.length];
		
		for(int i = 0; i < vals.length; i++) {
		
			int count = countVals(vals[i]);
		
			counts[i] = count;
		
			System.out.println(vals[i] + " count is " + count);
		}
		
		int m = counts[0];
		String letter = vals[0];
		
		for(int i = 1; i < counts.length; i++) {
		
			if(counts[i] > m) {
		
				m = counts[i];
				letter = vals[i];
			}
		}
		return letter + " occurs the most.";
	}

	//returns a count of how many times val occurs in the matrix
	private int countVals( String val )
	{
		int counter = 0;
		for(String[] i : grid) {
		
			for(String jTemp : i) {
		
				if(jTemp.equals(val))
					counter++;
			}
		}
		
		return counter;
	}

	//display the grid
	public String toString()
	{
		String output="";
		return output;
	}
}
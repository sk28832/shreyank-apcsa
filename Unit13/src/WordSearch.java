//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;
import java.io.*; 

public class WordSearch
{
    private String[][] m;
    private int rows;
    private int col;

    public WordSearch( int size, String str )
    {
    		m = new String[size][size];
		
		int index = 1;
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {

				m[i][j] = str.substring(index - 1, index);
				
				index++;
			}
		}
		
		rows = m.length;
		col = m[0].length;
    }

    public boolean isFound( String word )
    {
    	for(int i = 0; i < m.length; i++) {
			for(int j = 0; j < m[i].length; j++) {
				if(checkRight(word, i, j) || checkLeft(word, i, j) || 
						checkUp(word, i, j) || checkDown(word, i, j) || 
							checkDiagUpRight(word, i, j) || 
								checkDiagUpLeft(word, i, j) || 
									checkDiagDownRight(word, i, j) || 
										checkDiagDownLeft(word, i, j)) {
					
					return true;
				}
			}
		}
		return false;
    }

	public boolean checkRight(String w, int r, int c)
   {
		String bruh = "";
		
		for(int i = 0; i < w.length(); i++) {
			String check = getInBounds(r + i, c);
			if(check.equals(""))
				return false;
			bruh += check;
		}
		
		if(bruh.equals(w))
			return true;
		
		
			return false;
	}

	public boolean checkLeft(String w, int r, int c)
	{
		String bruh = "";
		
		for(int i = 0; i < w.length(); i++) {
			String check = getInBounds(r - i, c);
			
			if(check.equals(""))
				return false;
			bruh += check;
		}
		if(bruh.equals(w))
			return true;
		
		return false;
	}

	public boolean checkUp(String w, int r, int c)
	{
		String bruh = "";
		for(int i = 0; i < w.length(); i++) {
			String check = getInBounds(r, c - i);
			if(check.equals(""))
				return false;
			bruh += check;
		}
		if(bruh.equals(w))
			return true;
		
		return false;
	}

	public boolean checkDown(String w, int r, int c)
   {
		String bruh = "";
		
		for(int i = 0; i < w.length(); i++) {
			
			String check = getInBounds(r, c + i);
			
			if(check.equals(""))
				return false;
		
				bruh += check;
		}
		
		if(bruh.equals(w))
			return true;
		
		return false;
	}

	public boolean checkDiagUpRight(String w, int r, int c)
	{
String bruh = "";
		
		for(int i = 0; i < w.length(); i++) {
			
			String check = getInBounds(r + i, c - i);
			
			if(check.equals(""))
				return false;
		
				bruh += check;
		}
		
		if(bruh.equals(w))
			return true;
		
		return false;
	}

	public boolean checkDiagUpLeft(String w, int r, int c)
	{
String bruh = "";
		
		for(int i = 0; i < w.length(); i++) {
			
			String check = getInBounds(r-1, c-i);
			
			if(check.equals(""))
				return false;
		
				bruh += check;
		}
		
		if(bruh.equals(w))
			return true;
		
		return false;
	}

	public boolean checkDiagDownLeft(String w, int r, int c)
   {
		String bruh = "";
		
		for(int i = 0; i < w.length(); i++) {
			
			String check = getInBounds(r-1, c+i);
			
			if(check.equals(""))
				return false;
		
				bruh += check;
		}
		
		if(bruh.equals(w))
			return true;
		
		return false;
	}

	public boolean checkDiagDownRight(String w, int r, int c)
	{
String bruh = "";
		
		for(int i = 0; i < w.length(); i++) {
			
			String check = getInBounds(r+1, c+i);
			
			if(check.equals(""))
				return false;
		
				bruh += check;
		}
		
		if(bruh.equals(w))
			return true;
		
		return false;
	}
	private String getInBounds(int r, int c) {
		
		if(c >= 0 && c < rows) {	
			if(r >= 0 && r < col) {
				return m[c][r];
			}
		}
		return "";
	}

    public String toString()
    {
    	String bruh = "";
		
		for(String[] i : m) {
		
			for(String j : i) {
		
				bruh += j + " ";
			}
		
			bruh += "\n";
		}
		return bruh;
    }
}

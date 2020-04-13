//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays; 
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberSorter
{
	//instance variables and other methods not shown

	private static int getNumDigits(int number)
	{
		int count = 0;
		while(number > 0) {
			count++;
			number/=10;
		}
		return count;
	}

	public static int[] getSortedDigitArray(int number)
	{
		int[] sorted = new int[getNumDigits(number)];
		
		int index = 0;
		while(number > 0) {
			sorted[index] = number % 10;
			number /= 10;
			index++;
		}
		boolean action = false;
		while(action) {
			action = true;	
			for(int i = 1; i < sorted.length; i++) {
				if((sorted[i-1] + "").compareTo(sorted[i] + "") > 0) {
					
					int temp = sorted[i-1];

					sorted[i-1] = sorted[i];
					sorted[i] = temp;

					action = true;
				}
			}
		}
		return sorted;
	}
}
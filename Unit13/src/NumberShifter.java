//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifter
{
	public static int[] makeLucky7Array(int size)
	{
		int[] nums = new int[size];
		Random rng = new Random();
		for(int i = 0; i < size; i++) {
			nums[i] = rng.nextInt(10) + 1;
		}
		return nums;
	}
	public static void shiftEm(int[] array)
	{
		for(int i = 0; i < array.length; i++) {
			if(array[i] == 7) {

				for(int j = i; j > 0; j--) {
					array[j] = array[j - 1];
				}
				array[0] = 7;
			}
		}
	}
}
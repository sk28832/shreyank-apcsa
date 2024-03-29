//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;
import java.util.Arrays;

public class BiggestDouble
{
	private double one,two,three,four;

	public BiggestDouble()
	{
		this(0,0,0,0);
	}

	public BiggestDouble(double a, double b, double c, double d)
	{
		setDoubles(a, b, c, d);
	}

	public void setDoubles(double a, double b, double c, double d)
	{
		one = a;
		two = b;
		three = c;
		four = d;
	}

	public double getBiggest()
	{
		double[] array = new double[4];
		array[0] = one;
		array[1] = two;
		array[2] = three;
		array[3] = four;
		Arrays.sort(array);
		return array[3];
	}

	public String toString()
	{
	   return one + " " + two + " " + three + " " + four + "\n" + "biggest = " + getBiggest();
	}
}
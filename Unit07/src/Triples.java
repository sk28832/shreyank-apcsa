//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;
import java.math.*;

public class Triples
{
   private int number;

	public Triples()
	{
		this(0);
	}

	public Triples(int num)
	{
		setNum(num);

	}

	public void setNum(int num)
	{
		number = num;

	}
	
	public void TripleCalc() {
		gcf bruh = new gcf();
		for(int i = 1; i <= number; i++) {
			for(int j = 1; j <= number; j++) {
				for(int k = 1; k <= number; k++) {
					if(i*i + j*j == k*k) {
						int a = gcf.gcd(i, gcf.gcd(j, k));
						if(k == 1) {
							System.out.println(i + " " + j + " " + k);
						}			
					}
				}
			}
		}
		
	}
}
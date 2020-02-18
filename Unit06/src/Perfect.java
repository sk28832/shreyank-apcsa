//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Perfect
{
   private int number;

	public Perfect() {
		setPerfect(0);
	}
	
	public Perfect(int n) {
		setPerfect(n);
	}
	
	public void setPerfect(int n) {
		number = n;
	}
	

	//add a set method

	public boolean isPerfect()
	{	
		int sum = 0;
		for (int i = 1; i < number; i++) {
			if(number%i == 0) {
				sum+=i;
			}
		}
		if(sum == number) {
			return true;
		}
		else {
			return false;
		}
	}

	public String toString() {
		if(isPerfect() == true) {
			return number + " is perfect";
		}
		else {
			return number + " is not perfect";
		}
	}
	
}
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class TriangleFive
{
   private char letter;
   private int amount;

	public TriangleFive()
	{
		setLetter(' ');
		setAmount(0);
		
	}

	public TriangleFive(char c, int amt)
	{
		setLetter(c);
		setAmount(amt);
	}

	public void setLetter(char c)
	{
		letter = c;
	}

	public void setAmount(int amt)
	{
		amount = amt;
	}
	

	public void String()
	{
		int amountk = amount;
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		char[] Alphabet = alphabet.toCharArray();
		for(int i = amount; i > 0; i--) {
			for(int j = 0; j < amount; j++) {			
				for(int k = 0; k < amountk - j; k++) {
					System.out.print(Alphabet[alphabet.indexOf(letter) + j]);	
				}
			System.out.print(" ");
			}
		System.out.println();
		amount--;
		}
		
	}
}
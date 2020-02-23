//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Random;
import java.util.Scanner;
import static java.lang.System.*;

public class RockPaperScissors
{
	private String playChoice;
	private String compChoice;

	public RockPaperScissors()
	{
		setPlayers(" ");
	}

	public RockPaperScissors(String player)
	{
		setPlayers(player);
	}

	public void setPlayers(String player)
	{
		playChoice = player;
	}

	public String determineWinner()
	{
		Random rand = new Random();
		String[] rps = {"R", "P", "S"};
		int a = rand.nextInt(3);
		compChoice = rps[a];
		if(playChoice.equals("R") && a==2|| playChoice.equals("P") && a==0 || playChoice.equals("S") && a==1) {
			return "Player";
		}
		if(playChoice.equals(compChoice)) {
			return "Draw!";
		}
		else {
			return "Computer";
		}
		
	}

	public String toString()
	{
		if(determineWinner().charAt(0) == 'D') {
			return "Player had " + playChoice + "\n" + "Computer had " + compChoice + "\n" + determineWinner();
		}
		else {
			return "Player had " + playChoice + "\n" + "Computer had " + compChoice + "\n" + determineWinner() + " wins!";
		}
	}
}
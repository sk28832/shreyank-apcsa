/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card Card1 = new Card("Seven", "Hearts", 7);
		System.out.println(Card1);
		
		Card Card2 = new Card("King", "Spades", 13);
		System.out.println(Card2);
		
		Card Card3 = new Card("Four", "Diamonds", 4);
		System.out.println(Card3);
	}
}

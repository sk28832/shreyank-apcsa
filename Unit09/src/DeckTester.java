/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		Deck test1 = new Deck(new String[] {"Ace", "Queen", "King"}, new String[] {"Diamonds", "Hearts"}, new int [] {1, 12, 13});
		System.out.println(test1);
		test1.deal();
		System.out.println(test1);
		test1.shuffle();
		System.out.println(test1);
		
		Deck test2 = new Deck(new String[] {"Jack", "Three", "Seven"}, new String[] {"Clubs", "Spades"}, new int[] {11, 3, 7});
		System.out.println(test2);
		test2.deal();
		System.out.println(test2);
		test2.shuffle();
		System.out.println(test2);
		
		Deck test3 = new Deck(new String[] {"Ace", "Two", "Three", "Five"}, new String[] {"Clubs", "Hearts", "Diamonds"}, new int[] {1, 2, 3, 5});
		System.out.println(test3);
		test3.deal();
		System.out.println(test3);
		test3.shuffle();
		System.out.println(test3);
	}
}

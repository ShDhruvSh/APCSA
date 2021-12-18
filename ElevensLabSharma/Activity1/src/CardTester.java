/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card c0 = new Card("rank", "suit", 1);
		Card c1 = new Card("rank", "suit", 1);
		Card c2 = new Card("rank", "suit", 2);

		System.out.println(c0.rank());
		System.out.println(c0.suit());
		System.out.println(c0.pointValue());
		System.out.println(c0.matches(c1));
		System.out.println(c0);
		System.out.println();


		System.out.println(c1.rank());
		System.out.println(c1.suit());
		System.out.println(c1.pointValue());
		System.out.println(c1.matches(c0));
		System.out.println(c1);
		System.out.println();


		System.out.println(c2.rank());
		System.out.println(c2.suit());
		System.out.println(c2.pointValue());
		System.out.println(c2.matches(c1));
		System.out.println(c2);
	}
}

/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String[] ranks = {"a", "b", "c"};

		String[] suits = {"aa", "bb", "cc"};

		int[] values = {1, 2, 3};


		String[] ranks1 = {"a", "b", "c"};

		String[] suits1 = {"aa", "bb", "cc"};

		int[] values1 = {1, 2, 3};


		String[] ranks2 = {"a", "b", "c"};

		String[] suits2 = {"aa", "bb", "cc"};

		int[] values2 = {1, 2, 3};

		Deck dec = new Deck(ranks, suits, values);
		Deck dec1 = new Deck(ranks1, suits1, values1);
		Deck dec2 = new Deck(ranks2, suits2, values2);

		System.out.println(dec.isEmpty());
		System.out.println(dec.size());
		System.out.println(dec.deal());
		System.out.println(dec);

		System.out.println(dec1.isEmpty());
		System.out.println(dec1.size());
		System.out.println(dec1.deal());
		System.out.println(dec1);

		System.out.println(dec2.isEmpty());
		System.out.println(dec2.size());
		System.out.println(dec2.deal());
		System.out.println(dec2);


	}
}

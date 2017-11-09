
public class WarGame {

	public static void main(String[] args) {
		Card c1 = new Card ();
		System.out.println(c1);
		
		char suit = 'D';
		char rank = 'x';
		Card c2 = new Card(suit, rank);
		System.out.println(c2);
	}

}

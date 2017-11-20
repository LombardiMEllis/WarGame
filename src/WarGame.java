
public class WarGame {

	public static void main(String[] args) {
		/*
		Card c1 = new Card ();
		System.out.println(c1);
		
		char suit = 'D';
		char rank = 'x';
		Card c2 = new Card(suit, rank);
		System.out.println(c2);
		*/
		
		//War Game!
		//deal cards
		
		int player1 = 0;
		int player2 = 0;
		for (int i = 0; i < 20; i++) {
			Card c1 = new Card(); //generate a random card
			Card c2 = new Card(); //generate second random card
			
			System.out.println("Card 1: " + c1);
			System.out.println("Card 2: " + c2);
			
			//compare cards
			if (c1.isGreaterThan(c2)) {
				player1++;
			} else {
				player2++;
			}
			System.out.println("Player 1 Score: " + player1);
			System.out.println("Player 2 Score: " + player2);
		}
	}

}


public class Card {
	//attributes
	private char suit;
	private char rank;
	
	private static char [] SUITS = {'S', 'D', 'H', 'C'};
	private static char [] RANKS = {'A','2','3','4','5', '6', '7', '8', '9', 'T', 'J', 'Q', 'K'};
	
	//methods
	// ---- overload constructor
	//random card
	public Card () {
		int num = (int)(Math.random() * SUITS.length);
		suit = SUITS[num];
		
		num = (int)(Math.random() * RANKS.length);
		rank = RANKS[num];
		
	}
	
	//constructor that assigns specific values
	public Card (char s, char r) {
		setSuit(s);
		setRank(r);
	}
	
	//set rank within our requirements
	public void setRank(char r) {
		//check to see if it's in RANKS
		for (int i = 0; i < RANKS.length; i++) {
			if (r == RANKS[i]) {
				rank = r;
				return;
			} 
		}
		System.out.println("Rank not found in list.");
	}
	
	//set suit within our requirements
	public void setSuit(char s) {
		//check to see if it's in RANKS
		for (int i = 0; i < SUITS.length; i++) {
			if (s == SUITS[i]) {
				suit = s;
				return;
			} 
		}
		System.out.println("Rank not found in list.");
	}
	
	
	//toString method
	public String toString() {
		String cardInfo = "Rank: " + rank + " Suit: " + suit;
		return cardInfo;
	}
	
	
}

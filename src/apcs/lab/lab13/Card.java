package apcs.lab.lab13;

public class Card {
	int face;
	int suit;
	boolean isFaceUp;
	
	public Card() {
		
	}
	
	public Card(int suit, int face, boolean isFaceUp) {
		this.face = face;
		this.suit = suit;
		this.isFaceUp = true;
	}

	public String cardToString(Card c) {

		String rv ="M" ;
		if (c == null) {
			return null;
		}

		if (!c.isFaceUp) {
			return "??";
		}
		if (c.suit == 1) {
			rv = "S";
		}
		if (c.suit == 2) {
			rv = "H";
		}
		if (c.suit == 3) {
			rv = "C";
		}
		if (c.suit == 4) {
			rv = "D";
		}
		if (c.face == 1) {
			rv += "A";
		}
		else if (c.face == 10) {
			rv += "X";
		}
		else if (c.face == 11) {
			rv += "J";
		}
		else if (c.face == 12) {
			rv += "Q";
		}
		else if (c.face == 13) {
			rv += "K";
		} else {
			rv += c.face;
		}

		return rv;
	}
	
	

}

package apcs.lab.lab21;

public class Card {
	
	private int face;
	private String suit;
	public Card(String suit, int face) {
		this.face = face;
		this.suit = suit;
	}
	public int getFace() {
		return face;
	}
	public void setFace(int face) {
		this.face = face;
	}
	public String getSuit() {
		return suit;
	}
	public void setSuit(String suit) {
		this.suit = suit;
	}

}

package apcs.lab.lab21;

public class Player {
	
	private int numCards = 10;
	private int[] faceUpIndex = new int[10]; //cardArray indexes that are face up.
	private Card[] hand = new Card[10];
	public Player(Deck deck, int startIndex) {
		// beginning of game, create a hand of 10 cards
		for (int i=0; i<numCards; i++) {
			// assign first 10 cards (change to alternating later)
			hand[i] = deck.getCardArr()[startIndex+i];
			/*
			 * once a card is dealt, we want to remove it from deck. But since the deck
			 * array is immutable it is easier to just keep track of the index in deck
			 * array, that represents the point to which we have dealt cards.
			 */
			deck.setDealToIndex(startIndex+i); 			
		}
		
	}
	public int getNumCards() {
		return numCards;
	}
	public void setNumCards(int numCards) {
		this.numCards = numCards;
	}
	public Card[] getHand() {
		return hand;
	}
	public void setHand(Card[] hand) {
		this.hand = hand;
	}
	public int[] getFaceUpIndex() {
		return faceUpIndex;
	}

}

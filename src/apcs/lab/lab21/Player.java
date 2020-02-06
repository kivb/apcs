package apcs.lab.lab21;

public class Player {
	
	private int dealCards = 10; // number of cards (10 or fewer) to deal this player. 
	private Boolean[] isFaceUp = {false,false,false,false,false,false,false,false,false,false}; //cardArray indexes that are face up.
	private Card[] hand = new Card[10];
	
	public Player(Deck deck, int startIndex) {
		// beginning of game, create a hand of 10 cards
		for (int i=0; i<dealCards; i++) {
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
	public int getDealCards() {
		return dealCards;
	}
	public void setDealCards(int dealCards) {
		this.dealCards = dealCards;
	}
	public Card[] getHand() {
		return hand;
	}
	public Card getCardFromHand(int index) {
		return this.hand[index];
	}
	public void setHand(Card card, int index) {
		this.hand[index] = card;
	}
	public Boolean getIsfaceUp(int index) {
		return isFaceUp[index];
	}
	public void setFaceUp(int index) {
		this.isFaceUp[index] = true;
	}

}

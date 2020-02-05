package apcs.lab.lab21;

import java.util.Random;

public class Deck {
	private String[] suit = {"D","H","S","C"};
	private int[] face = {1,2,3,4,5,6,7,8,9,10,11,12,13};
	private Card card;
	private int cc = 0;
	private Card[] cardArr = new Card[52];
	private int dealToIndex = 0;
	
	public Deck() {		// create a new deck of cards
		for (int i=0; i<suit.length; i++) {
			for (int j=0; j< face.length; j++) {
				this.cardArr[cc] = new Card(this.suit[i], this.face[j]);
				cc++;
			}
		}
		
	}
	
	// call this method on the Deck object, to shuffle it (as opposed to passing the deck object to another 
	// shuffling class
	
	public void shuffle() {
		Random rand = new Random();
		// Fisher-Yates shuffle
		for (int i=this.cardArr.length-1; i>0; --i) {
	        int j = rand.nextInt(i + 1);
	        Card temp = this.cardArr[i];
	        this.cardArr[i] = this.cardArr[j];
	        this.cardArr[j] = temp;
		}
	}
	
	public Card drawCard() {
		// dealtoIndex is the last cardArr index that was drawn. So increment first to draw the next card.
		return this.cardArr[++this.dealToIndex];
	}
	
	
	public Card[] getCardArr() {
		return cardArr;
	}

	public void setCardArr(Card[] cardArr) {
		this.cardArr = cardArr;
	}

	public int getDealToIndex() {
		return dealToIndex;
	}

	public void setDealToIndex(int dealToIndex) {
		this.dealToIndex = dealToIndex;
	}

	public static void main(String[] args) {
		Deck aDeck = new Deck();
		System.out.println("Deck before shuffle");
		for (int i=0; i<aDeck.cardArr.length; i++) {
			System.out.print(aDeck.cardArr[i].getSuit() + aDeck.cardArr[i].getFace()+" ");
		}		
		aDeck.shuffle();
		System.out.println("\nDeck after shuffle");
		// Print the deck
		for (int i=0; i<aDeck.cardArr.length; i++) {
			System.out.print(aDeck.cardArr[i].getSuit() + aDeck.cardArr[i].getFace()+" ");
		}


		
//		System.out.println("Suit: "+ aDeck.card.getSuit() + " Face: "+ aDeck.card.getFace() );
	}
}

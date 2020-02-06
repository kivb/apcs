package apcs.lab.lab21;

import java.util.Arrays;

public class Board {
	
	
	public Board() {

	}
	public void draw(Player p1, Player p2) {
		// sort player isFaceUpIndex arrays
//		Arrays.sort(p1.getFaceUpIndex());
//		Arrays.sort(p2.getFaceUpIndex());
		
		//System.out.println(Arrays.toString(p1.getFaceUpIndex()));
		// draw board for Player1 and Player2
		System.out.println("Player1 hand:");
		draw2(p1);
		System.out.println("\n\nPlayer2 hand:");
		draw2(p2);
	}
	
	/**
	 * @param p
	 */
	private 	void draw2(Player p) {		
		System.out.println("1\t2\t3\t4\t5\t6\t7\t8\t9\t10");
		/*
		 * for (int i=0; i<p.getHand().length; i++) { if
		 * (Arrays.binarySearch(p.getFaceUpIndex(),i) > 0 ) { // index is found in
		 * isFaceUp array. Show the card at this index.
		 * System.out.print(p.getHand()[i].getSuit() + p.getHand()[i].getFace()+"\t"); }
		 * else { System.out.print("X\t"); } }
		 */
	}
	
	// get a new Deck
	// shuffle Deck
	// deal cards from Deck

}

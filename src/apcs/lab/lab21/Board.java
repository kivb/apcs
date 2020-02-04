package apcs.lab.lab21;

import java.util.Arrays;

public class Board {
	
	
	public Board() {

	}
	public void draw(Player p1, Player p2) {
		// sort player isFaceUpIndex arrays
		Arrays.sort(p1.getFaceUpIndex());
		Arrays.sort(p2.getFaceUpIndex());
		
		System.out.println(Arrays.toString(p1.getFaceUpIndex()));
		// draw board for Player1 and Player2
		System.out.println("Player1 hand:");
		System.out.println("1\t2\t3\t4\t5\t6\t7\t8\t9\t10");
		for (int i=0; i<p1.getHand().length; i++) {
			if (Arrays.binarySearch(p1.getFaceUpIndex(),i) > 0 ) {	// index is found in isFaceUp array. Show the card at this index.				
				System.out.print(p1.getHand()[i].getSuit() + p1.getHand()[i].getFace()+"\t");		
			} else {
				System.out.print("X\t");
			}
		}
		
		System.out.println("\n\nPlayer2 hand:");
		System.out.println("1\t2\t3\t4\t5\t6\t7\t8\t9\t10");
		for (int i=0; i<p2.getHand().length; i++) {
			System.out.print(p2.getHand()[i].getSuit() + p2.getHand()[i].getFace()+"\t");		
		}
	}
	
	// get a new Deck
	// shuffle Deck
	// deal cards from Deck

}

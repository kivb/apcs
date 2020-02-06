package apcs.lab.lab13;

import java.util.Random;

public class Concentration {

	/*
	 * takes in a 2-d array of Cards and prints them face up or face down.
	 */
	public static void printBoard(Card[][] card) {
		Card c = new Card();
		boolean ran = false;

		for (int i = 0; i < card.length; i++) {
			if (!ran) {
				for (int k = 0; k < card[i].length; k++) {
					System.out.print("\t");
					System.out.print(k + 1);
					ran = true;
				}
			}
			System.out.println();
			System.out.print(i + 1);

			for (int j = 0; j < card[i].length; j++) {
				System.out.print("\t" + c.cardToString(card[i][j]));
			}
		}
	}

	public static void printBoardFaceUp(Card[][] card) {

	}

	public static Card[] createRandomDeck() {
		Card[] deck = new Card[52];
		Card[] randDeck = new Card[52];
		for (int i = 0; i < 52; i++) {
			deck[i] = new Card(i / 13 + 1, i % 13 + 1, false);
//			System.out.println(deck[i].cardToString(deck[i]));
		}
		Random rand = new Random();
		for (int i = 0; i < randDeck.length; i++) {
			randDeck[i] = deck[rand.nextInt(deck.length)];
//			System.out.println(deck[0].cardToString(randDeck[i]));
		}
		return randDeck;
	}

	// In the Concentration class, create a function that returns a 7x8 board,
	// filled with random cards, all face down.

	public static Card[][] createRandomBoard() {
		// First create a 2d Array
		Card[][] cardArr = new Card[7][8];
		Card[] randDeck = createRandomDeck();
		int k = 0;
		
		for (int i=0; i<cardArr.length; i++) {
			for (int j=0; j<cardArr[i].length; j++) {
				cardArr[i][j] = randDeck[k];
				k += 1;
				if (k == 52) {
					break;
				}
			}
		}
		return cardArr;
	}

}

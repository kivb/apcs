package apcs.lab.lab13;

public class Main {

	public static void main(String[] args) {
		/*
		 * Create an ordered deck of cards (starting at spade A, ending at diamond K)
		 * and print it out.
		 */

		// First create a 2d Array
		Card[][] cardArr = new Card[4][13];
		Card dc = new Card();
		int c = 0;

		/*
		 * i = 0 --> 51 Suit i/13 +1 face i%13 +1
		 */
		// card suits 1=S, 2=H, 3=C, 4=D
		for (int i = 0; i < cardArr.length; i++) { 
			for (int j = 0; j < cardArr[i].length; j++) { // card faces 1=A, 10=X, 11=J, 12=Q, 13=K
				cardArr[i][j] = new Card(c / 13 + 1, c % 13 + 1, false);
				c++;
				if (c == 52) {
					break;
				}
			}

		}
		
		// Print cards
//		Concentration con = new Concentration();
		Concentration.printBoard(Concentration.createRandomBoard());
		
		// a. In the Concentration class, create a function that returns a randomized deck.
//		Card[] deck = Concentration.createRandomDeck();
		
		
		/*
		 * for (int i=0; i<cardArr.length; i++) { for (int j = 0; j< cardArr[i].length;
		 * j++) { System.out.print(dc.cardToString(cardArr[i][j]) + "\t"); }
		 * System.out.println(); }
		 */		

	}

}

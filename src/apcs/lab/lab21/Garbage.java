package apcs.lab.lab21;

import java.util.Arrays;

public class Garbage {
	private int round;
	private Deck deck;
	private Board board;
	private Player p1;
	private Player p2;
	private Player currPlayer;

	public Garbage() {
		// Set up game
		this.deck = new Deck();
		this.deck.shuffle();
		// this.board = new Board();
		this.p1 = new Player(deck, deck.getDealToIndex());
		this.p2 = new Player(deck, deck.getDealToIndex() + 1);
	}

	public void drawBoard(Player p1, Player p2) {
		// draw board for Player1 and Player2
		System.out.println("\n\nPlayer1 hand:");
		draw2(p1);
		System.out.println("\n\nPlayer2 hand:");
		draw2(p2);
	}

	private void draw2(Player p) {
		System.out.println("1\t2\t3\t4\t5\t6\t7\t8\t9\t10");
		for (int i = 0; i < p.getHand().length; i++) {
			if (p.getIsfaceUp(i)) { // index is found in isFaceUp array. Show the card at this index.
				System.out.print(p.getHand()[i].getSuit() + p.getHand()[i].getFace() + "\t");
			} else {
				System.out.print("X\t");
			}
		}
	}

	private void play(Player p) {
		// draw card from deck
		// if card is < 11 || card == 13
		Card drawn = this.deck.drawCard();
		Card replaced;
		int flipIndex;
		System.out.println("\n\nWe drew: " + drawn.getSuit() + drawn.getFace() + "\n");
		while (drawn.getFace() == 13 || drawn.getFace() < 11) {
			if (drawn.getFace() == 13) {
				// find the first unflipped card and flip it
				for (int i = 0; i < p.getHand().length; i++) {
					if (p.getIsfaceUp(i)) { // card is face up
						continue;
					} else { // card is face down
						replaced = p.getHand()[i];
						p.setHand(drawn, i);
						p.setFaceUp(i); // set the card at index face up
						this.drawBoard(p1, p2);
						drawn = replaced;
						break;
					}
				}

				// are all cards flipped?

			} else { // we got < 11
				// If the face of the card has a flipped position on the board, end turn for
				// current player
				// NOTE: We do not check if the flipped position is a K
				flipIndex = drawn.getFace()-1; // index starts at 0
				if (p.getIsfaceUp(flipIndex)) { // returns true if the card is already flipped. Can't use this card
					// Turn over. Set currentPlayer to other.
					if (this.currPlayer.equals(this.p1)) { 
						this.currPlayer = p2;
					} else {
						this.currPlayer = p1;
					}
					
					this.drawBoard(p1, p2);

				} else { // card is not flipped
					replaced = p.getCardFromHand(flipIndex);
					p.setHand(drawn, flipIndex);
					p.setFaceUp(flipIndex);  // set the card face up
					this.drawBoard(p1, p2);
					drawn = replaced;
					//break;
				}

			}
		}
	}
	

	public Player getCurrPlayer() {
		return currPlayer;
	}

	public void setCurrPlayer(Player currPlayer) {
		this.currPlayer = currPlayer;
	}

	public static void main(String[] args) {
		// create initial game
		Garbage game = new Garbage();
		game.setCurrPlayer(game.p1);

		// print player cards
		game.drawBoard(game.p1, game.p2);
		game.play(game.currPlayer);
		// check win

		System.out.println("\n\nStart drawing at: " + game.deck.getDealToIndex());

	}

}

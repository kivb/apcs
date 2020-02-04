package apcs.lab.lab21;

public class Garbage {
	private int round;
	private Deck deck;
	private Board board;
	private Player p1;
	private Player p2;


	public Garbage() {
		// Set up game
		Deck deck = new Deck();
		deck.shuffle();
		this.board = new Board();
		this.p1 = new Player(deck,deck.getDealToIndex());
		this.p2 = new Player(deck,deck.getDealToIndex()+1);
	}
	
	public static void main(String[] args) {
		// create initial game
		Garbage game = new Garbage();
		
		// print board
		
	
		// print player cards
		game.board.draw(game.p1, game.p2);
		/*
		 * System.out.println("Player1 hand:"); for (int i=0;
		 * i<game.p1.getHand().length; i++) {
		 * System.out.print(game.p1.getHand()[i].getSuit() +
		 * game.p1.getHand()[i].getFace()+" "); } System.out.println("\nPlayer2 hand:");
		 * for (int i=0; i<game.p1.getHand().length; i++) {
		 * System.out.print(game.p2.getHand()[i].getSuit() +
		 * game.p2.getHand()[i].getFace()+" "); }
		 */
		
	}
	

}

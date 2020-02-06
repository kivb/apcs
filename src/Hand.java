
public class Hand {

	public Finger rThumb, lIndex;

	public Hand() {
		// TODO Auto-generated constructor stub
		rThumb = new Finger(2,1,"brown");
		lIndex = new Finger(4, 2, "brown");
	}
	
	public void move() {
		System.out.println("I moved!");
	}

}


public class Finger {
	int length;
	int numJoints;
	String color;
	public Finger(int length, int numJoints, String color) {
		this.length = length;
		this.numJoints = numJoints;
		this.color = color;	
		
	}
	
	public void move() {
		System.out.println("Finger moved!");
	}

}

package aps.lab.lab18;

public class Train extends Vehicle {

	private int numBoxCars;

	public Train() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Train(int numberOfSeats, int numberOfPassengers, int topSpeed, Point currentPosition, Point destination) {
		super(numberOfSeats, numberOfPassengers, topSpeed, currentPosition, destination);
		// TODO Auto-generated constructor stub
	}
	
	public void communicate() {
		System.out.println("I think I can, I think I can!" );
	}
	
	public String toString() {
		return "This is a train, all aboard!"; 
	}
}

package aps.lab.lab18;

public abstract class Vehicle {
	
	// Instance Variables
	private int numberOfSeats, numberOfPassengers, topSpeed;
	private Point currentPosition, destination;
	
	// Constructors
	public Vehicle() {
		numberOfSeats = 1;
		numberOfPassengers = 1;
		topSpeed = 0;
		currentPosition = new Point(1, 1);
		destination = new Point(1,1);
	}
	
	public Vehicle(int numberOfSeats, int numberOfPassengers, int topSpeed, 
			Point currentPosition, Point destination) {
		this.numberOfSeats = numberOfSeats;
		this.numberOfPassengers = numberOfPassengers;
		this.topSpeed = topSpeed;
		this.currentPosition = currentPosition;
		this.destination = destination;
	}
	
	public int speedCompareTo(Vehicle v) {
		return 2;
	}

	// Getters & Setters
	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}

	public int getNumberOfPassengers() {
		return numberOfPassengers;
	}

	public void setNumberOfPassengers(int numberOfPassengers) {
		this.numberOfPassengers = numberOfPassengers;
	}

	public int getTopSpeed() {
		return topSpeed;
	}

	public void setTopSpeed(int topSpeed) {
		this.topSpeed = topSpeed;
	}

	public Point getCurrentPosition() {
		return currentPosition;
	}

	public void setCurrentPosition(Point currentPosition) {
		this.currentPosition = currentPosition;
	}

	public Point getDestination() {
		return destination;
	}

	public void setDestination(Point destination) {
		this.destination = destination;
	}

	// Methods
	public void communicate() {
		System.out.println("Hey you!");
	}
	
	public String toString() {
		return "This is a vehicle.";
	}
}

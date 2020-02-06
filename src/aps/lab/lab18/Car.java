package aps.lab.lab18;

public class Car extends Vehicle {

	private int numDoors;
	private String engineType;

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Car(int numberOfSeats, int numberOfPassengers, int topSpeed, Point currentPosition, Point destination) {
		super(numberOfSeats, numberOfPassengers, topSpeed, currentPosition, destination);
		// TODO Auto-generated constructor stub
	}
	
	public void communicate() {
		System.out.println("Honk honk!" );
	}
	
	public String toString() {
		return "This is a " + this.engineType + "car with " + this.numDoors + "doors."; 
	}

	public int getNumDoors() {
		return numDoors;
	}

	public void setNumDoors(int numDoors) {
		this.numDoors = numDoors;
	}

	public String getEngineType() {
		return engineType;
	}

	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}

}

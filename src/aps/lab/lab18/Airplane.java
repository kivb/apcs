package aps.lab.lab18;

public class Airplane extends Vehicle{

	// Instance Variables
	private String flightNumber;
	
	// Constructors
	public Airplane() {
		// call super constructor ?
		flightNumber = "A101";
	}
	
	public Airplane(String flightNumber) {
		this.flightNumber = flightNumber;
	}
	
	// Getters & Setters
	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	// Methods
	public void communicate() {
		System.out.println("Tower, this is flight" + this.flightNumber + ". Requesting permission to land.");
	}
	
	public String toString() {
		return "This is an airplane, flight number " + this.flightNumber + ".";
	}
}

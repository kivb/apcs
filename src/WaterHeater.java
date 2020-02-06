
public class WaterHeater {
	
	int capacity, maxTemp, minTemp;
	String brand;
	
	// Functions
	public void heatWater() {
		System.out.println("Heating water...");
	}
	
	public static void main(String args[]) {
		WaterHeater wh1 = new WaterHeater();		// 3930 water heater
		WaterHeater wh2 = wh1;					// 3930 water heater
		WaterHeater wh3 = wh1;					// 3930 water heater
		
		// do we have 2 water heaters?
		
		System.out.println("WH1 contains: " + wh1);
		System.out.println("WH2 contains: " + wh2);
		System.out.println("WH3 contains: " + wh3);
	}


}

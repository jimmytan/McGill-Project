package mcgill.comp512.server.context;

public class CarContext extends BaseContext{
	private String location;
	private int numberOfCars;
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getNumberOfCars() {
		return numberOfCars;
	}
	public void setNumberOfCars(int numberOfCars) {
		this.numberOfCars = numberOfCars;
	}
	
	

}

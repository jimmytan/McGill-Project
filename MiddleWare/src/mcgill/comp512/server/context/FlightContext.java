package mcgill.comp512.server.context;

public class FlightContext extends BaseContext{
	private String flightNumber;
	
	private String flightSeats;

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getFlightSeats() {
		return flightSeats;
	}

	public void setFlightSeats(String flightSeats) {
		this.flightSeats = flightSeats;
	}
	
	

}

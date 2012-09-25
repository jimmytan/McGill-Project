package mcgill.comp512.server.context;

public class RequestContext {
	private CarContext carContext;
	
	private FlightContext flightContext;
	private HotelContext hotelContext;
	private CustomerContext customerContext;
	public CarContext getCarContext() {
		return carContext;
	}
	public void setCarContext(CarContext carContext) {
		this.carContext = carContext;
	}
	public FlightContext getFlightContext() {
		return flightContext;
	}
	public void setFlightContext(FlightContext flightContext) {
		this.flightContext = flightContext;
	}
	public HotelContext getHotelContext() {
		return hotelContext;
	}
	public void setHotelContext(HotelContext hotelContext) {
		this.hotelContext = hotelContext;
	}
	public CustomerContext getCustomerContext() {
		return customerContext;
	}
	public void setCustomerContext(CustomerContext customerContext) {
		this.customerContext = customerContext;
	}

	
}

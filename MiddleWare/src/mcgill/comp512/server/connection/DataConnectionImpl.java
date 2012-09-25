package mcgill.comp512.server.connection;

import java.rmi.RemoteException;
import java.util.Vector;

public class DataConnectionImpl implements Connection{

	public boolean addCars(int id, String location, int numCars, int price)
			throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean addFlight(int id, int flightNum, int flightSeats,
			int flightPrice) throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean addRooms(int id, String location, int numRooms, int price)
			throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean deleteCars(int id, String location) throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean deleteCustomer(int id, int customer) throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean deleteFlight(int id, int flightNum) throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean deleteRooms(int id, String location) throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean itinerary(int id, int customer, Vector flightNumbers,
			String location, boolean Car, boolean Room) throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}

	public int newCustomer(int id) throws RemoteException {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean newCustomer(int id, int cid) throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}

	public int queryCars(int id, String location) throws RemoteException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int queryCarsPrice(int id, String location) throws RemoteException {
		// TODO Auto-generated method stub
		return 0;
	}

	public String queryCustomerInfo(int id, int customer)
			throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	public int queryFlight(int id, int flightNumber) throws RemoteException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int queryFlightPrice(int id, int flightNumber)
			throws RemoteException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int queryRooms(int id, String location) throws RemoteException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int queryRoomsPrice(int id, String location) throws RemoteException {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean reserveCar(int id, int customer, String location)
			throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean reserveFlight(int id, int customer, int flightNumber)
			throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean reserveRoom(int id, int customer, String locationd)
			throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}

}

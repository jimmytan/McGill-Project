package mcgill.comp512.server.service;

import mcgill.comp512.server.connection.Connection;

public abstract class BaseServiceImpl {
	protected Connection connection;

	public void setConnection(Connection connection) {
		this.connection = connection;
	}

	public Connection getConnection() {
		return connection;
	}
	
}

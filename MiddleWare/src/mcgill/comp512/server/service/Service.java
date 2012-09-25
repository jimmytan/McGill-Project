package mcgill.comp512.server.service;

import mcgill.comp512.server.context.BaseContext;
import mcgill.comp512.server.context.QueryType;

public interface Service {
	
	boolean add(BaseContext context);
	
	boolean delete(BaseContext context);
	
	double query(BaseContext context, QueryType type);
	
	boolean reserve(BaseContext context);

}

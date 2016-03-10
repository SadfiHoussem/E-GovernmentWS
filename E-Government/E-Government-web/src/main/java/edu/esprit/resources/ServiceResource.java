package edu.esprit.resources;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import edu.esprit.domain.Service;
import edu.esprit.services.gestion.service.ServiceLocal;


@Path("/service")
@Stateless
public class ServiceResource {
	
	@Inject
	ServiceLocal myejb;
	
	@GET
	@Produces("application/json")
	public List<Service> getAllServices(){
		return myejb.showAllServices();
	}	
	
	
}

package edu.esprit.resources;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import edu.esprit.domain.EDinarServiceRequest;
import edu.esprit.services.gestion.*;
import edu.esprit.services.gestion.edinarservicerequest.GestionEDinarServiceRequestLocal;

@Path("/edinarrequest")
@Stateless
public class EDinarServiceRequestResource {

	

	@Inject
	GestionEDinarServiceRequestLocal myejb;
	
	@GET
	@Produces("application/json")
	public List<EDinarServiceRequest> getAll(){
		return myejb.findAllEDinarServiceRequest();
	}	
}

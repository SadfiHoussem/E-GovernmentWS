package edu.esprit.resources;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import edu.esprit.domain.CinRequest;
import edu.esprit.domain.EDinarCard;
import edu.esprit.services.gestion.cinRequest.GestionCinRequestLocal;

@Path("/cinrequest")
@Stateless
public class CinRequestResource {

	@Inject
	GestionCinRequestLocal myejb ; 
	
	@GET
	@Produces("application/json")
	public List<CinRequest> getAllCinRquest(){
		return myejb.findAllCinRequest();
	}	
}

package edu.esprit.resources;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import edu.esprit.domain.CinRequest;
import edu.esprit.domain.Client;
import edu.esprit.services.gestion.cinRequest.GestionCinRequestLocal;
import edu.esprit.services.gestion.client.GestionClientLocal;

@Path("/clients")
@Stateless
public class ClientResource {
	
	@Inject
	GestionClientLocal myejb ; 
	
	@GET
	@Produces("application/json")
	public List<Client> getAllClient(){
		return myejb.findAllClient();
	}	

}

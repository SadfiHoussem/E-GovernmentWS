package edu.esprit.resources;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import edu.esprit.domain.BirthRegistration;
import edu.esprit.domain.EDinarCard;
import edu.esprit.services.gestion.birthregistration.GestionBirthRegistrationLocal;

@Path("/birthregistration")
@Stateless
public class BirthRegistrationResource {

	@Inject
	GestionBirthRegistrationLocal myejb; 
	
	@GET
	@Produces("application/json")
	public List<BirthRegistration> getAllBirthRegistration(){
		return myejb.findAllBirthRegistration();
	}	
}

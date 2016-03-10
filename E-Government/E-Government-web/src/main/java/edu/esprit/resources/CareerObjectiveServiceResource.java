package edu.esprit.resources;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import edu.esprit.domain.CareerObjectiveService;
import edu.esprit.domain.EDinarCard;
import edu.esprit.services.gestion.careerobjectiveservice.GestionCareerObjectiveServiceLocal;

@Path("/careerobjective")
@Stateless
public class CareerObjectiveServiceResource {

	@Inject
	GestionCareerObjectiveServiceLocal myejb;
	
	@GET
	@Produces("application/json")
	public List<CareerObjectiveService> getAllCareerObjective(){
		return myejb.findAllCareerObjectiveService();
	}	
}

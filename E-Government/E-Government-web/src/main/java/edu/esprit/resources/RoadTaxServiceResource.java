package edu.esprit.resources;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import edu.esprit.domain.*;
import edu.esprit.services.gestion.roadtaxservice.GestionRoadTaxServiceLocal;

@Path("/roadtaxservice")
public class RoadTaxServiceResource {
	
	@Inject
	GestionRoadTaxServiceLocal myejb;
	
	@GET
	@Produces("application/json")
	public List<RoadTaxService> getAllRoadTaxService(){
		return myejb.findAllRoadTaxService();
	}	
}

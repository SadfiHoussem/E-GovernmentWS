package edu.esprit.resources;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import edu.esprit.domain.Claim;
import edu.esprit.services.gestion.claim.GestionClaimLocal;

@Path("/claim")
public class ClaimResource {

	@Inject
	GestionClaimLocal myejb; 
	
	@GET
	@Produces("application/json")
	public List<Claim> getAllClaim(){
		return myejb.findAllClaim();
	}	
	
	
}

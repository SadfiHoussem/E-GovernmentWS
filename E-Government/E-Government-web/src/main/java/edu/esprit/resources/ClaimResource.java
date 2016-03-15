package edu.esprit.resources;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import edu.esprit.domain.Claim;
import edu.esprit.services.gestion.claim.GestionClaimLocal;

@Path("/claim")
@Stateless
public class ClaimResource {

	@Inject
	GestionClaimLocal myejb; 
	
	@GET
	@Produces("application/json")
	public List<Claim> getAllClaim(){
		return myejb.findAllClaim();
	}	
	@GET
	@Produces("application/json")
	@Path("{id}")
	public List<Claim> getMyClaim(@PathParam("id") int id){
		return myejb.findClaimByCitizen(id);
	}	
	
	@GET
	@Produces("application/json")
	@Path("/response")
	public List<Claim> getResponseClaim(@QueryParam("id") int id){
		return myejb.findResponseByCitizen(id);
	}
	
	@POST
	@Consumes("application/json")
	@Path("/add")
	public boolean addMyClaim(Claim c){
	return myejb.addClaim(c);
	}	
	
	
}

package edu.esprit.resources;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import edu.esprit.domain.Etablishment;
import edu.esprit.services.gestion.etablishment.GestionEtablishmentLocal;

@Path("/etablishment")
public class EtablishmentResource {
	@Inject
	GestionEtablishmentLocal myejb;
	
	@GET
	@Produces("application/json")
	public List<Etablishment> getAllEtablishment(){
		return myejb.findAllEtablishments();
	}	
	
	@GET
	@Produces("application/json")
	@Path("/{name}")
	public Etablishment getEtablishmentByName(@PathParam("name") String name){
		return myejb.findEtablishmentByName(name);
	}	
	
}

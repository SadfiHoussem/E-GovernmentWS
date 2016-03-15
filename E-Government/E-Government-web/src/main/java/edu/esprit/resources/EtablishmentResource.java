package edu.esprit.resources;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import edu.esprit.domain.Etablishment;
import edu.esprit.services.gestion.etablishment.GestionEtablishmentLocal;

@Path("/etablishment")
@Stateless
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
	
	@GET
	@Produces("application/json")
	@Path("/type")
	public List<Etablishment> getType(){
		return myejb.findEtablishmentType();
	}	
	@GET
	@Path("/typelocation")
	@Produces("application/json")
	public List<Etablishment> getEtablismentByType(@QueryParam("type") String type, @QueryParam("location") String location){
		return myejb.findAllEtablishmentsByLocationType(type, location);
	}	
}

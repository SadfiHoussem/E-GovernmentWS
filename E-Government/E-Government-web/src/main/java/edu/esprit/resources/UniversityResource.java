package edu.esprit.resources;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import edu.esprit.domain.Categorie;
import edu.esprit.domain.University;
import edu.esprit.services.gestion.categorie.GestionCategorieLocal;
import edu.esprit.services.gestion.university.GestionUniversityLocal;

@Path("/universities")
public class UniversityResource {
	@Inject
	GestionUniversityLocal myejb;
	
	
	@GET
	@Produces("application/json")
	public List<University> getAllUniversities(){
		return myejb.findAllUniversity();
	}	
	
	@GET
	@Produces("application/json")
	@Path("/{mail}")
	public University getUniversityByMail(@PathParam("mail") String mail){
		return myejb.findUniversityByMail(mail);
	}	
	
	@GET
	@Produces("application/json")
	@Path("/{name}")
	public University getUniversityByName(@PathParam("name") String name){
		return myejb.findUniversityByName(name);
	}	
	
}

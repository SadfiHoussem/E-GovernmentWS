package edu.esprit.resources;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import edu.esprit.domain.Categorie;
import edu.esprit.services.gestion.categorie.GestionCategorieLocal;

@Path("/categories")
@Stateless
public class CategorieResource {
	
	@Inject
	GestionCategorieLocal myejb;
	
	@GET
	@Produces("application/json")
	public List<Categorie> getAll(){
		try {
			return myejb.findAllCategorie();
		} catch (Exception e) {
			System.out.println("++ Test ++ "+myejb);
			return null;
		}
	}	
	
	
}

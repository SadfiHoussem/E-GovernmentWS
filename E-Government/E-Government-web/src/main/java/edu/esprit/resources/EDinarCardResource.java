package edu.esprit.resources;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import edu.esprit.domain.EDinarCard;
import edu.esprit.services.gestion.eDinarCard.GestionEDinarCardLocal;

@Path("/edinar")
public class EDinarCardResource {

	@Inject
	GestionEDinarCardLocal myejb; 
	
	@GET
	@Produces("application/json")
	public List<EDinarCard> getAllEDinarCard(){
		return myejb.findAllEDinarCard();
	}	
	@GET
	@Produces("application/json")
	@Path("/{numero}")
	public EDinarCard getEdinarCardByNumero(@PathParam("numero") String numero){
		return myejb.findEDinarCardByNumeroCard(numero);
	}	
	
}

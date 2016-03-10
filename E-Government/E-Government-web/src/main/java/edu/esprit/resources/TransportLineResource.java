package edu.esprit.resources;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import edu.esprit.domain.Categorie;
import edu.esprit.domain.TransportLine;
import edu.esprit.services.gestion.categorie.GestionCategorieLocal;
import edu.esprit.services.gestion.transportline.GestionTransportLineLocal;

@Path("/transportline")
@Stateless
public class TransportLineResource {
	@Inject
	GestionTransportLineLocal myejb;
	
	@GET
	@Produces("application/json")
	public List<TransportLine> getAllTransportLine(){
		return myejb.findAllTransportLines();
	}	
	
	@GET
	@Produces("application/json")
	@Path("/{numero}")
	public TransportLine getTransportLineNumero(@PathParam("numero") String numeroLine){
		return myejb.findTransportLineByNumeroLine(numeroLine);
	}	
}

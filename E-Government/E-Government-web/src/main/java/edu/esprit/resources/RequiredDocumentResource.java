package edu.esprit.resources;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import edu.esprit.domain.Categorie;
import edu.esprit.domain.RequiredDocument;
import edu.esprit.domain.Service;
import edu.esprit.services.gestion.categorie.GestionCategorieLocal;
import edu.esprit.services.gestion.requireddocument.GestionRequiredDocumentLocal;

@Path("/reqdocument")
@Stateless
public class RequiredDocumentResource {
	
	@Inject
	GestionRequiredDocumentLocal myejb;
	
	@GET
	@Produces("application/json")
	public List<RequiredDocument> getAllReqDoc(){
		return myejb.findAllRequiredDocument();
	}	
	
	@GET
	@Produces("application/json")
	@Path("/{id}")
	public List<RequiredDocument> getReqDocByService(@PathParam("id") int id){
		Service service=null ;
		List<RequiredDocument> list=myejb.findAllRequiredDocument();
		for(RequiredDocument r:list){
			if(r.getService().getIdService()==id)
				service=r.getService();
		}
		
		return myejb.findRequiredDocumentByService(service);
	}		
}

package edu.esprit.services.gestion.claim;

import java.util.List;

import javax.ejb.Local;

import edu.esprit.domain.Claim;

@Local
public interface GestionClaimLocal {
	List<Claim> findAllClaim();

}

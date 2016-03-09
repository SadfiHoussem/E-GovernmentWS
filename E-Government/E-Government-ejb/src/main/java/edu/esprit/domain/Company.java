package edu.esprit.domain;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Company
 *
 */
@Entity
@DiscriminatorValue(value="company")
public class Company extends Client implements Serializable  {
	
	private String name;
	private static final long serialVersionUID = 1L;

	public Company() {
		super();
	}   
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
   
}

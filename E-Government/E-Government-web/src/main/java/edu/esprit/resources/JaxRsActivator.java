package edu.esprit.resources;

import javax.ejb.Stateless;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/rest")
@Stateless
public class JaxRsActivator extends Application {

}

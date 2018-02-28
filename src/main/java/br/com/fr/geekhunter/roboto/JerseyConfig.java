package br.com.fr.geekhunter.roboto;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import br.com.fr.geekhunter.roboto.rest.MarsREST;

@Component
@ApplicationPath("/rest")
public class JerseyConfig extends ResourceConfig {

	public JerseyConfig() {
		register(MarsREST.class);
	}
}

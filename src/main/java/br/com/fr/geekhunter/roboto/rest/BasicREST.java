package br.com.fr.geekhunter.roboto.rest;

import java.io.Serializable;
import java.net.URI;
import java.util.List;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import br.com.fr.geekhunter.roboto.model.BasicAPIDTO;
import br.com.fr.geekhunter.roboto.model.ResponseDTO;

/**
 * @author Romeu Franzoia Jr
 *
 */
public class BasicREST implements Serializable {

	private static final long serialVersionUID = 1L;

	public Response ok(String mensagem) {
		return Response.ok().entity(new ResponseDTO(Status.OK.getStatusCode(), mensagem)).build();
	}

	public Response badRequest(String mensagem) {
		return Response.status(Response.Status.BAD_REQUEST).entity(new ResponseDTO(Status.BAD_REQUEST.getStatusCode(), mensagem)).build();
	}
	
	public Response notFound(String mensagem) {
		return Response.status(Response.Status.NOT_FOUND).entity(new ResponseDTO(Status.NOT_FOUND.getStatusCode(), mensagem)).build();
	}
	
	public Response ok() {
		return Response.ok().entity(new ResponseDTO(Status.OK.getStatusCode(), "")).build();
	}


	public Response created(URI location, String msg) {
		return Response.created(location).entity(new ResponseDTO(Status.CREATED.getStatusCode(), msg)).build();
	}

	public List<BasicAPIDTO> API() {
		return null;
	}
}
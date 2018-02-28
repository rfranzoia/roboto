package br.com.fr.geekhunter.roboto.rest;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;

import br.com.fr.geekhunter.roboto.exception.MovimentacaoInvalidaException;
import br.com.fr.geekhunter.roboto.exception.PosicaoInvalidaException;
import br.com.fr.geekhunter.roboto.model.ResponseDTO;
import br.com.fr.geekhunter.roboto.service.MarsService;

/**
 * @author Romeu Franzoia Jr
 *
 */
@Component
@Path("mars")
public class MarsREST extends BasicREST {

	private static final long serialVersionUID = 1L;
	
	@Autowired
	private MarsService service;
	
	@POST
	@Path("/{movimento}")
	@Produces(MediaType.APPLICATION_JSON_VALUE)
    public Response movimento(@PathParam("movimento") String movimento) throws Exception {
        try {
        	if (movimento == null || movimento.trim().isEmpty()) {
        		throw new Exception("Movimento Inválido!");
        	}
        	
            return Response.ok().entity(new ResponseDTO(Status.OK.getStatusCode(), service.movimenta(movimento.toUpperCase()))).build();

        } catch (PosicaoInvalidaException pie) {
        	return badRequest("Posicao Inválida!");
        	
        } catch (MovimentacaoInvalidaException mie) {
        	return badRequest("Movimentação Inválida!");
        
        } catch (Exception e) {
			return badRequest(e.getMessage());
		}
    }

}

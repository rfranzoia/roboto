package br.com.fr.geekhunter.roboto;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.fr.geekhunter.roboto.exception.MovimentacaoInvalidaException;
import br.com.fr.geekhunter.roboto.exception.PosicaoInvalidaException;
import br.com.fr.geekhunter.roboto.service.MarsService;

public class MarsServiceTest {

	MarsService service = new MarsService();
	
	@Test
	public void testMovimenta() {
		try {
			assertEquals("(2,0,South)", service.movimenta("MMRMMRMM"));
			assertEquals("(0,2,West)", service.movimenta("MML"));
		} catch (PosicaoInvalidaException | MovimentacaoInvalidaException e) {
			
		}
	}
	
	@Test
	public void testMovimenta_PosicaoInvalida() {
		try {
			assertEquals("(4,0,North)", service.movimenta("MMMMMMMMMMMMMMMMMMMMMMMM"));
		} catch (MovimentacaoInvalidaException mie) {
			assertEquals(mie.getMessage(), "Movimentação Inválida");
		} catch (PosicaoInvalidaException pie) {
			assertEquals(pie.getMessage(), "Posição Inválida");
		}
	}
	
	@Test
	public void testMovimenta_MovimentacaoInvalida() {
		try {
			assertEquals("(2,0,North)", service.movimenta("AAA"));
		} catch (PosicaoInvalidaException pie) {
			assertEquals(pie.getMessage(), "Posição Inválida");
		} catch (MovimentacaoInvalidaException mie) {
			assertEquals(mie.getMessage(), "Movimentação Inválida");
		}
	}

}

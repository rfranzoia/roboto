package br.com.fr.geekhunter.roboto.service;

import org.springframework.stereotype.Service;

import br.com.fr.geekhunter.roboto.Lado;
import br.com.fr.geekhunter.roboto.exception.MovimentacaoInvalidaException;
import br.com.fr.geekhunter.roboto.exception.PosicaoInvalidaException;
import br.com.fr.geekhunter.roboto.model.Robo;
import br.com.fr.geekhunter.roboto.model.Terreno;

@Service
public class MarsService {

	public String movimenta(String movimentacao) throws PosicaoInvalidaException, MovimentacaoInvalidaException {
		
		Robo robo = new Robo();
		Terreno terreno = new Terreno(5, 5);
		
		for (int i = 0; i < movimentacao.length(); i++) {
			char c = movimentacao.charAt(i);
			
			switch (c) {
				case 'M':
					robo.move();
					break;
				case 'L':
					robo.rotaciona(Lado.Esquerda);
					break;
				case 'R':
					robo.rotaciona(Lado.Direita);
					break;
				default:
					throw new MovimentacaoInvalidaException();
			}
			
			if (robo.getX() < 0 || robo.getY() < 0) {
				throw new PosicaoInvalidaException();
				
			} else if (robo.getY() > (terreno.getAltura() - 1) || robo.getX() > (terreno.getLargura() - 1)) {
				throw new PosicaoInvalidaException();
				
			}
		}
		
		return robo.getPosicao();
	}
}

package br.com.fr.geekhunter.roboto.service;

import org.springframework.stereotype.Service;

import br.com.fr.geekhunter.roboto.Side;
import br.com.fr.geekhunter.roboto.exception.MovimentacaoInvalidaException;
import br.com.fr.geekhunter.roboto.exception.PosicaoInvalidaException;
import br.com.fr.geekhunter.roboto.model.Robot;
import br.com.fr.geekhunter.roboto.model.Terrain;

@Service
public class MarsService {

	public static final char LEFT = 'L';
	public static final char RIGHT = 'R';
	public static final char MOVE = 'M';
	
	public String movimenta(String movimentacao) throws PosicaoInvalidaException, MovimentacaoInvalidaException {
		
		Robot robot = new Robot();
		Terrain terreno = new Terrain(5, 5);
		
		for (int i = 0; i < movimentacao.length(); i++) {
			char c = movimentacao.charAt(i);
			
			switch (c) {
				case MOVE:
					robot.move();
					break;
					
				case LEFT:
					robot.rotate(Side.Left);
					break;
					
				case RIGHT:
					robot.rotate(Side.Right);
					break;
					
				default:
					throw new MovimentacaoInvalidaException("Movimentação Inválida");
			}
			
			if (robot.getX() < 0 || robot.getY() < 0) {
				throw new PosicaoInvalidaException("Posição Inválida");
				
			} else if (robot.getY() > (terreno.getHeight() - 1) || robot.getX() > (terreno.getWidth() - 1)) {
				throw new PosicaoInvalidaException("Posição Inválida");
				
			}
		}
		
		return robot.getPosicao();
	}
}

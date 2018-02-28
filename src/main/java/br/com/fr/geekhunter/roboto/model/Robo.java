package br.com.fr.geekhunter.roboto.model;

import br.com.fr.geekhunter.roboto.Lado;
import br.com.fr.geekhunter.roboto.Orientacao;

/**
 * @author Romeu Franzoia Jr
 *
 */
public class Robo {

	private int x, y;
	private Orientacao orientacao;

	public Robo() {
		x = 0;
		y = 0;
		orientacao = Orientacao.North;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public Orientacao getOrientacao() {
		return orientacao;
	}

	// imprime a posicao atual do robo
	public String getPosicao() {
		return "(" + x + "," + y + "," + orientacao + ")";
	}

	// muda a orientacao do robo, sem alterar sua posicao x,y
	public void rotaciona(Lado lado) {

		switch (orientacao) {
			case North:
				if (lado == Lado.Direita) {
					orientacao = Orientacao.East;
				} else if (lado == Lado.Esquerda) {
					orientacao = Orientacao.West;
				}
				break;
			case South:
				if (lado == Lado.Direita) {
					orientacao = Orientacao.West;
				} else if (lado == Lado.Esquerda) {
					orientacao = Orientacao.East;
				}
				break;
			case West:
				if (lado == Lado.Direita) {
					orientacao = Orientacao.North;
				} else if (lado == Lado.Esquerda) {
					orientacao = Orientacao.South;
				}
				break;
			case East:
				if (lado == Lado.Direita) {
					orientacao = Orientacao.South;
				} else if (lado == Lado.Esquerda) {
					orientacao = Orientacao.North;
				}
				break;
		}
	}

	// move o robo de acordo com sua orientacao atual
	// não valida se x ou y tem valores < 0 (zero)
	public void move() {

		switch (orientacao) {
		case North:
			y++;
			break;
		case South:
			y--;
			break;
		case West:
			x--;
			break;
		case East:
			x++;
			break;
		}

	}

}

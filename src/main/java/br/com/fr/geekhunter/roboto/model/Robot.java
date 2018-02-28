package br.com.fr.geekhunter.roboto.model;

import br.com.fr.geekhunter.roboto.Side;
import br.com.fr.geekhunter.roboto.Orientation;

/**
 * @author Romeu Franzoia Jr
 *
 */
public class Robot {

	private int x, y;
	private Orientation orientation;

	public Robot() {
		x = 0;
		y = 0;
		orientation = Orientation.North;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public Orientation getOrientation() {
		return orientation;
	}

	// imprime a posicao atual do robo
	public String getPosicao() {
		return "(" + x + "," + y + "," + orientation + ")";
	}

	// muda a orientacao do robo, sem alterar sua posicao x,y
	public void rotate(Side side) {

		switch (orientation) {
			case North:
				if (side == Side.Right) {
					orientation = Orientation.East;
				} else if (side == Side.Left) {
					orientation = Orientation.West;
				}
				break;
			case South:
				if (side == Side.Right) {
					orientation = Orientation.West;
				} else if (side == Side.Left) {
					orientation = Orientation.East;
				}
				break;
			case West:
				if (side == Side.Right) {
					orientation = Orientation.North;
				} else if (side == Side.Left) {
					orientation = Orientation.South;
				}
				break;
			case East:
				if (side == Side.Right) {
					orientation = Orientation.South;
				} else if (side == Side.Left) {
					orientation = Orientation.North;
				}
				break;
		}
	}

	// move o robo de acordo com sua orientacao atual
	// não valida se x ou y tem valores < 0 (zero)
	public void move() {

		switch (orientation) {
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

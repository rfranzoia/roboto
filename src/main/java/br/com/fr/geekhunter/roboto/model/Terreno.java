package br.com.fr.geekhunter.roboto.model;

/**
 * @author Romeu Franzoia Jr
 *
 */
public class Terreno {
	
	private int largura, altura;

	public Terreno(int largura, int altura) {
		this.largura = largura;
		this.altura = altura;
	}

	public int getLargura() {
		return this.largura;
	}

	public int getAltura() {
		return this.altura;
	}
	
}
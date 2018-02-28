package br.com.fr.geekhunter.roboto.model;

/**
 * @author Romeu Franzoia Jr
 *
 */
public class Terrain {
	
	private int width, height;

	public Terrain(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public int getWidth() {
		return this.width;
	}

	public int getHeight() {
		return this.height;
	}
	
}
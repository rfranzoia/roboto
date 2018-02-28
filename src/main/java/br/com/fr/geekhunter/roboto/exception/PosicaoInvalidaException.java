package br.com.fr.geekhunter.roboto.exception;

/**
 * @author Romeu Franzoia Jr
 *
 */
public class PosicaoInvalidaException extends Exception {

	private static final long serialVersionUID = 1L;

	public PosicaoInvalidaException() {
		super();
	}

	public PosicaoInvalidaException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public PosicaoInvalidaException(String message, Throwable cause) {
		super(message, cause);
	}

	public PosicaoInvalidaException(String message) {
		super(message);
	}

	public PosicaoInvalidaException(Throwable cause) {
		super(cause);
	}

}

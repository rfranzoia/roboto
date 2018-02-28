package br.com.fr.geekhunter.roboto.exception;

/**
 * @author Romeu Franzoia Jr
 *
 */
public class MovimentacaoInvalidaException extends Exception {

	private static final long serialVersionUID = 1L;

	public MovimentacaoInvalidaException() {
		super();
	}

	public MovimentacaoInvalidaException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public MovimentacaoInvalidaException(String message, Throwable cause) {
		super(message, cause);
	}

	public MovimentacaoInvalidaException(String message) {
		super(message);
	}

	public MovimentacaoInvalidaException(Throwable cause) {
		super(cause);
	}

}

package jcolonia.daw2020.quinielabd;

public class TextoBloqueadoException extends Exception {
	private static final long serialVersionUID = -3619026137551963218L;

	public TextoBloqueadoException() {
	}

	public TextoBloqueadoException(String message) {
		super(message);
	}

	public TextoBloqueadoException(Throwable cause) {
		super(cause);
	}

	public TextoBloqueadoException(String message, Throwable cause) {
		super(message, cause);
	}

	public TextoBloqueadoException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}

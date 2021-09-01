package jcolonia.daw2020.quinielabd;

public class ClaveMalaException extends Exception {
	private static final long serialVersionUID = -7396444559247786149L;

	public ClaveMalaException() {
	}

	public ClaveMalaException(String message) {
		super(message);
	}

	public ClaveMalaException(Throwable cause) {
		super(cause);
	}

	public ClaveMalaException(String message, Throwable cause) {
		super(message, cause);
	}

	public ClaveMalaException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}

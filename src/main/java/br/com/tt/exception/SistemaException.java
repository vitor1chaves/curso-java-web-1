package br.com.tt.exception;


public class SistemaException extends Exception{


	private static final long serialVersionUID = 1L;

	/**
	 * @param message
	 * @param cause
	 */
	public SistemaException(String message, Throwable cause) {
		super(message, cause);
		System.err.println(message+" - Erro: "+cause.getMessage());
	}

	/**
	 * @param message
	 */
	public SistemaException(String message) {
		super(message);
		System.err.println(" - Erro: "+message);
	}
	
	
	
	

}

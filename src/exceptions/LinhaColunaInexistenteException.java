package exceptions;

public class LinhaColunaInexistenteException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public LinhaColunaInexistenteException() {
		super("Os parametros informados são invalidos para esta matriz.");
	}
}

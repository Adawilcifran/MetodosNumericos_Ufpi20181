package exceptions;

public class LinhaColunaInexistenteException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public LinhaColunaInexistenteException() {
		super("Os parametros informados s�o invalidos para esta matriz.");
	}
}

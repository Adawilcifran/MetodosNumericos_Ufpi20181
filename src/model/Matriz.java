package model;

import exceptions.LinhaColunaInexistenteException;

public class Matriz {
	private double[][] matriz;
	private double[] termosIndependentes;
	private int ordem;

	public Matriz(double[][] _matriz, double[] _termosIndependentes, int _ordem) {
		matriz = _matriz;
		termosIndependentes = _termosIndependentes;
		ordem = _ordem;
	}

	public double[] getTermosIndependentes() {
		return termosIndependentes;
	}

	public double[][] getMatriz() {
		return matriz;
	}

	public void setMatriz(double[][] matriz) {
		this.matriz = matriz;
	}

	public int getOrdem() {
		return ordem;
	}

	public void setOrdem(int ordem) {
		this.ordem = ordem;
	}

	public double getElemento(int linha, int coluna) throws LinhaColunaInexistenteException {
		if (linha > ordem || coluna > ordem || linha < 0 || coluna < 0)
			throw new LinhaColunaInexistenteException();
		return matriz[linha][coluna];
	}

}

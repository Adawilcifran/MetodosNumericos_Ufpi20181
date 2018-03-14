package control;

import model.Matriz;

public class ControladorMatriz {

	private static Matriz matriz;

	public static void cadastrar(double[][] _matriz2, double[] termosIndependentes, int ordem) {
		matriz = new Matriz(_matriz2,termosIndependentes,ordem);
	}

	public static Matriz getMatriz() {
		return matriz;
	}

	

}

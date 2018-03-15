package view;

import java.util.Scanner;

import model.Matriz;
import control.ControladorMatriz;

public class SistemaInterno {

	private static double[][] matriz;
	private static double[] termosIndependentes;
	static Scanner in = new Scanner(System.in);

	public static boolean init() {
		int ordem = 0;
		do {
			System.out
					.print("Digite a ordem desejada para a matriz a ser inserida [0 para sair]: ");
			ordem = in.nextInt();
			if (ordem != 0) {
				cadastraMatriz(ordem);
				cadastraTermosIndependentes(ordem);
				ControladorMatriz.cadastrar(matriz, termosIndependentes, ordem);
				System.out.println("Cadastro Realizado com sucesso.");
				imprimirMatriz();
			}
		} while (ordem != 0);
		return true;
	}

	private static void imprimirMatriz() {
		System.out.println("\n\n\n------------ EXIBINDO MATRIZ ------------ ");
		Matriz matriz = ControladorMatriz.getMatriz();
		double[][] matrizRepo = matriz.getMatriz();
		double[] vetorDosTermosRepo = matriz.getTermosIndependentes();
		int ordemRepo = matriz.getOrdem();

		for (int i = 0; i < ordemRepo; i++) {
			System.out.print("|\t");
			for (int j = 0; j < ordemRepo; j++) {
				System.out.print(matrizRepo[i][j] + "\t");
			}
			System.out.println(":\t" + vetorDosTermosRepo[i] + "\t|");
		}
		System.out.println("----------------------------------------- \n\n\n");


	}

	private static void cadastraTermosIndependentes(int ordem) {
		termosIndependentes = new double[ordem];
		System.out
				.println("\t\t --------- CADASTRO DO VETOR DE TERMOS INDEPENDENTES ---------");
		for (int i = 0; i < ordem; i++) {
			System.out.printf("Digite o valor do elemento B[%d] do vetor: ",
					(i + 1));
			termosIndependentes[i] = in.nextDouble();
		}
		System.out.println("Fim do cadastro do vetor de termos independentes.");

	}

	private static void cadastraMatriz(int ordem) {
		System.out
				.println("\t\t --------- CADASTRO DA MATRIZ DOS COEFICIENTES ---------");
		matriz = new double[ordem][ordem];
		for (int i = 0; i < ordem; i++) {
			for (int j = 0; j < ordem; j++) {
				System.out.printf(
						"Digite o valor do elemento X[%d][%d] da matriz: ",
						(i + 1), (j + 1));
				matriz[i][j] = in.nextDouble();
			}
		}
		System.out.println("Fim do cadastro da Matriz de ordem " + ordem + ".");
	}

}

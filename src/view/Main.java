package view;

public class Main {

	public static void main(String[] args) {

		boolean flag = false;

		System.out.println("Bem Vindo ao Sistema.\n\n");
		
		do {
			flag = SistemaInterno.init();
		} while (flag == false);
		
		System.out.println("Obrigado por utilizar nosso sistema.");
	}

}

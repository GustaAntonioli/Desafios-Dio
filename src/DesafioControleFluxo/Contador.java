package DesafioControleFluxo;

import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		
		try {
			// Primeiro parâmetro
			System.out.println("Informe o primeiro parâmetro: ");
			int parametroUm = Integer.parseInt(terminal.nextLine());
			
			// Segundo parâmetro
			System.out.println("Informe o segundo parâmetro: ");
			int parametroDois = Integer.parseInt(terminal.nextLine());
			
			// Validação
			if (parametroDois <= parametroUm){
				throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior ou igual ao primeiro");
			}
			
			// Imprimindo os números
			for (int i = parametroUm; i <= parametroDois; i++) {
				System.out.println("Imprimindo o número " + i);
			}
		
		}catch (ParametrosInvalidosException exception) {
			//imprimir a mensagem: O segundo parâmetro deve ser maior ou igual ao primeiro
            System.out.println(exception.getMessage());
        }
		// fechando o scanner
		//terminal.close();
	}
}

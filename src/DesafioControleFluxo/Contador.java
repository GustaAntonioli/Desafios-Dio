package DesafioControleFluxo;

import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
			// Primeiro parâmetro
			System.out.println("Informe o primeiro número: ");
			int parametroUm = Integer.parseInt(terminal.nextLine());
			// Segundo parâmetro
			System.out.println("Informe o segundo número: ");
			int parametroDois = Integer.parseInt(terminal.nextLine());
			
			// Fecha terminal
			terminal.close();
		try {
			if (parametroDois <= parametroUm){
				throw new ParametrosInvalidosException("O segundo número deve ser maior ou igual ao primeiro.");
			
			} else 
			for (int i = parametroUm; i <= parametroDois; i--) {
				if (i == parametroUm || i == parametroDois) {
					System.out.println("--Fim--");
					}
				}
			}
		
		catch (ParametrosInvalidosException exception) {
			//imprimir a mensagem: O segundo parâmetro deve ser maior ou igual ao primeiro
            System.out.println(exception.getMessage());
        }
	}
}



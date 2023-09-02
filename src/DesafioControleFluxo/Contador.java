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
		try { // Validação de ParametrosInvalidosException
			if (parametroDois <= parametroUm){
				throw new ParametrosInvalidosException("O segundo número deve ser maior ou igual ao primeiro.");
			
			} else // Condicional com else if e o for para contar (parâmetros booleanos = true), se tudo for true imprime mensagem. 
			for (int i = parametroUm; i <= parametroDois;) {
				if (i == parametroUm || i == parametroDois) {
					System.out.println("--Fim--");
					}
					break;
				}
			}
		
		catch (ParametrosInvalidosException exception) {
			//imprimir a mensagem: O segundo parâmetro deve ser maior ou igual ao primeiro
            System.out.println(exception.getMessage());
        }
	}
}



package DesafioControleFluxo;

import java.util.Scanner;

public class Contador2 {

	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		terminal.close();	

        try {
			//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
			if (parametroDois <= parametroUm){
				throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
			}
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException exception) {
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
			System.out.println(exception.getMessage());
		}
		
	}

	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		
		int contagem = parametroDois - parametroUm;
		
		for (int i = 0; i < contagem; i++) {
			if (i == parametroUm || i == parametroDois) {
				    System.out.print("A diferença entre os parâmetros é: ");
					System.out.println(parametroDois - parametroUm);
					System.out.println("--Fim--");
                    //System.out.println(i + 1);
			}
		}
	}
}

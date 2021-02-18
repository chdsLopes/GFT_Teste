package exercicio1;

import java.util.Scanner;



public class ComparaNumero {

	public static void main(String[] args) {

		/*
		 * Crie um programa que leia três números e imprima na tela: • Qual o maior
		 * número • Qual o menor número Se os três números forem iguais, informe ao
		 * usuário que os 3 são iguais.
		 */

		Scanner leitor = new Scanner(System.in);

		int valor[] = new int[3];
		int maior = 0, menor = 999999;


		for (int i = 0; i < valor.length; i++) {
			System.out.print("Digite o " + (i + 1) + "º número: ");
			valor[i] = leitor.nextInt();
			if (valor[i] > maior) {
				maior = valor[i];
			}
		}
		for (int j = 0; j < valor.length; j++) {
			if (valor[j] < menor) {
				menor = valor[j];
			}
		}
		
		if(valor[0]== valor[1] && valor[0]==valor[2]) {
			System.out.println("Os valores são iguais");
		}else {
			System.out.println("Maior valor = " + maior);
			System.out.println("Menor valor = " + menor);
		}
		

	}

}

package exercicio1;

import java.util.Scanner;



public class ComparaNumero {

	public static void main(String[] args) {

		/*
		 * Crie um programa que leia tr�s n�meros e imprima na tela: � Qual o maior
		 * n�mero � Qual o menor n�mero Se os tr�s n�meros forem iguais, informe ao
		 * usu�rio que os 3 s�o iguais.
		 */

		Scanner leitor = new Scanner(System.in);

		int valor[] = new int[3];
		int maior = 0, menor = 999999;


		for (int i = 0; i < valor.length; i++) {
			System.out.print("Digite o " + (i + 1) + "� n�mero: ");
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
			System.out.println("Os valores s�o iguais");
		}else {
			System.out.println("Maior valor = " + maior);
			System.out.println("Menor valor = " + menor);
		}
		

	}

}

package exercicio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Insira o valor para X: ");
		double x = leitor.nextDouble();
		
		System.out.println("Insira o valor para Y: ");
		double y = leitor.nextDouble();
		
		Operacao operacao = new Operacao(x, y);
		
		Soma soma = new Soma(x, y);
		Multiplicacao multiplicacao = new Multiplicacao(x, y);
		Divisao divisao = new Divisao(x, y);
		Subtracao subtracacao = new Subtracao(x, y);
		
		System.out.println("Resultado Soma: "+soma);
		System.out.println("Resultado multiplicação: "+multiplicacao);
		System.out.println("Resultado divisão: "+divisao);
		System.out.println("Resultado Subtração: "+subtracacao);
		
		
		
		

	}

}

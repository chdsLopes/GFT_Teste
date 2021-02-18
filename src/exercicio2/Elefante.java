package exercicio2;

import java.util.Scanner;

public class Elefante {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		String incomoda = "";
		
		System.out.println("Insira o valor desejado: ");
		int vezes = leitor.nextInt();
		
		while(vezes > 0) {
			
			incomoda += " "+"incomoda";	
			vezes--;
		}
		
		System.out.println(incomoda+" muito mais");
		
	}
	

}

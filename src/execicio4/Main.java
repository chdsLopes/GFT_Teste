package execicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Carga carga = new Carga();
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe o valor da carga: ");
		carga.setValor(leitor.nextDouble());
		
		System.out.println("Informe o o peso da carga: ");
		carga.setPeso(leitor.nextDouble());
		
		
		
		
		
		

	}

}

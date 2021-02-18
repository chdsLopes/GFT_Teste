package exercicio3;

public class Divisao extends Operacao{
	
	public Divisao(double x, double y) {
		super(x, y);
	}


	@Override
	public double efetuarOperacao(double x, double y) {
		if(y==0) {
			System.out.println("Impossivel calcular");
			return 0;
		}else {
			return this.getX() / this.getY();
		}
	}

}

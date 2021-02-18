package exercicio3;

public class Divisao extends Operacao{
	
	public Divisao(double x, double y) {
		super(x, y);
	}


	@Override
	public double efetuarOperacao(double x, double y) {
		if(y==0) {
			return System.out.println("Impossivel calcular");
		}else {
			return this.getX() - this.getY();
		}
	}

}

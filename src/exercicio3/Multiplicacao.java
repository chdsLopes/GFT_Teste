package exercicio3;

public class Multiplicacao extends Operacao{
	
	public Multiplicacao(double x, double y) {
		super(x, y);
	}


	@Override
	public double efetuarOperacao(double x, double y) {
		
		return this.getX() * this.getY();
	}

}

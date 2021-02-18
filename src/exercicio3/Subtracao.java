package exercicio3;

public class Subtracao extends Operacao {
	
	
	public Subtracao(double x, double y) {
		super(x, y);
	}


	@Override
	public double efetuarOperacao(double x, double y) {
		
		return this.getX() - this.getY();
	}

}

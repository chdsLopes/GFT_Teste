package exercicio3;

public class Soma extends Operacao{

	public Soma(double x, double y) {
		super(x, y);
	}

	@Override
	public double efetuarOperacao(double x, double y) {
		
		return this.getX()+this.getY();
	}
	
}

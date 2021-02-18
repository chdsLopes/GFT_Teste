package exercicio3;

public abstract class Operacao {
	
	private double x;
	private double y;
	
	
	
	public Operacao(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}



	public double getY() {
		return y;
	}



	public void setY(double y) {
		this.y = y;
	}



	public abstract double efetuarOperacao(double x, double y);

}

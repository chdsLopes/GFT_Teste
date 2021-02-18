package execicio4;

public abstract class Transporte extends Carga {
	
	private double carga;
	
	
	
	public Transporte(double peso, double valor, double carga) {
		super(peso, valor);
		this.carga = carga;
	}



	public abstract double calculaFrete(double peso, double valor);

}

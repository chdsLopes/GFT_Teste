package execicio4;

public class Vagao extends Transporte {


	public Vagao(double peso, double valor, double carga) {
		super(peso, valor, carga);

	}
	
}
	


	@Override
	public double calculaFrete(double peso, double valor) {
		double frete = 0;

		if (this.getPeso() > 15.000) {
			frete = this.getPeso() * 0.12 + this.getValor() * 0.1 + 5.000;
			return frete;
		} else {

		}
		return frete;
	}
}

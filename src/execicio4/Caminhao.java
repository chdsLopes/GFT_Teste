package execicio4;

public class Caminhao extends Transporte {

	public Caminhao(double peso, double valor, double carga) {
		super(peso, valor, carga);
	}



	@Override
	public double calculaFrete(double peso, double valor) {
		double frete = 0;

		if (this.getValor() > 40.000) {
			frete = (this.getPeso() * 0.12 + this.getValor() * 0.3);
			frete = frete - (frete*0.25);
			return frete;
			
		} else {
			frete = (this.getPeso() * 0.12 + this.getValor() * 0.3);
			return frete;
		}
		
	}
	

}

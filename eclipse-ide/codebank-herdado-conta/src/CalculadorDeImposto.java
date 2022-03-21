
public class CalculadorDeImposto {

	private double totalDoImposto;	
	
	void registra(Tributavel tributavel) {
	
		double valor = tributavel.getValorImposto();
		
		this.totalDoImposto += valor;
		
	}
	
	public double getTotalDoImposto() {
	
		return totalDoImposto;
	}

}

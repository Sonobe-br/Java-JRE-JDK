
public class TesteTributaveis {
	
	public static void main(String[] args) {
		
		ContaCorrente contacorrente = new ContaCorrente(273, 1099);
		contacorrente.depositar(100.0);
		
		SeguroDeVida segurodevida = new SeguroDeVida();
		
		CalculadorDeImposto calculadordeimposto = new CalculadorDeImposto();
		calculadordeimposto.registra(contacorrente);
		calculadordeimposto.registra(segurodevida);
		
		System.out.println(calculadordeimposto.getTotalDoImposto());
		
	}

}

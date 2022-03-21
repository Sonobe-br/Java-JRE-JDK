
public class ContaCorrente extends Conta implements Tributavel {

	public ContaCorrente(int agencia, int numero)  {
		
		super(agencia, numero);
		
	}
	
	@Override
	public void sacar(double valor) throws SaldoInsuficienteException {
	
		double valorDoSaque = valor + 0.2;
		
		super.sacar(valorDoSaque);
	
	}

	@Override
	public void depositar(double valor) {
		
		super.saldo += valor;
	
	}

	@Override
	public double getValorImposto() {
		
		return super.saldo * 0.01;
	}
	
}
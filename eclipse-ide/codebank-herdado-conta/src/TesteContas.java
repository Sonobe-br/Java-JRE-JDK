
public class TesteContas {
	
	public static void main(String[] args) throws SaldoInsuficienteException {
				
		ContaCorrente contacorrente = new ContaCorrente(273, 1099);
		contacorrente.depositar(150.0);
		contacorrente.setTitular("Daniel Sonobe Silveira");
		
		//System.out.println("Saldo Conta Corrente: " + contacorrente.getSaldo());
		
		ContaPoupanca contapoupanca = new ContaPoupanca(341, 1077);
		contapoupanca.depositar(150.0);
		contapoupanca.setTitular("Pedro Fratelli");
	
		contacorrente.transfere(10.0, contapoupanca);
		
		System.out.println("Transferido para o titular: " + contapoupanca.getTitular());
		System.out.println("Saldo Conta Poupança: " + contapoupanca.getSaldo());
		System.out.println("Sacado do titular: " + contacorrente.getTitular());
		System.out.println("Saldo Conta Corrente: " + contacorrente.getSaldo());
		
	}

}
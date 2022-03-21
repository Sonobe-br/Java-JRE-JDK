
public class TesteParaSacar {
	
	public static void main (String[] args) {
		
		Conta conta = new ContaCorrente (123, 321);
		
		conta.depositar(200.00);
		
		try {
			
			conta.sacar(650.00);
			
		} catch (SaldoInsuficienteException ex) {
			
			System.out.println("Ex: " + ex.getMessage());			
			
		}
		
		System.out.println(conta.getSaldo());
		
	}

}

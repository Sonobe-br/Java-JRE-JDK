
public abstract class Conta {
	
	protected double saldo;
	private int agencia;
	private int numero;
	private String titular;
	private static int total;
	
	// Constructor >>
	public Conta(int agencia, int numero) {
		
		Conta.total++;
		//System.out.println("O total de contas é " + Conta.total);
		
		this.agencia = agencia;
		this.numero = numero;
		//System.out.println("Estou criando uma conta " + this.numero);
		
	}
	
	public abstract void depositar(double valor);
	
	public void sacar(double valor) throws SaldoInsuficienteException {
		
		if(this.saldo < valor) {
			
			throw new SaldoInsuficienteException("Saldo: " + this.saldo + " , Valor: " + valor);
			
			
		} 
		
		this.saldo -= valor;

	}
	
	public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {
				
			this.sacar(valor); 
						
			destino.depositar(valor);
			
		} 
	
	public double getSaldo() {
		
		return this.saldo;
	
	}
	
	public int getNumero() {
		
		return this.numero;
		
	}
	
	public void setNumero(int numero) {
		
		if(numero < 0) {
			
			System.out.println("Atenção: não é permitido números negativos");
			
		} 
		
		this.numero = numero; 
				
	}
	
	public int getAgencia() {
		
		return this.agencia;
		
	}
	
	public void setAgencia(int agencia) {
		
		if(agencia < 0) {
			
			System.out.println("Atenção: não é permitido números negativos");
	
		} else {
			
			return;	
		
		}
			
		this.agencia = agencia;
	
	}
		
	public void setTitular(String Titular) {
		
		this.titular =  Titular; 
	}
	
	public String getTitular() {
	
		return titular;
	
	}
	
	public static int getTotal() {
		
		return Conta.total;
		
	}
	
}

class Conta {
	
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;
	
	// Constructor >>
	public Conta(int agencia, int numero) {
		
		Conta.total++;
		//System.out.println("O total de contas é " + Conta.total);
		
		this.agencia = agencia;
		this.numero = numero;
		
		//System.out.println("Estou criando uma conta " + this.numero);
		
	}
	
	public void depositar(double valor) {
		
		this.saldo += valor;
				
	}
	
	public boolean sacar(double valor) {
		
		if(this.saldo >= valor) {
			
			this.saldo -= valor;
			return true;
			
		} else {
			
			return false;
			
		}
		
	}
	
	public boolean transfere(double valor, Conta destino) {
		
		if(this.saldo >= valor) {
			
			this.saldo -= valor;
			destino.depositar(valor);
			
			return true;
			
		} else {
			
			return false;
		}
		
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
		
	public void setTitular(Cliente titular) {
		
		this.titular =  titular; 
	}
	
	public Cliente getTitular() {
	
		return titular;
	
	}
	
	public static int getTotal() {
		
		return Conta.total;
		
	}
	
}
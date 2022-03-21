
//o gerente � um Funcionario do banco e herda os atributos da classe Funcionario. Assina o contrato 
//de Autentica��o.

public class Gerente extends Funcionario implements Autenticavel { 
	
	private CacheUtil autenticador;
	
	public Gerente() {
		
		this.autenticador = new CacheUtil();
		
	}
		
	public double getBonificacao() {	
		System.out.println("Chamando o m�todo de bonifica��o do Gerente");
		return super.getSalario(); 	
	
	}
	
	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha); 
		
	}

	@Override
	public boolean autentica(int senha) {
		 boolean autentica = this.autenticador.autentica(senha);
		 return autentica;
		
	}
		
}

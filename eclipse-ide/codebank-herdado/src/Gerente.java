
//o gerente é um Funcionario do banco e herda os atributos da classe Funcionario. Assina o contrato 
//de Autenticação.

public class Gerente extends Funcionario implements Autenticavel { 
	
	private CacheUtil autenticador;
	
	public Gerente() {
		
		this.autenticador = new CacheUtil();
		
	}
		
	public double getBonificacao() {	
		System.out.println("Chamando o método de bonificação do Gerente");
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

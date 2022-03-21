
public class Administrador extends Funcionario implements Autenticavel {
	
	private CacheUtil autenticador;
		
	public Administrador() {
	
		this.autenticador = new CacheUtil();
		
	}

	@Override
	public double getBonificacao() {
		return 50;
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

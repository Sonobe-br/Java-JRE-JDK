
public class Cliente implements Autenticavel {

	private CacheUtil autenticador;
	
	public Cliente() {
		
		this.autenticador = new CacheUtil();
		
	}
	
	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
		
	}

	@Override
	public boolean autentica(int senha) {
		boolean autenticou = this.autenticador.autentica(senha);
		return autenticou;
	}
	
}

//Defini um contrato que se chama autentica��o e quem assinar por esse contrato, precisar� implementar:
// m�todos setSenha e autentica

public abstract interface Autenticavel {
		
	public abstract void setSenha(int senha);
	
	public abstract boolean autentica(int senha);
	
}
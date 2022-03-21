
public class SistemaInterno {

	private int senha = 3333;

	public void autentica(Autenticavel funcionario_autenticavel) {
			
		boolean autenticou = funcionario_autenticavel.autentica(this.senha);
		
		if(autenticou) {
			System.out.println("Acesso liberado");
			
		} else {
			
			System.out.println("Acesso negado");
			
		}
		
	}
		
}

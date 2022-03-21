
public class TesteSistemaInterno {
	
	public static void main(String[] args) {
		
		Gerente gerente = new Gerente();
		gerente.setSenha(2222);
		
		Administrador admnistrator = new Administrador();
		admnistrator.setSenha(3333);
		
		Cliente client = new Cliente();
		client.setSenha(3333);
						
		SistemaInterno sysInter = new SistemaInterno();
		sysInter.autentica(gerente);
		sysInter.autentica(admnistrator);
		sysInter.autentica(client);
		
	}

}

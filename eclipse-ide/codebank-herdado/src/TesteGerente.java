
public class TesteGerente {
	
	public static void main(String[] args) { 
			
		Gerente gerente = new Gerente();
		gerente.setNome("Daniel");
		gerente.setCpf("222.222.222-22");
		gerente.setSalario(6000.00);
				
		System.out.println(gerente.getNome());
		System.out.println(gerente.getCpf());
		System.out.println(gerente.getSalario());
		
		gerente.setSenha(3333);
		boolean autenticou = gerente.autentica(3333);
		
		System.out.println(autenticou);
		System.out.println(gerente.getBonificacao());
	}
	
}
	
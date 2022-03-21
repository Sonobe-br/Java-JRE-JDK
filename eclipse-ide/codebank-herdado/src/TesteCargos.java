
public class TesteCargos {
	
	public static void main(String[] args) {
		
		TesteFuncionarios funcionarioComum = new TesteFuncionarios();
		funcionarioComum.setSalario(3000.0);
		
		System.out.println(funcionarioComum.getTipo());
		System.out.println(funcionarioComum.getSalario() + funcionarioComum.getBonificacao());
		//System.out.println(funcionarioComum.getBonificacao());
		
		TesteFuncionarios gerente = new TesteFuncionarios();
		gerente.setSalario(5500.0);
		
		System.out.println(gerente.getTipo());
		System.out.println(gerente.getSalario() + gerente.getBonificacao());
		//System.out.println(gerente.getBonificacao());
		
		TesteFuncionarios diretor = new TesteFuncionarios();
		diretor.setSalario(7300.0);
		
		System.out.println(diretor.getTipo());
		System.out.println(diretor.getSalario() + diretor.getBonificacao());
		//System.out.println(diretor.getBonificacao());
		
	}

}

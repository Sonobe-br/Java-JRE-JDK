
public class TestaBanco {
	
	public static void main(String[] args) {
		
		Cliente Daniel = new Cliente();
		
		Daniel.nome = "Daniel Sonobe Silveira"; 
		Daniel.cpf = "333.333.333-33";
		Daniel.profissao = "Programador";
		
		Conta contaDoDaniel = new Conta();
		contaDoDaniel.depositar(100);
		
		//associa o cliente Daniel a conta contaDoDaniel, no caso, à referência.
		contaDoDaniel.titular = Daniel;
		System.out.println(contaDoDaniel.titular.nome);
		System.out.println(contaDoDaniel.titular);
		System.out.println(Daniel); 
		
	}

}


public class TesteConexao {
	
	public static void main (String[] args ) {
		
		Conexao conexao = null;
		
		try {
			
			conexao = new Conexao ();
			conexao.leDados ();
			
		} catch (IllegalStateException ex) {
			
			System.out.println("Deu erro na conex?o");

		} finally {
			
			System.out.println("finally");
			
			if(conexao != null) {
				
				conexao.fecha(); 
				
			}
			
		}
		
	}

}

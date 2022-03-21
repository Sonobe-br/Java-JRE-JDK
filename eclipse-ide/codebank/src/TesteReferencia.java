
public class TesteReferencia {
	
	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta();
		
		primeiraConta.saldo = 300;
		
		System.out.println("saldo da primeira conta: " + primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;
		
	    System.out.println("saldo da segunda conta: " + segundaConta.saldo);
	    
	    segundaConta.saldo += 100;
	    System.out.println("saldo da segunda conta: " + segundaConta.saldo);
	    
	    System.out.println("A referencia de saldo da primeira conta também é " + primeiraConta.saldo);
	    
	    if(primeiraConta == segundaConta) {
	    	
	    	System.out.println("As duas variáveis referencia, "
	    			+ "apontam o resultado para a mesma e única conta.");
	    	
	    } else { 
	    	System.out.println("são contas diferentes");
	    	
	    }
	    System.out.println(primeiraConta);
	    System.out.println(segundaConta);
	}

}

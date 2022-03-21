
public class TesteReferencia {
	
	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta();
		
		primeiraConta.saldo = 300;
		
		System.out.println("saldo da primeira conta: " + primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;
		
	    System.out.println("saldo da segunda conta: " + segundaConta.saldo);
	    
	    segundaConta.saldo += 100;
	    System.out.println("saldo da segunda conta: " + segundaConta.saldo);
	    
	    System.out.println("A referencia de saldo da primeira conta tamb�m � " + primeiraConta.saldo);
	    
	    if(primeiraConta == segundaConta) {
	    	
	    	System.out.println("As duas vari�veis referencia, "
	    			+ "apontam o resultado para a mesma e �nica conta.");
	    	
	    } else { 
	    	System.out.println("s�o contas diferentes");
	    	
	    }
	    System.out.println(primeiraConta);
	    System.out.println(segundaConta);
	}

}

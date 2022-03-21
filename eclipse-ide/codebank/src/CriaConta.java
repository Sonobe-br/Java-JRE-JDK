
public class CriaConta {
	
	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		
		System.out.println(primeiraConta.saldo);
		
		primeiraConta.saldo += 100;
		
		System.out.println(primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 300;
		
		System.out.println("A primeira conta tem saldo de R$ " + primeiraConta.saldo);
		System.out.println("A segunda conta tem saldo de R$ " + segundaConta.saldo);
		
		primeiraConta.agencia = 146;
		System.out.println(primeiraConta.agencia);
		System.out.println(primeiraConta.numero);
		
		segundaConta.agencia = 146;
		System.out.println("A segunda conta esta "
				+ "na agencia " + segundaConta.agencia);
		System.out.println(segundaConta.numero);
		
		if(primeiraConta == segundaConta) {
			
			System.out.println("mesma conta");
		
		} else {
			System.out.println("contas diferentes");
			
		}
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}

}

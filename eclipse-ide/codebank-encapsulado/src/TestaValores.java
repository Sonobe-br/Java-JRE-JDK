
public class TestaValores {
	
	public static void main(String[] args) {
			
		Conta conta = new Conta(422, 3001);
		
		System.out.println(conta.getAgencia());
		
		Conta conta2 = new Conta(322, 2001);
		Conta conta3 = new Conta(211, 1001);
		Conta conta4 = new Conta(111, 0001);
		
		System.out.println(conta2.getAgencia());
		System.out.println(conta3.getAgencia());
		System.out.println(conta4.getAgencia());
		
		System.out.println("O total de contas dentro da classe Conta é " + Conta.getTotal());
	}

}

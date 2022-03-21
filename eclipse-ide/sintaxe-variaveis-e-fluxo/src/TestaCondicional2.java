public class TestaCondicional2 {
	
	public static void main(String[] args) {

		System.out.println("Testing the Conditionals");

		int age = 20;
		int amountPeople = 3;
		boolean accompanied = amountPeople >= 2;
		
		System.out.println("accompanied value = " + accompanied);
		
		if (age >= 18 && accompanied) {

			System.out.println("*** Welcome ***");

		} else {		
			System.out.println("unfortunately you cannot enter");				
				
		}	
	}
}



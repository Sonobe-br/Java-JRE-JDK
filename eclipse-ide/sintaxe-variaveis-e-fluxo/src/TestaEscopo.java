
public class TestaEscopo {
	
	public static void main(String[] args) {

		System.out.println("Testing the Conditionals");

		int age = 18;
		int amountPeople = 3;
		
		//boolean accompanied = amountPeople >= 2;
		
		boolean accompanied; 
		
		if (amountPeople >= 2) {
			
			accompanied = true;
			
		} else {
			
			accompanied = false;
		}
		
		System.out.println("accompanied value = " + accompanied);
		
		if (age >= 18 && accompanied) {

			System.out.println("*** Welcome ***");

		} else {		
			System.out.println("unfortunately you cannot enter");				
				
		}	
	}
}

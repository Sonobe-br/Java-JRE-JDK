
public class TestaCondicional {

	public static void main(String[] args) {

		System.out.println("Testing the Conditionals");

		int age = 18;
		int amountPeople = 3;

		if (age >= 18) {

			System.out.println("You are of legal age.");
			System.out.println("*** Welcome ***");

		} else {
			
			if (amountPeople >= 2) {
				
				System.out.println("You are not 18 years old, "
						+ "but you are accompanied. You may come in!");
				
			} else {
				
				System.out.println("unfortunately you cannot enter");				
				
			}	
		}
	}
}
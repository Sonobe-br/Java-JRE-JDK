
public class TestaLacos {
	
	public static void main(String[] args) {
		
		for(int multiplicador = 2; multiplicador <= 10; multiplicador++) {
			
			for(int contador = 0; contador <= 10; contador++) {
				
				System.out.print(multiplicador * contador); //imprimindo na horizontal
				System.out.print(" "); //aplicando espaçamentos
			}

			System.out.println(); //pula linha(enter)
			
		}
	
	}

}

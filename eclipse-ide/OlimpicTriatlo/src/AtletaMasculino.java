
public class AtletaMasculino {
	
	String estilo;
	String nome;
	double velocidade;
	double agilidade;
	double força;
	
	public void vantagem(double estilo1, double estilo2) {
		
		if(estilo1 == estilo2) {
			
			this.força = this.agilidade;
		}
		
	}
		

}

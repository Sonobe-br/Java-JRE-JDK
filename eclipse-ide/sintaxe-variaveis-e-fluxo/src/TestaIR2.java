//De 1900.0 at� 2800.0, o IR � de 7.5% e pode deduzir na declara��o o valor de R$ 142.00
//De 2800.01 at� 3751.0, o IR � de 15% e pode deduzir R$ 350.00
//De 3751.01 at� 4664.00, o IR � de 22.5% e pode deduzir R$ 636.00

public class TestaIR2 {
		
	public static void main(String[] args) {
		
		double faixaSalarialC = 2800.00;
		double faixaSalarialB = 3751.00;
		double faixaSalarialA = 4664.00;
		
		double salarioMinimo = 1900.00; 
		
		boolean faixaIR;
		
		if(salarioMinimo <= faixaSalarialC) {
			
			faixaIR = true;
			
		} else {
			
			faixaIR = false;
		
		};
		
		System.out.println(faixaIR + " A sua al�quota ser� de 15% e pode deduzir R$ 350,00");
		
		if(faixaSalarialC <= faixaSalarialB) {		
			
			faixaIR = true;
			
		} else {
			
			faixaIR = false;
			
		}
		
		System.out.println(faixaIR + " A sua al�quota ser� de 7.5% e pode deduzir R$ 142,00");
		
		if(faixaSalarialC >= faixaSalarialA) {
			
			faixaIR = true;
		}
		
		System.out.println(faixaIR + " A sua al�quota ser� de 22.5% e pode deduzir R$ 636,00");
		
	}
		
}
	


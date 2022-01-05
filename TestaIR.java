//De 1900.0 até 2800.0, o IR é de 7.5% e pode deduzir na declaração o valor de R$ 142.00
//De 2800.01 até 3751.0, o IR é de 15% e pode deduzir R$ 350.00
//De 3751.01 até 4664.00, o IR é de 22.5% e pode deduzir R$ 636.00

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
		
		System.out.println(faixaIR + " A sua alíquota será de 15% e pode deduzir R$ 350,00");
		
		if(faixaSalarialC <= faixaSalarialB) {		
			
			faixaIR = true;
			
		} else {
			
			faixaIR = false;
			
		}
		
		System.out.println(faixaIR + " A sua alíquota será de 7.5% e pode deduzir R$ 142,00");
		
		if(faixaSalarialC >= faixaSalarialA) {
			
			faixaIR = true;
		}
		
		System.out.println(faixaIR + " A sua alíquota será de 22.5% e pode deduzir R$ 636,00");
		
	}
		
}
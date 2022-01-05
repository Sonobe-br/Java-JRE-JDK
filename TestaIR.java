//Na faixa salarial entre R$ 1.434,00 e R$ 2.150,00 a alíquota será de 7,5%. 
//Entre R$ 2.150,00 e R$ 2.866,00, 15%. 
//Para trabalhadores com salários entre R$ 2.866,00 e R$ 3.582,00 o desconto será de 22,5%. 
//A partir de R$ 3.582,00 permanece a alíquota atual de 27,5%.

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
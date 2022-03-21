
public class ControleBonificacao {
	
	private double premio;	
	
	public void registra(Funcionario funcionario) {	
		double bonificacao = funcionario.getBonificacao();
		this.premio = this.premio + bonificacao;
		
	}
	
	public double getPremio() {
		
		return premio;
		
	}
	
	
}

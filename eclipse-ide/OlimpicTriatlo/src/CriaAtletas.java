
public class CriaAtletas {
	
public static void main(String[] args) {
				
		//estilo
		Modalidades estilo = new Modalidades();
		
		//atletas ol�mpicos
		AtletaMasculino brit�nico = new AtletaMasculino();
		brit�nico.estilo = "Olimpico";
		brit�nico.nome = "Alistair Brownlee";
		brit�nico.velocidade = 10;
		brit�nico.agilidade = 9.9;
		brit�nico.for�a = 9.8;
		brit�nico.vantagem(estilo.corrida, estilo.corrida);
		System.out.println(brit�nico.nome + " apresenta " + brit�nico.agilidade + " de agilidade na corrida.");	
		
		AtletaMasculino noruegu�s = new AtletaMasculino();
		noruegu�s.estilo = "Olimpico";
		noruegu�s.nome = "Kristian Blummenfelt";
		noruegu�s.velocidade = 10;
		noruegu�s.agilidade = 9.1;
		noruegu�s.for�a =  9.9;
		noruegu�s.vantagem(estilo.ciclismo, estilo.ciclismo);
		System.out.println(noruegu�s.nome + " apresenta " + noruegu�s.agilidade + " de agilidade na corrida.");
		
		AtletaMasculino alem�o = new AtletaMasculino();
		alem�o.estilo = "Olimpico";
		alem�o.nome = "Jan Frodeno";
		alem�o.velocidade = 10;
		alem�o.agilidade = 9.8;
		alem�o.for�a = 9.9;
		alem�o.vantagem(estilo.nata��o, estilo.nata��o);
		System.out.println(alem�o.nome + " apresenta " + alem�o.agilidade + " de agilidade na corrida.");
		
		
		AtletaMasculino brasileiro = new AtletaMasculino();
		brasileiro.estilo = "Olimpico";
		brasileiro.nome = "Miguel Hidalgo";
		brasileiro.velocidade = 10;
		brasileiro.agilidade = 9.8;
		brasileiro.for�a = 9.4;
		brasileiro.vantagem(estilo.corrida, estilo.corrida);
		System.out.println(brasileiro.nome + " apresenta " + brasileiro.agilidade + " de agilidade na corrida.");
		
	}
	
}

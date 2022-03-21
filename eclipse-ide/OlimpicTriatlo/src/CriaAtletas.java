
public class CriaAtletas {
	
public static void main(String[] args) {
				
		//estilo
		Modalidades estilo = new Modalidades();
		
		//atletas olímpicos
		AtletaMasculino britânico = new AtletaMasculino();
		britânico.estilo = "Olimpico";
		britânico.nome = "Alistair Brownlee";
		britânico.velocidade = 10;
		britânico.agilidade = 9.9;
		britânico.força = 9.8;
		britânico.vantagem(estilo.corrida, estilo.corrida);
		System.out.println(britânico.nome + " apresenta " + britânico.agilidade + " de agilidade na corrida.");	
		
		AtletaMasculino norueguês = new AtletaMasculino();
		norueguês.estilo = "Olimpico";
		norueguês.nome = "Kristian Blummenfelt";
		norueguês.velocidade = 10;
		norueguês.agilidade = 9.1;
		norueguês.força =  9.9;
		norueguês.vantagem(estilo.ciclismo, estilo.ciclismo);
		System.out.println(norueguês.nome + " apresenta " + norueguês.agilidade + " de agilidade na corrida.");
		
		AtletaMasculino alemão = new AtletaMasculino();
		alemão.estilo = "Olimpico";
		alemão.nome = "Jan Frodeno";
		alemão.velocidade = 10;
		alemão.agilidade = 9.8;
		alemão.força = 9.9;
		alemão.vantagem(estilo.natação, estilo.natação);
		System.out.println(alemão.nome + " apresenta " + alemão.agilidade + " de agilidade na corrida.");
		
		
		AtletaMasculino brasileiro = new AtletaMasculino();
		brasileiro.estilo = "Olimpico";
		brasileiro.nome = "Miguel Hidalgo";
		brasileiro.velocidade = 10;
		brasileiro.agilidade = 9.8;
		brasileiro.força = 9.4;
		brasileiro.vantagem(estilo.corrida, estilo.corrida);
		System.out.println(brasileiro.nome + " apresenta " + brasileiro.agilidade + " de agilidade na corrida.");
		
	}
	
}

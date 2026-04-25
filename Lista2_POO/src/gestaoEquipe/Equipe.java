package gestaoEquipe;

import java.util.List;

public class Equipe {

	private String nomeEquipe;
	private String esporte;
	private List<Jogador> jogadores;
	
	public Equipe(String nomeEquipe, String esporte,  List<Jogador> jogadores) {
		this.nomeEquipe = nomeEquipe;
		this.esporte = esporte;
		this.jogadores = jogadores;
	}
	
	public void adicionarJogador(Jogador j) {
		this.jogadores.add(j);
	}
	
	public void exibirEscalacao(){
		for(int i = 0; i < jogadores.size(); i++) {
			jogadores.get(i).mostrarEscalacao();
			System.out.println("");
		}
		
	}
}

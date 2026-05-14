package ex04_gestaoEquipe;

import java.util.ArrayList;
import java.util.List;

public class Equipe {

	private String nomeEquipe;
	private String esporte;
	private List<Jogador> jogadores;
	

    public Equipe(String nomeEquipe, String esporte) {
        this.nomeEquipe = nomeEquipe;
        this.esporte    = esporte;
        this.jogadores  = new ArrayList<Jogador>();
    }

    public void adicionarJogador(Jogador j) {
        jogadores.add(j);
    }
	
	public void exibirEscalacao(){
		for(int i = 0; i < jogadores.size(); i++) {
			jogadores.get(i).mostrarEscalacao();
			System.out.println("");
		}
		
	}
}

package ex04_gestaoEquipe;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		Jogador jogador1 = new Jogador("Caio", "Atacante", 10);
		Jogador jogador2 = new Jogador("Bento", "Goleiro", 06);
		Jogador jogador3 = new Jogador("Vitor Roque", "Ponta direira", 9);
		
		Equipe equipe1 = new Equipe("Atlhetico - Pr", "Futebol");
		equipe1.adicionarJogador(jogador1);
		equipe1.adicionarJogador(jogador2);
		equipe1.adicionarJogador(jogador3);
		
		equipe1.exibirEscalacao();
			

	}

}

package edu.ifpr.composicao.AnatomiaHumana;

public class Humano {
	
	private String nome;
	private Coracao coracao;;
	
	public Humano(String nome) {
		this.nome = nome;
		this.coracao = new Coracao();
	}
	

    public void iniciarAtividadeFisica() {
        coracao.setBatimentosPorMinuto(120);
        System.out.println(nome + " iniciou atividade física.");
    }

    public void pararAtividadeFisica() {
        coracao.setBatimentosPorMinuto(80);
        System.out.println(nome + " parou a atividade física.");
    }

    public String verificarSinaisVitais() {
        int bpm = coracao.getBatimentosPorMinuto();
        if (bpm == 80) {
            return "RELAXADO";
        } else {
            return "ATIVIDADE FÍSICA";
        }
    }

    public String getNome() {
        return nome;
    }

}

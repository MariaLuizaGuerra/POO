package edu.ifpr.associacao.impressao;

public class Computador {

    private String marca;
    private Impressora impressoraConectada;

    public Computador(String marca) {
        this.marca = marca;
        this.impressoraConectada = null;
    }

    public void conectarImpressora(Impressora impressora) {
        impressoraConectada = impressora;
        System.out.println(marca +" está conectada a impressora: " + impressora.getModelo());
    }

    public void enviarDocumento(String texto) {
        if (impressoraConectada == null) {
            System.out.println("Nenhuma impressora conectada.");
        } else {
            impressoraConectada.imprimir(texto);
        }
    }
}
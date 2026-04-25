package ex05_personagemJogoAvancado;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		Heroi arthur = new Heroi("Arthur", 7, 76, 100);

        System.out.println("-----Estado inicial-----");
        arthur.exibirinformacoes();

        arthur.receberDano(30);
        System.out.println("");
        System.out.println("----- 30 de dano-----");
        arthur.exibirinformacoes();

        arthur.curar(10);
        System.out.println("");
        System.out.println("----- cura de 10 -----");
        arthur.exibirinformacoes();

        arthur.subirNivel();
        System.out.println("");
        System.out.println("-----Subir de nivel-----");
        arthur.exibirinformacoes();
    
	}

}
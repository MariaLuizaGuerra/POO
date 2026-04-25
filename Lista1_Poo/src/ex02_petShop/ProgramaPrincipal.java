package ex02_petShop;

public class ProgramaPrincipal {

	public static void main(String[] args) {

		Cachorro cachorro1 = new Cachorro("Dilma",  "chuaua", 5);
		Cachorro cachorro2 = new Cachorro("Temer", "Chuaua e pincher", 6);
		Cachorro cachorro3 = new Cachorro("Nikolas", "chuaua", 1);
		
		cachorro1.cartetinha();
		cachorro1.latir();
		
		cachorro2.cartetinha();
		cachorro2.latir();
		
		cachorro3.cartetinha();
		cachorro3.latir();
		

	}

}

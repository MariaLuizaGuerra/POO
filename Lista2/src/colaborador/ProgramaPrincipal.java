package colaborador;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		Contrato contrato = new Contrato(5000, 800);
		Colaborador colaborador = new Colaborador("Ana Silva", contrato);
		
		colaborador.getCustoTotal();
		
	}
}

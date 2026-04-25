package colaborador;

public class Contrato {

	private float salarioBase;
	private float valorBeneficios;
	
	public Contrato(float salarioBase, float valorBeneficios) {
		super();
		this.salarioBase = salarioBase;
		this.valorBeneficios = valorBeneficios;
	}
	
	public double CustoTotal() {
		return salarioBase + valorBeneficios;
	}
}

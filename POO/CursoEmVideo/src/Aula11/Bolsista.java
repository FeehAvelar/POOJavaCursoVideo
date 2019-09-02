package Aula11;
//Classe final, nunca podera ser um superclass.
public final class Bolsista extends Aluno{
	private float bolsa;

	public float getBolsa() {
		return bolsa;
	}

	public void setBolsa(float bolsa) {
		this.bolsa = bolsa;
	}

	
	public void renovarBolsa () {
		System.out.println("Bolsa renovada de "+this.getNome());
	}
	
	@Override
	public void pagarMensalidade () {
		System.out.println(this.getNome()+" é bolsista, tem um pagamento facilitado.");
	}


}

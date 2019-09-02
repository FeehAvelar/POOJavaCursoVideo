package Aula11;

public class Bolsista extends Aluno{
	private int bolsa;

	public int getBolsa() {
		return bolsa;
	}

	public void setBolsa(int bolsa) {
		this.bolsa = bolsa;
	}

	
	public void renovarBolsa () {
		System.out.println("Bolsa renovada.");
	}
	
	public void pagarMensalidade () {
		System.out.println("Mensalidade paga com sucesso.");
	}


}

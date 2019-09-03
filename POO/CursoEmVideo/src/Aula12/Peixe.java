package Aula12;

public class Peixe extends Animal{
	private String corEscama;

	public String getCorEscama() {
		return corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}

	@Override
	public void locomover() {
		// TODO Auto-generated method stub
		System.out.println("Nadando");		
	}

	@Override
	public void alimentar() {
		// TODO Auto-generated method stub
		System.out.println("Comendo substancias");
	}

	@Override
	public String emitirSom() {
		// TODO Auto-generated method stub
		return "Peixe não faz som";
	}
	
	public String soltarBolha () {
		return "Soltou uma bolha";
	}
	
}

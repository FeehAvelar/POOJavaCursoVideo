package Aula12;

public class Reptil extends Animal{
	private String corEscama;
	//gets && sets

	public String getCorEscama() {
		return corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}
	//Abstract Methods
	@Override
	public void locomover() {
		// TODO Auto-generated method stub
		System.out.println("Rastejando");		
	}

	@Override
	public void alimentar() {
		// TODO Auto-generated method stub
		System.out.println("Comendo vegetais");
	}

	@Override
	public String emitirSom() {
		// TODO Auto-generated method stub
		return "Som de reptil";
	}
	

}

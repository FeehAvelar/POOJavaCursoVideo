package Aula12;

public class Mamifero extends Animal{
	//Atributos
	private String corPelo;
	//Gets && Sets
	public String getCorPelo() {
		return corPelo;
	}

	public void setCorPelo(String corPelo) {
		this.corPelo = corPelo;
	}
	

	//Abstract Méthods
	@Override
	public void locomover() {
		// TODO Auto-generated method stub
		System.out.println("Correndo");		
	}

	@Override
	public void alimentar() {
		// TODO Auto-generated method stub
		System.out.println("Mamando");		
	}

	@Override
	public String emitirSom() {
		// TODO Auto-generated method stub
		return "Som de mamifero";
	}


}

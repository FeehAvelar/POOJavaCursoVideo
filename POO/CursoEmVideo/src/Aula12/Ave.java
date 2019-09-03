package Aula12;

public class Ave extends Animal{
	private String corPena;

	public String getCorPena() {
		return corPena;
	}

	public void setCorPena(String corPena) {
		this.corPena = corPena;
	}

	@Override
	public void locomover() {
		// TODO Auto-generated method stub
		System.out.println("Voando");
	}

	@Override
	public void alimentar() {
		// TODO Auto-generated method stub
		System.out.println("Comendo Frutas");		
	}

	@Override
	public String emitirSom() {
		// TODO Auto-generated method stub
		return "Som da Ave";
	}
	
	public String fazerNinho() {
		return "Fazendo ninho";
	}
	
}

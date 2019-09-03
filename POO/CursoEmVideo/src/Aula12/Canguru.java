package Aula12;

public class Canguru extends Mamifero{
	
	public String usarBolsa () {
		return "Usando a bolsa";
	}
	
	@Override
	public void locomover() {
		System.out.println("Saltando");
	}

}

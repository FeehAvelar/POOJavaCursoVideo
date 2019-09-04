package Aula13;

public class Cachorro extends Lobo{
	@Override
	public void emitirSom () {
		System.out.println("Au, au, au");
	}
	
	public void reagir(String frase) {
		if (frase.equals("Toma comida") || frase.equals("ola")) {
			System.out.println("Abanar e latir");
			this.emitirSom();
		}
		else
			System.out.println("Rosnar");
	}
	
	public void reagir(int hora, int min) {
		if (hora < 12)
			System.out.println("Abanar");
		else if (hora >= 18)
			System.out.println("Ignorando");
		else {
			System.out.println("Abanar e Latir");
			this.emitirSom();
		}
	}
	
	public void reagir (boolean dono) {
		if (dono) 
			System.out.println("Abanar");
		else {
			System.out.println("Rosnar e latir.");
			this.emitirSom();
		}
	}
	
	public void reagir (int idade, double peso) {
		if (idade < 5) {
			if (peso < 10)
				System.out.println("Abanar");				
			else 
				System.out.println("Rosnar");
		} else {
			if (peso < 10)
				System.out.println("Rosnar");				
			else
				System.out.println("Ignorar");
		}
		
	}
}

package Aula02;

public class Aula02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Caneta c1 = new Caneta();
		c1.cor = "Azul";
		c1.ponta = 0.5f;
		c1.tampada = false;
		c1.Status();
		System.out.println(c1.Rabiscar());
		
		Caneta c2 = new Caneta();
		c2.cor = "Vermelho";
		c2.ponta = 1.0f;
		c2.tampada = true;
		c2.Status();
		System.out.println(c2.Rabiscar());		
	}

}

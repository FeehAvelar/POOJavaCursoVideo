package Aula04;

public class Aula04 {

	public static void main(String[] args) {
		Caneta c1 = new Caneta();
		//c1.modelo = "BIC";
		c1.setModelo("BIC");
		//c1.ponta = 0.5f
		c1.setPonta(0.5f);
		c1.Status();
		
		Caneta c2 = new Caneta();
		c2.Status();
		
		Caneta c3 = new Caneta("Mont Blanc",0.5f,"Preta");
		c3.Status();
	}
}



















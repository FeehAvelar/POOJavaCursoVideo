package Aula03;

public class Aula03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Caneta c1 = new Caneta();
		c1.modelo = "BIC Cristal";
		c1.cor = "Azul";
		//c1.ponta = 0.5f;
		c1.carga = 80;
		c1.Tampar();
		c1.Status();
		System.out.println(c1.Rabiscar());
	}

}

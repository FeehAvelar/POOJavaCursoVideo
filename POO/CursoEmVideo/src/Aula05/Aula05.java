package Aula05;

public class Aula05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		ContaBanco p1 = new ContaBanco();
		p1.setNumConta(1111);
		p1.setDono("Jubileu");
		p1.AbrirConta("CC");
		p1.StatusConta();
		
		ContaBanco p2 = new ContaBanco(1112,"CP","Creuza");
		p2.StatusConta();
		
		p1.Depositar(100);
		p1.StatusConta();
		
		p2.Depositar(500);
		p2.StatusConta();
		p2.Sacar(100);
		p2.StatusConta();
		
		p1.Sacar(150);
		p1.fecharConta();
		p1.StatusConta();
		
		ContaBanco p3 = new ContaBanco();
		p3.setNumConta(1113);
		p3.setDono("João Ninguém");
		//p3.StatusConta();
	}
}

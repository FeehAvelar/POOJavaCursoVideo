package Aula10_Heran�a;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa p1 = new Pessoa();
		Aluno p2 = new Aluno();
		Professor p3 = new Professor();
		Funcionario p4 = new Funcionario();
		
		p1.setNome("Pedro");
		p2.setNome("Maria");
		p3.setNome("Cl�udio");
		p4.setNome("Fabiana");
		
		p1.setSexo('M');
		p4.setSexo('F');
		p2.setIdade(18);
		
		p2.setCurso("Inform�tica");
		p3.setSalario(2500.75f);
		p4.setSetor("Estoque");
		
		/*
		*p1.receberAumento(550.20f);
		*p2.mudarTrabalho();
		*p3.cancelarMatricula()
		*/
		
		
		
		p1.fazerAniversario();
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println(p4.toString());	
	}

}

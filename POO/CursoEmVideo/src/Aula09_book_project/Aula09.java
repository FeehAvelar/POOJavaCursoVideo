package Aula09_book_project;

public class Aula09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa[] p = new Pessoa [3];
		Livro l[] = new Livro[4];

		p[0] = new Pessoa("Pedro", 22, 'M');
		p[1] = new Pessoa("Maria",25,'F');
		p[2] = new Pessoa("Felipe",21, 'M');
		
		l[0] = new Livro("O Sumarillion", "J. R. R. Tolkien", 365, p[2]);
		l[1] = new Livro("Aprendendo Java", "José da Silva", 300, p[0]);
		l[2] = new Livro("POO para Iniciantes", "Pedro Paulo", 500, p[1]);
		l[3] = new Livro("O Senhor dos anéis", "J. R. R. Tolkien",1300, p[2]);
		
		l[0].abrir();
		l[0].folhear(80);
		
		l[3].detalhesNormal();
		System.out.println(l[0].detalhes());
		System.out.println(l[1].detalhes());
		System.out.println(l[2].detalhes());
		System.out.println(l[3].detalhes());

	}

}

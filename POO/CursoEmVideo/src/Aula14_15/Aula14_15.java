package Aula14_15;

public class Aula14_15 {
	public static void main(String[] args) {
		Video v[] = new Video[3];	
		v[0] = new Video("Aula 01 POO");
		v[1] = new Video("Aula 12 PHP");
		v[2] = new Video("Aula 10 HTML5");
		
		Gafanhoto g[] = new Gafanhoto[2];
		g[0] = new Gafanhoto("Jubileu", 22, 'M', "juba");
		g[1] = new Gafanhoto("Creuza", 12, 'F', "creuzita");
		
		
		Visualizacao vi[] = new Visualizacao[5];
		vi[0] = new Visualizacao(g[0], v[2]);//Jubileu assite HTML
		vi[0].avaliar();
		System.out.println(vi[0].toString());
		
		vi[1] = new Visualizacao(g[0], v[1]);//Jubileu assite PHP
		vi[1].avaliar(87.0f);
		System.out.println(vi[1].toString());
		
		

		/*
		 * System.out.println(v[0].toString());
		 * System.out.println();
		 * System.out.println(g[0].toString());
		 */
		
	}
}

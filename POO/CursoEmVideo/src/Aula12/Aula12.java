package Aula12;

public class Aula12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Animal n = new Animal ();
		/*
		Mamifero m = new Mamifero();
		Reptil r = new Reptil();
		Peixe p = new Peixe();
		Ave a = new Ave();
		
		m.setPeso(85.3f);
		m.setIdade(2);
		m.setMembros(4);
		m.locomover();
		m.alimentar();
		System.out.println("Som: "+m.emitirSom());
		
		p.setPeso(0.35f);
		p.setIdade(1);
		p.setMembros(0);
		p.locomover();
		p.alimentar();
		System.out.println("Som: "+p.emitirSom());

		a.setPeso(0.89);
		a.setIdade(2);
		a.setMembros(2);
		a.locomover();
		a.alimentar();
		System.out.println("Som: "+a.emitirSom());
		System.out.println(a.fazerNinho());*/
		
		Mamifero m = new Mamifero ();
		Canguru c = new Canguru();
		Cachorro k = new Cachorro();
		System.out.println("<--Mamifero-->");
		m.setPeso(5.7f);
		m.setIdade(8);
		m.setMembros(4);
		m.locomover();
		m.alimentar();
		System.out.println(m.emitirSom());

		System.out.println("<--Canguru - Mamifero-->");
		c.setPeso(55.3f);
		c.setIdade(3);
		c.setMembros(4);
		c.locomover();
		c.alimentar();
		System.out.println(c.emitirSom());
		System.out.println(c.usarBolsa());
		
		System.out.println("<--Cachorro - Mamifero-->");
		k.setPeso(3.94f);
		k.setIdade(5);
		k.setMembros(4);
		k.locomover();
		k.alimentar();
		System.out.println(k.emitirSom());
		System.out.println(k.abanandoRabo());
	}
}

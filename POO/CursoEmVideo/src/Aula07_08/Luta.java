package Aula07_08;

import java.util.Random;

public class Luta {
	private Lutador desafiado; //Tipo Abstrato
	private Lutador desafiante;
	private int rounds;
	private boolean aprovada;
	//Constructors
	public Luta () {
		System.out.println();
		System.out.println("=-=-=-=-=-=-=-NOVA LUTA=-=-=-=-=-=");
	}
	
	//Gets && Sets
	public Lutador getDesafiado() {
		return this.desafiado;
	}
	
	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}
	
	public Lutador getDesafiante() {
		return this.desafiante;
	}
	
	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}
	
	public int getRounds() {
		return this.rounds;
	}
	
	public void setRounds(int rounds) {
		this.rounds = rounds;
	}
	
	public boolean getAprovada() {
		return this.aprovada;
	}
	
	public void setAprovada(boolean valor) {
		this.aprovada = valor;		
	}
	
	//Normal Methods	
	public void marcarLuta(Lutador l1, Lutador l2) {
		//l1 = desafiado; l2 = desafiante
		//l1.getCategoria() == l2.getCategoria()
		if ((l1.getCategoria().equals(l2.getCategoria())) && (l1 != l2)) {
			this.setAprovada(true);
			this.setDesafiado(l1);
			this.setDesafiante(l2);
		}else {
			this.setAprovada(false);
			this.setDesafiado(null);
			this.setDesafiante(null);
			System.out.println("Luta recusada!");
		}
	}
	
	public void Lutar() {
		if (getAprovada()) {
			System.out.println("### DESAFIADO ###");
			getDesafiado().apresentar();
			System.out.println("### DESAFIANTE ###");
			getDesafiante().apresentar();
			Random aleatorio = new Random();
			
			int fimLuta = aleatorio.nextInt(3); //0, 1, 2
			System.out.print("Resultado da luta: ");
			switch (fimLuta) {
			case 0://Empate
				System.out.println("Empatou :-(");
				getDesafiado().empatarLuta();
				getDesafiante().empatarLuta();
				break;
			case 1://Desafiado vence
				System.out.println("Vitória do "+this.getDesafiado().getNome());
				getDesafiado().ganharLuta();
				getDesafiante().perderLuta();
				break;				
			case 2://Desafiante vence
				System.out.println("Vitória do "+this.getDesafiante().getNome());
				getDesafiado().perderLuta();
				getDesafiante().ganharLuta();
				break;				
			default:
				break;
			}
		}else {
			System.out.println("Luta sem aprovação.");
		}
	}
}

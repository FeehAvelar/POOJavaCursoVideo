package Aula14_15;

public class Gafanhoto extends Pessoa{
	//attributes
	private String login;
	private int totalAssistido;
	//Constructor
	public Gafanhoto(String nome, int idade, char sexo, String login) {
		super(nome, idade, sexo);
		this.login = login;
		this.totalAssistido = 0; 
	}
	//Gets && Sets
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public int getTotalAssistido() {
		return totalAssistido;
	}

	public void setTotalAssistido(int totalAssistido) {
		this.totalAssistido = totalAssistido;
	}

	public void viuMaisUm() {
		this.setTotalAssistido(this.getTotalAssistido() + 1);
	}	
	//toString
	@Override
	public String toString() {
		return "Gafanhoto [\n"+super.toString() +"\nlogin=" + login + ", \ntotalAssistido=" + totalAssistido + "]";
	}
	
}

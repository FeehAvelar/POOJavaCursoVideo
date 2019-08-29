package Aula10_Herança;

public class Funcionario extends Pessoa {
	//Atributos
	private String setor;
	private boolean trabalhando;
	//Constructs
	public Funcionario () {
		
	}
	public Funcionario(String nome, int idade, char sexo) {
		super(nome, idade, sexo);
		// TODO Auto-generated constructor stub
	}
	//Gets && Set
	public String getSetor() {
		return setor;
	}
	public void setSetor(String setor) {
		this.setor = setor;
	}
	public boolean isTrabalhando() {
		return trabalhando;
	}
	public void setTrabalhando(boolean trabalhando) {
		this.trabalhando = trabalhando;
	}
	//Normal Methods	
	public void mudarTrabalho () {
		this.setTrabalhando(!(this.isTrabalhando()));
	}
	
	

}

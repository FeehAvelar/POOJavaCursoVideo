package Aula10_Herança;

public class Professor extends Pessoa {
	//Atributos
	private String especialidade;
	private double salario;
	//Construct
	public Professor () {
		
	}
	public Professor(String nome, int idade, char sexo) {
		super(nome, idade, sexo);
		// TODO Auto-generated constructor stub
	}
	//Gets && Sets
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	//Normal Methods
	public void receberAumento(double valor) {
		this.setSalario(this.getSalario() + valor);		
	}
	

}

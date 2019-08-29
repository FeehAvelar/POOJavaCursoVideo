package Aula10_Herança;

public class Pessoa implements PessoaInterface {
	//Atributos
	private String nome;
	private int idade;
	private char sexo;
	//Construct
	public Pessoa (){
		
	}
	public Pessoa(String nome, int idade, char sexo) {
		this.setNome(nome);
		this.setIdade(idade);
		this.setSexo(sexo);
	}
	//Get && Set
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	//Normal Methods
	public void fazerAniversario() {
		setIdade(getIdade() + 1);
	}
	
	public String toString() {
		return "Pessoa{\nNome: "+this.getNome()+"\nIdade: "+this.getIdade()+"	Sexo: "+this.getSexo()+"\n}";
	}

}

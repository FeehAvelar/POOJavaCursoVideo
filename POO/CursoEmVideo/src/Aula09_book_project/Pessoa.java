package Aula09_book_project;

public class Pessoa {
	private String nome;
	private int idade;
	private char sexo;
	//Construct
	public Pessoa (String nome, int idade, char sexo) {
		this.setNome(nome);
		this.setIdade(idade);
		this.setSexo(sexo);		
	}
	//Sets && Gets
	public String getNome () {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade () {
		return this.idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public char getSexo () {
		return this.sexo;
	}
	
	public void setSexo (char sexo) {
		this.sexo = sexo;
	}
	
	//Methods
	public void fazerAniversario () {
		this.setIdade(this.getIdade() + 1);
	}
	
	
}

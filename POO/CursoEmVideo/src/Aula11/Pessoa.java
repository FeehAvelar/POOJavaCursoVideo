package Aula11;

public abstract class Pessoa implements PessoaInterface{
	private String nome;
	private int idade;
	private char sexo;
	
	public String getNome() {
		return this.nome;
	}
	public void setNome (String nome) {
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
	
	
	public void fazerAniversario() {
		this.setIdade(this.getIdade() + 1);
	}
}

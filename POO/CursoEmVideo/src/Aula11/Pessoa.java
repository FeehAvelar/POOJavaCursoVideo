package Aula11;

public abstract class Pessoa implements PessoaInterface{
	//Atributos
	private String nome;
	private int idade;
	private char sexo;
	//Get && Set
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
	//toString	
	public String toString() {
		return "Pessoa{\nNome: "+this.getNome()+"\nIdade: "+this.idade+"\nSexo:"+this.sexo+"\n}";
	}
	//Methods Interface
	public final void fazerAniversario() {
		//Metodos finais nao podem receber Override
		this.setIdade(this.getIdade() + 1);
	}
}

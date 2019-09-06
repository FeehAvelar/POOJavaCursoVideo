package Aula14_15;

public abstract class Pessoa {
	protected String nome;
	protected int idade;
	protected char sexo;
	protected float experiencia;
	//Constructor
	public Pessoa(String nome, int idade, char sexo) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.experiencia = 0;
	}
	//Gets && Sets
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
	public float getExperiencia() {
		return experiencia;
	}
	public void setExperiencia(float experiencia) {
		this.experiencia = experiencia;
	}
	//toString
	@Override
	public String toString() {
		return "Pessoa [\nnome=" + nome + ",\nidade=" + idade + ",\nsexo=" + sexo + ",\nexperiencia=" + experiencia + "]";
	}
	

}

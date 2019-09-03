package Aula12;

public abstract class Animal implements AnimalInteface {
	//Atributos
	private double peso;
	private int idade;
	private int membros;
	//gets && Sets
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getMembros() {
		return membros;
	}
	public void setMembros(int membros) {
		this.membros = membros;
	}
	//Interface Methods
	@Override
	public abstract void locomover(); 
	@Override
	public abstract void alimentar();
	@Override
	public abstract String emitirSom();

}

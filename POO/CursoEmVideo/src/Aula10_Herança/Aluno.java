package Aula10_Herança;
//Extende pessoa (herda de pessoa)
public class Aluno extends Pessoa {
	//Atributos
	private int matricula;
	private String curso;
	//Construct
	public Aluno () {
		
	}
	public Aluno(String nome, int idade, char sexo, int matricula, String curso) {
		super(nome, idade, sexo);
		this.setMatricula(matricula);
		this.setCurso(curso);
		// TODO Auto-generated constructor stub
	}
	//Get && Sets
	public int getMatricula() {
		return this.matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getCurso() {
		return this.curso;				
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	//Methods
	public void cancelarMatricula () {
		System.out.println("Matrícula será cancelada");
	}
	

}

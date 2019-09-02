package Aula11;

public class Aluno extends Pessoa {
	//Attributes
	private int matricula;
	private String curso;
	//Get && Sets
	public int getMatricula() {
		return this.matricula;
	}
	public void setMatricula (int matricula) {
		this.matricula = matricula;
	}
	public String getCurso() {
		return this.curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	//Methodos normais
	public void pagarMensalidade () {
		System.out.println("Mensalidade do(a) aluno(a): "+this.getNome()+" paga com sucesso.");
	}	
}

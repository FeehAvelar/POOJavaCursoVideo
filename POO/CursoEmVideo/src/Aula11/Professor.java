package Aula11;

public class Professor extends Pessoa {
	private String especialidade;
	private float salario;
	
	public String getEspecialidade () {
		return this.especialidade;
	}
	public void setEspecialidade (String especialidade) {
		this.especialidade = especialidade;
 	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	public void receberAumento(float valor) {
		setSalario(getSalario() + valor);
		System.out.println("O salário recebeu aumento de: "+valor+"\nSalario aumentado com sucesso!");
	}
	
}

package Aula07_08;

public class Lutador implements LutadorInterface {
	//Attributes
	private String nome;
	private String nacionalidade;
	private int idade;
	private float altura;
	private float peso;
	private String categoria;
	private int vitorias;
	private int derrotas;
	private int empates;
	
	//Constructors
	public Lutador(String nome, String nacionalidade, int idade, 
					float altura, float peso, int vitorias, 
					int derrotas, int empates) {
		this.setNome(nome);
		this.setNacionalidade(nacionalidade);
		this.setIdade(idade);
		this.setAltura(altura);
		this.setPeso(peso);
		this.setVitorias(vitorias);
		this.setDerrotas(derrotas);
		this.setEmpates(empates);
	}
	
	//Gets & Sets
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNacionalidade() {
		return nacionalidade;
	}
	
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public float getAltura() {
		return altura;
	}
	
	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	public float getPeso() {
		return peso;
	}
	
	public void setPeso(float peso) {
		this.peso = peso;
		setCategoria();
	}
	
	public String getCategoria() {
		return categoria;
	}
	
	private void setCategoria() {
		float peso = getPeso();
		String cat;
		if (peso < 52.2) {
			cat = "Inválido";
		}else if (peso <= 70.3) {
			cat = "Leve";
		}else if (peso <= 83.9) {
			cat = "Médio";
		}else if (peso <= 120.2) {
			cat = "Pesado";
		}else {
			cat = "Inválido";
		}
		this.categoria = cat;
	}

	public int getVitorias() {
		return vitorias;
	}
	
	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}
	
	public int getDerrotas() {
		return derrotas;
	}
	
	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}
	
	public int getEmpates() {
		return empates;
	}
	
	public void setEmpates(int empates) {
		this.empates = empates;
	}

	//Methods Interface
	@Override
	public void apresentar() {
		// TODO Auto-generated method stub
		System.out.println("-=-=-=-Apresentando=-=-=-=");
		System.out.println("Lutador: "+getNome());
		System.out.println("Origem: "+getNacionalidade());
		System.out.println("Com "+getIdade()+" anos e "+getAltura()+"m de altura");
		System.out.println("Pesando: "+getPeso()+" Kg - "+getCategoria());
		System.out.println("V:"+getVitorias()+"/E:"+getEmpates()+"/D:"+getDerrotas());
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-");
	}
	
	@Override
	public void status() {
		// TODO Auto-generated method stub
		System.out.println();
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=");
		System.out.println(getNome());
		System.out.println("Categoria: "+getCategoria());
		System.out.println("Ganhou: "+getVitorias()+" vezes");
		System.out.println("Empates: "+getEmpates()+" vezes");
		System.out.println("Derrotas: "+getDerrotas()+" vezes");
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=");
	}
	
	@Override
	public void ganharLuta() {
		// TODO Auto-generated method stub
		setVitorias(getVitorias() + 1);
		
	}
	
	@Override
	public void perderLuta() {
		// TODO Auto-generated method stub
		setDerrotas(getDerrotas() + 1); 
		
	}
	
	@Override
	public void empatarLuta() {
		// TODO Auto-generated method stub
		setEmpates(getEmpates() + 1);
	}

}


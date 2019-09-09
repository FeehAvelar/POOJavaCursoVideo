package Aula14_15;

public class Visualizacao {
	//Attributes
	private Gafanhoto espectador;
	private Video filme;
	//Construct
	public Visualizacao(Gafanhoto espectador, Video filme) {
		this.setEspectador(espectador);
		this.setFilme(filme);
		this.espectador.setTotalAssistido(this.espectador.getTotalAssistido() + 1);
		this.filme.setViews(this.filme.getViews() + 2);
	}
	
	//Gets Sets
	public Gafanhoto getEspectador() {
		return espectador;
	}
	public void setEspectador(Gafanhoto espectador) {
		this.espectador = espectador;
	}
	public Video getFilme() {
		return filme;
	}
	public void setFilme(Video filme) {
		this.filme = filme;
	}

	//Methods Normal
	public void avaliar() {
		this.filme.setAvaliacao(5);
	}
	
	public void avaliar (int nota) {
		this.filme.setAvaliacao(nota);		
	}
	
	public void avaliar (float porc) {
		int total = 0; 
		if (porc <= 20) 
			total = 3;
		else if (porc <= 50)
			total = 5;
		else if (porc <= 90)
			total = 8;
		else
			total = 10;
		this.filme.setAvaliacao(total);
	}

	//toString
	@Override
	public String toString() {
		return "Visualizacao [\nEspectador=" + espectador + ", \nFilme=" + filme + "\n]";
	}
}
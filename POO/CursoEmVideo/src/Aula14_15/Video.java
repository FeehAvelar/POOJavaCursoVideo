package Aula14_15;

public class Video implements AcoesVideo{
	private String titulo;
	private int avaliacao;
	private int views;
	private int curtidas;
	private boolean reproduzindo;
	//Constructor
	public Video(String titulo) {
		this.setTitulo(titulo);
		this.setAvaliacao(1);
		this.setViews(0);
		this.setCurtidas(0);
		this.setReproduzindo(false);
	}
	
	//Gets && Sets
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getAvaliacao() {
		return this.avaliacao;
	}
	public void setAvaliacao(int avaliacao) {
		this.avaliacao = avaliacao;
	}
	public int getViews() {
		return views;
	}
	public void setViews(int views) {
		this.views = views;
	}
	public int getCurtidas() {
		return curtidas;
	}
	public void setCurtidas(int curtidas) {
		this.curtidas = curtidas;
	}
	public boolean isReproduzindo() {
		return reproduzindo;
	}
	public void setReproduzindo(boolean reproduzindo) {
		this.reproduzindo = reproduzindo;
	}
	//Methods Interface
	@Override
	public void play() {
		// TODO Auto-generated method stub
		if (!isReproduzindo()) {
			this.setReproduzindo(true);
		}else{
			System.out.println("Já está reproduzindo video.");
		}		
	}
	@Override
	public void pause() {
		// TODO Auto-generated method stub
		this.setReproduzindo(false);		
	}
	@Override
	public void like() {
		// TODO Auto-generated method stub
		this.setCurtidas(this.getCurtidas()+1);		
	}
	//ToString
	
	@Override
	public String toString() {
		return "Video[\nTitulo:"+this.getTitulo()+"\nAvaliacao:"+this.getAvaliacao()
			+"\nView:"+this.getAvaliacao()+"\nCurtidas: "+this.getCurtidas()+"\nEstado:"+this.isReproduzindo()+"]";
	}
	
	
	
	

}

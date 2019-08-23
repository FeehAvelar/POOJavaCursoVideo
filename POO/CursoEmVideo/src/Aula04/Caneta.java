package Aula04;

public class Caneta {
	public String modelo;
	private float ponta;
	private String cor;
	
	//Contrutor
	public Caneta() {
		this.setModelo("Faber Castel");
		this.setPonta(0.7f);
		this.setCor("Verde");
	}	
	
	public Caneta(String m, float p, String c) {
		this.setModelo(m);
		this.setPonta(p);
		this.setCor(c);		
	}
	
	//Sets & Gets
	public String getModelo () {
		return this.modelo;
	}
	
	public void setModelo(String mod) {
		this.modelo = mod;		
	} 
	
	public float getPonta () {
		return this.ponta;
	}
	
	public void setPonta (float  p) {
		this.ponta = p;
	}
	
	public String getCor() {
		return this.cor;
	}
	
	public void setCor(String c) {
		this.cor = c;
	}
	

	//MetodosNormais
	public void Status() {
		// TODO Auto-generated method stub
		System.out.println("-=-=-=-=Caneta=-=-=-=-");
		System.out.println("Modelo: "+this.getModelo());
		System.out.println("Ponta: "+this.getPonta());
		System.out.println("Cor: "+this.getCor());
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=");		
	}									   


}

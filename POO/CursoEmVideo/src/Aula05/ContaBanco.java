package Aula05;

public class ContaBanco {
	public int NumConta;
	protected String tipo;
	private String dono;
	private double saldo;
	private boolean estado;
	
	//Contructs
	public ContaBanco() {
		this.setSaldo(0);
		this.setEstado(false);
	}
	
	public ContaBanco(int Num, String tipo,String dono) {
		this.setNumConta(Num);
		this.setTipo(tipo.toUpperCase());
		this.setDono(dono);
		if (tipo == "CC") {
			this.setSaldo(50.00f);
		}else if (tipo == "CP") {
			this.setSaldo(150.00f);
		}
		this.setEstado(true);
	}
	
	//Gets&&Sets
	public int getNumConta() {
		return this.NumConta;		
	}
	
	public void setNumConta(int num) {
		this.NumConta = num; 
	}
	
	public String getTipo() {
		return this.tipo;
	}
	
	public void setTipo(String T) {
		this.tipo = T.toUpperCase();
	}
	
	public String getDono(){
		return this.dono;
	}
	
	public void setDono(String D) {
		this.dono = D;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void setSaldo(double valor) {
		this.saldo = valor;
	}
	
	public boolean getEstado() {
		return this.estado;
	}
	
	public void setEstado(boolean Est) {
		this.estado = Est;
	}
	
	
	//Nomal Methods
	public void AbrirConta(String tipo) {
		this.setTipo(tipo.toUpperCase());
		if (this.getTipo() == "CC") {
			this.setSaldo(50.00f);
			this.setEstado(true);
		}else if (getTipo() == "CP") {
			this.setSaldo(150.00f);
			this.setEstado(true);
		}else {
			System.out.println("Tipo de conta invalido!");
		}
	}
	
	public void fecharConta() {
		if (this.getSaldo() > 0) {
			System.out.println("Antes de fechar conta é necessário que saque o dinheiro");
		}else if (getSaldo() < 0) {
			System.out.println("Para fechar a conta é necessário que quite seus débitos");
		}else {
			this.setEstado(false);
		}	
	}
	
	public void Depositar(double valor) {
		if (this.getEstado()) {
			valor += this.getSaldo();
			this.setSaldo(valor);
		}else {
			System.out.println("Impossivel depositar em conta fechada.");
		}
	}
	
	public void Sacar (double valor) {
		if (this.getEstado()) {
			if (this.getSaldo() >= valor) {
				this.setSaldo(this.getSaldo() - valor);
			}else {
				System.out.println("Sem saldo para realizar esse saque!");
			}
		}else{
			System.out.println("Impossivel sacar de uma conta fechada");
		}
	}

	public void PagarMensalidade() {
		double valor;
		
		if (this.getTipo() == "CC") {
			valor = 12;
		}else {
			valor = 20;
		}
		
		if (getEstado()) {
			this.setSaldo(this.getSaldo() - valor);
		}
	}
	
	public void StatusConta() {
		System.out.println("-=-=-=-=-Conta=-=-=-=-=");
		System.out.println("Conta:"+this.getNumConta());
		System.out.println("Tipo:"+this.getTipo());
		System.out.println("Proprietario:"+this.getDono());
		System.out.println("Saldo: R$"+this.getSaldo());
		System.out.println("Estado:"+this.getEstado());
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=");
	}
}

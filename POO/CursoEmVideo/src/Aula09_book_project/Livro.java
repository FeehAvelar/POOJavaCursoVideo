package Aula09_book_project;

public class Livro implements Publicacao {
	private String titulo;
	private String autor;
	private int totalPaginas;
	private int pagAtual;
	private boolean aberto;
	private Pessoa leitor;

	//Construct
	public Livro (String titulo, String autor, int totalPaginas, Pessoa leitor) {
		this.setTitulo(titulo);
		this.setAutor(autor);
		this.setTotalPaginas(totalPaginas);
		this.setPagAtual(0);
		this.setAberto(false);
		this.setLeitor(leitor);
	}
	
	//Gets && Sets
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getTotalPaginas() {
		return totalPaginas;
	}
	public void setTotalPaginas(int totalPaginas) {
		this.totalPaginas = totalPaginas;
	}
	public int getPagAtual() {
		return pagAtual;
	}
	public void setPagAtual(int pagAtual) {
		this.pagAtual = pagAtual;
	}
	public boolean getAberto() {
		return aberto;
	}
	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}
	public Pessoa getLeitor() {
		return leitor;
	}
	public void setLeitor(Pessoa leitor) {
		this.leitor = leitor;
	}
	
	//Publicacao Methods
	@Override
	public void abrir() {
		// TODO Auto-generated method stub
		if (!(this.getAberto())) {
			this.setAberto(true);
		}		
	}
	@Override
	public void fechar() {
		// TODO Auto-generated method stub
		if (this.getAberto())
			this.setAberto(false);
		
	}
	@Override
	public void folhear(int pagFinal) {
		// TODO Auto-generated method stub
		if (this.getAberto()) {
			
			if (pagFinal > this.getTotalPaginas())
				pagFinal = this.getTotalPaginas();
			
			/*for (int i = 1; i <= pagFinal; i++) {
				System.out.println("Pag: "+i);
			}*/
			
			setPagAtual(pagFinal);
		} else
			System.out.println("Primeiro abra o livro.");
	}
	
	@Override
	public void avancarPagina() {
		// TODO Auto-generated method stub
		if (this.getAberto()) {
			if (this.getPagAtual() < this.getTotalPaginas())
				this.setPagAtual(getPagAtual() + 1);
		} else
			System.out.println("Primeiro abra o livro.");
	}
	@Override
	public void voltarPagina() {
		// TODO Auto-generated method stub
		if (this.getAberto()) {
			if (this.getPagAtual() > 0) {
				this.setPagAtual(getPagAtual() - 1);
			}
		}else
			System.out.println("Primeiro abra o livro");
	}
	//Methods
	public void detalhesNormal () {
		System.out.println("-=-=-=-= Livro:"+this.getTitulo()+" -=-=-=-=-=");		
		System.out.println("Autor: "+this.getAutor());
		if (this.getAberto())
			System.out.println("Está aberto");
		else 
			System.out.println("Está fechado");
		if (this.getAberto())
			System.out.println("Página Atual:"+this.getPagAtual());
		System.out.println("Páginas totais:"+this.getTotalPaginas());
		System.out.println("Leitor atual: "+this.getLeitor().getNome());
	}
	
	public String detalhes() {
		return "-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-"
			+ "\nLivro{"+"\nTitulo:"+this.getTitulo()+"\nAutor:"+this.getAutor()+"\nTotal pag:"+this.getTotalPaginas()
			+"	Pag Atual:"+this.getPagAtual()+"\nAberto:"+this.getAberto()+"\nLeitor:"+this.getLeitor().getNome()
			+"\nIdade: "+this.getLeitor().getIdade()+"\nSexo: "+this.getLeitor().getSexo()+"}";
	}
}

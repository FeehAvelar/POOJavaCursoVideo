package Aula09_book_project;

public interface Publicacao {
	public abstract void abrir ();
	public abstract void fechar ();
	public abstract void folhear (int pagFinal);
	public abstract void avancarPagina ();
	public abstract void voltarPagina ();
}

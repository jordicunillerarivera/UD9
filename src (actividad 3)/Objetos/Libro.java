package Objetos;

public class Libro {

	// Atributos

	private int isbn;
	private String titulo;
	private String autor;
	private int numeroPaginas;

	// Constuctores
	
	public Libro() {
		
	}

	public Libro(int isbn, String titulo, String autor, int numeroPaginas) {
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
		this.numeroPaginas = numeroPaginas;
	}

	// Metodos
	
	@Override
	public String toString() {
		return "El libro " + titulo + " con isbn " + isbn + " creado por el autor " + autor + " tiene " + numeroPaginas + " paginas";
	}

	// Setters & Getters
	
	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

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

	public int getNumeroPaginas() {
		return numeroPaginas;
	}

	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}
	
}
	

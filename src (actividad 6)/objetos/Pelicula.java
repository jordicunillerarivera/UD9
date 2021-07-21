package objetos;

public class Pelicula {
	
	// Atributos
	
	private String titulo;
	private int duracion;
	private int edadMinima;
	private String director;
	
	// Constructores
	
	public Pelicula() {
		
	}
	
	public Pelicula(String titulo, int duracion, int edadMinima, String director) {
		this.titulo = titulo;
		this.duracion = duracion;
		this.edadMinima = edadMinima;
		this.director = director;
	}
	
	// Metodos
	
	@Override
	public String toString() {
		return "Peliculas [titulo=" + titulo + ", duracion=" + duracion + ", edadMinima=" + edadMinima + ", director="
				+ director + "]";
	}
	
	// Setters & Getters
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public int getDuracion() {
		return duracion;
	}
	
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	
	public int getEdadMinima() {
		return edadMinima;
	}
	
	public void setEdadMinima(int edadMinima) {
		this.edadMinima = edadMinima;
	}
	
	public String getDirector() {
		return director;
	}
	
	public void setDirector(String director) {
		this.director = director;
	}

}

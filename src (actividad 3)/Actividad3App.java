import Objetos.Libro;

public class Actividad3App {

	public static void main(String[] args) {
		
		Libro libro1 = new Libro(546556, "Libro1" , "Autor1", 250);
		Libro libro2 = new Libro(465982, "Libro2" , "Autor2", 300);
		
		System.out.println(libro1);
		
		compararPaginas(libro1, libro2);
		
	}
	
	public static void compararPaginas(Libro libro1, Libro libro2) {
		
		int pLibro1 = libro1.getNumeroPaginas();
		int pLibro2 = libro2.getNumeroPaginas();
		
		if (pLibro1 > pLibro2) {
			System.out.println("El " + libro1.getTitulo() + " tiene " + (pLibro1 - pLibro2) + " paginas mas que el " + libro2.getTitulo());
		} else {
			System.out.println("El " + libro2.getTitulo() + " tiene " + (pLibro2 - pLibro1) + " paginas mas que el " + libro1.getTitulo());
		}
		
	}

}

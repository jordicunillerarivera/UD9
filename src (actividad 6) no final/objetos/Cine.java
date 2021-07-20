package objetos;
import java.util.Random;

public class Cine {
	
	// Atributos
	
	private String pelicula;
	private double precioEntrada;
	private String[][] sala; 
	
	// Constructores
	
	public Cine() {
		this.sala = crearSala();
	}
	
	public Cine(String pelicula, double precioEntrada) {
		this.pelicula = pelicula;
		this.precioEntrada = precioEntrada;
		this.sala = crearSala();
	}
	
	// Metodos

	@Override
	public String toString() {
		return "Cine [pelicula=" + pelicula + ", precioEntrada=" + precioEntrada + "]";
	}
	
		// Metodo para crear la matriz de la sala
	private String[][] crearSala(){
		
		String[][] sala = {
				{"8Aª ", "8Bª ", "8Cª ", "8Dª ", "8Eª ", "8Fª ", "8Gª ", "8Hª ", "8Iª "},
				{"7Aª ", "7Bª ", "7Cª ", "7Dª ", "7Eª ", "7Fª ", "7Gª ", "7Hª ", "7Iª "},
				{"6Aª ", "6Bª ", "6Cª ", "6Dª ", "6Eª ", "6Fª ", "6Gª ", "6Hª ", "6Iª "},
				{"5Aª ", "5Bª ", "5Cª ", "5Dª ", "5Eª ", "5Fª ", "5Gª ", "5Hª ", "5Iª "},
				{"4Aª ", "4Bª ", "4Cª ", "4Dª ", "4Eª ", "4Fª ", "4Gª ", "4Hª ", "4Iª "},
				{"3Aª ", "3Bª ", "3Cª ", "3Dª ", "3Eª ", "3Fª ", "3Gª ", "3Hª ", "3Iª "},
				{"2Aª ", "2Bª ", "2Cª ", "2Dª ", "2Eª ", "2Fª ", "2Gª ", "2Hª ", "2Iª "},
				{"1Aª ", "1Bª ", "1Cª ", "1Dª ", "1Eª ", "1Fª ", "1Gª ", "1Hª ", "1Iª "}
		};
		
		return sala;
		
	}
	
		// Metodo para comprar la entrada
	public void comprarEntrada(Pelicula pelicula, Espectador espectador) {
		
		Random rnd = new Random();
		
		if (espectador.getDinero() >= precioEntrada) {
			if (espectador.getEdad() >= pelicula.getEdadMinima()) {
				if (hayAsientoLibre()) {
					int rndA = (int)(rnd.nextDouble() * 8 + 0);
					int rndB = (int)(rnd.nextDouble() * 9 + 0);
					if (sala[rndA][rndB].charAt(2) == 'ª') {
						sala[rndA][rndB] = sala[rndA][rndB].replace('ª', 'X');
						System.out.println("Asiento " + sala[rndA][rndB].substring(0 , 2) + " asignado!");
					}
				} else System.out.println("No quedan asientos disponibles");
			} else System.out.println("No cumple la edad minima");
		} else System.out.println("No puede pagar la entreada");
		
	}
	
		// Metodo para comprobar si hay asientos libres
	public boolean hayAsientoLibre() {
		
		for (int i = 0; i < sala.length; i++) {
			for (int j = 0; j < sala[i].length; j++) {
				if (sala[i][j].charAt(2) == 'ª') {
					return true;
				}
			} 
		}
		return false;
	}
	
		// Metodo para mostrar la matriz sala
	public void recorrerSala() {
		
		for (int i = 0; i < sala.length; i++) {
			for (int j = 0; j < sala[i].length; j++) {
				
				System.out.print(sala[i][j]);
				
			} System.out.println();
		}
		
	}
	
	// Setters & Getters

	public String getPelicula() {
		return pelicula;
	}

	public void setPelicula(String pelicula) {
		this.pelicula = pelicula;
	}

	public double getPrecioEntrada() {
		return precioEntrada;
	}

	public void setPrecioEntrada(double precioEntrada) {
		this.precioEntrada = precioEntrada;
	}
	
	
	
	

}

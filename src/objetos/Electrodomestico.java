package objetos;

public class Electrodomestico {
	
	// Atributos
	
	protected double precioBase;
	protected String color;
	protected char consumoEnergetico;
	protected int peso;
	protected double precioFinal;
	
	// Constantes
	
	private double PRECIO = 100;
	private String COLOR = "Blanco";
	private char CONSUMOENERGETICO = 'F';
	private int PESO = 5;
	
	// Constructores
	
	/**
	 *  Crea un objeto electrodomestico con los atributos por defecto.
	 */
	public Electrodomestico() {
		this.precioBase = PRECIO;
		this.color = COLOR;
		this.consumoEnergetico = CONSUMOENERGETICO;
		this.peso = PESO;
	}

	/**
	 * Crea un objeto electrodomestico con los atributos precioBase y peso seteados por el usuario y los demas por defecto.
	 * @param precioBase
	 * @param peso
	 */
	public Electrodomestico(double precioBase, int peso) {
		this.precioBase = precioBase;
		this.peso = peso;
		this.color = COLOR;
		this.consumoEnergetico = CONSUMOENERGETICO;
	}

	/**
	 * Crea un objeto electrodomestico con todos los atributos seteados por el usuario.
	 * @param precioBase
	 * @param color
	 * @param consumoEnergetico
	 * @param peso
	 */
	public Electrodomestico(double precioBase, String color, char consumoEnergetico, int peso) {
		this.precioBase = precioBase;
		this.color = comprobarColor(color);
		this.consumoEnergetico = comprobarConsumoElectrico(consumoEnergetico);
		this.peso = peso;
	}
	
	// Metodos
	
		// Metodo para comprobar que el consumo electrico sea correcto
	private char comprobarConsumoElectrico(char letra) {
		
		letra = Character.toUpperCase(letra);
		
		switch (letra) {
			case 'A':
				return letra;
			case 'B':
				return letra;
			case 'C':
				return letra;
			case 'D':
				return letra;
			case 'E':
				return letra;
			case 'F':
				return letra;

			default:
				return 'F';
		}
		
	}
	
		// Metodo para comprobar que el color sea correcto
	private String comprobarColor(String color) {
		
		color = color.toLowerCase();
		
		switch (color) {
			case "blanco":
				return "Blanco";
			case "negro":
				return "Negro";
			case "rojo":
				return "Rojo";
			case "azul":
				return "Azul";
			case "gris":
				return "Gris";
	
			default:
				return "Blanco";
		}
		
	}
	
		// Metodo para calcular el precio final del electrodomestico
	public void precioFinal() {
		
		this.precioFinal = this.precioBase;
		
		switch (this.consumoEnergetico) {
			case 'A':
				this.precioFinal += 100;
			case 'B':
				this.precioFinal += 80;
			case 'C':
				this.precioFinal += 60;
			case 'D':
				this.precioFinal += 50;
			case 'E':
				this.precioFinal += 30;
			case 'F':
				this.precioFinal += 10;
		}
		
		if (this.peso >= 0 && this.peso <= 19) {
			this.precioFinal += 10;
			
		} else if (this.peso >= 20 && this.peso <= 49) {
			this.precioFinal += 50;
			
		} else if (this.peso >= 50 && this.peso <= 79) {
			this.precioFinal += 80;
			
		} else if (this.peso >= 80) {
			this.precioFinal += 100;
		}
		
	}
	
	// Setters & Getters
	
	public double getPrecioBase() {
		return precioBase;
	}
	
	public double getPrecioFinal() {
		return precioFinal;
	}

	public String getColor() {
		return color;
	}

	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public double getPeso() {
		return peso;
	}

}

package objetos;

public class Television extends Electrodomestico {
	
	// Atributos
	
	private int resolucion; // En pulgadas
	private boolean tdt; // Sintetizador
	
	// Constantes
	
	private final int RESOLUCION = 20;
	private final boolean TDT = false; 
	
	// Constructores
	
	/**
	 * Crea un objeto television con los atributos por defecto.
	 */
	public Television() {
		
		this.resolucion = RESOLUCION;
		this.tdt = TDT;
		
	}
	
	/**
	 * Crea un objeto television con los atributos precioBase y peso seteados por el usuario y los demas por defecto.
	 * @param precioBase
	 * @param peso
	 */
	public Television(double precioBase, int peso) {
		super(precioBase, peso);
		this.resolucion = RESOLUCION;
		this.tdt = TDT;
	}
	
	/**
	 * Crea un objeto television con todos los atributos seteados por el usuario.
	 * @param precioBase
	 * @param color
	 * @param consumoEnergetico
	 * @param peso
	 * @param carga
	 * @param resolucion
	 * @param tdt
	 */
	public Television(double precioBase, String color, char consumoEnergetico, int peso, int resolucion, boolean tdt) {
		super(precioBase, color, consumoEnergetico, peso);
		this.resolucion = RESOLUCION;
		this.tdt = TDT;
	}
	
	// Metodos
	
	public void precioFinal() {
		super.precioFinal();
		
		if (resolucion >= 40) {
			this.precioFinal = this.precioFinal + (precioBase * 0.30);
		}
		
		if (tdt) {
			this.precioFinal += 50;
		}
		
	}
	
	// Setters y Getters
	
	public int getResolucion() {
		return resolucion;
	}

	public boolean isTdt() {
		return tdt;
	}

}

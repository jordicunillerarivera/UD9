package objetos;

public class Lavadora extends Electrodomestico {
	
	// Atributos
	
	private int carga;
	
	// Constantes
	
	private final int CARGA = 5;
	
	// Constructores
	
	/**
	 * Crea un objeto lavadora con los atributos por defecto.
	 */
	public Lavadora() {
		this.carga = CARGA;
	}

	/**
	 * Crea un objeto lavadora con los atributos precioBase y peso seteados por el usuario y los demas por defecto.
	 * @param precioBase
	 * @param peso
	 */
	public Lavadora(double precioBase, int peso, int carga) {
		super(precioBase, peso);
		this.carga = carga;
	}

	/**
	 * Crea un objeto lavadora con todos los atributos seteados por el usuario.
	 * @param precioBase
	 * @param color
	 * @param consumoEnergetico
	 * @param peso
	 * @param carga
	 */
	public Lavadora(double precioBase, String color, char consumoEnergetico, int peso, int carga) {
		super(precioBase, color, consumoEnergetico, peso);
		this.carga = carga;
	}

	// Metodos
	
	@Override
	public String toString() {
		return "Lavadora [carga=" + carga + ", precioBase=" + precioBase + ", color=" + color + ", consumoEnergetico="
				+ consumoEnergetico + ", peso=" + peso + "]";
	}
	
	public void precioFinal() {
		super.precioFinal();
		
		if (this.carga >= 30) {
			this.precioFinal += 50;
		}
	}

	// Getters & Setters
	
	public int getCarga() {
		return carga;
	}

}

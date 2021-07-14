
import objetos.Electrodomestico;
import objetos.Lavadora;
import objetos.Television;

public class Actividad1App {

	public static void main(String[] args) {
		
		Electrodomestico electrodomesticos[] = crearArray();
		precioFinal(electrodomesticos);
		mostrarPrecio(electrodomesticos);

	}
	
		// Metodo para crear un array
	public static Electrodomestico[] crearArray() {
		
		Electrodomestico television35 = new Television(500, 20);
		Electrodomestico television50 = new Television(700, "Negro", 'c', 20, 50, true);
		Electrodomestico lavadora20 = new Lavadora(400, 150, 20);
		Electrodomestico microondas = new Electrodomestico(80, "blano", 'b', 20);
		Electrodomestico auriculares = new Electrodomestico();
		Electrodomestico television70 = new Television(700, "Azul", 'b', 30, 70, true);
		Electrodomestico Ventilador = new Electrodomestico(20, 5);
		Electrodomestico television15 = new Television(350, "Negro", 'd', 10, 15, false);
		Electrodomestico lavadora40 = new Lavadora(400, "Rojo", 'b', 150, 20);
		Electrodomestico aireAcondicionado = new Electrodomestico(200, 40);
		
		Electrodomestico array[] = {
				television35,
				television50,
				lavadora20,
				microondas,
				auriculares,
				television70,
				Ventilador,
				television15,
				lavadora40,
				aireAcondicionado
		};
		
		return array;
		
	}
	
		// Metodo par acalcular el precio final
	public static void precioFinal(Electrodomestico[] array) {
		
		for (int i = 0; i < array.length; i++) {
			array[i].precioFinal();
		}
		
	}
	
		// Metodo para mostrar el precio final dividido en 3 categorias
	public static void mostrarPrecio(Electrodomestico[] array) {
		
		double precioElectro = 0;
		double precioTele = 0;
		double precioLava = 0;
		
		for (int i = 0; i < array.length; i++) {
			precioElectro += array[i].getPrecioFinal();
		}
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] instanceof Television) {
				precioTele += array[i].getPrecioFinal();
			}
		}
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] instanceof Lavadora) {
				precioLava += array[i].getPrecioFinal();
			}
		}
		
		System.out.println("Precio de todos los electrodomesticos: " + precioElectro + "\n"
				+ "Precio de todas las televisiones: " + precioTele + "\n"
						+ "Precio de todas las lavadoras: " + precioLava);
		
	}

}

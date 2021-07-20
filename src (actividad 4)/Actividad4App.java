import Objetos.*;

public class Actividad4App {

	public static void main(String[] args) {
		
		Raices raiz = new Raices(1, -4, 4);

		System.out.println(raiz.tieneRaiz());
		System.out.println(raiz.tieneRaices());
		
		raiz.obtenerRaices();
		raiz.obtenerRaiz();
		
		raiz.calcular();
		
	}

}
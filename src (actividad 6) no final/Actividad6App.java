import java.util.ArrayList;

import javax.swing.JOptionPane;

import objetos.*;

public class Actividad6App {

	public static void main(String[] args) {

		ArrayList<Cine> cines = new ArrayList<>();
		ArrayList<Pelicula> peliculas = new ArrayList<>();
		ArrayList<Espectador> espectadores = new ArrayList<>();
		
		menu(cines, peliculas, espectadores);
		
	}
	
	public static void menu(ArrayList<Cine> cines, ArrayList<Pelicula> peliculas, ArrayList<Espectador> espectadores) {
		
		int opcion = Integer.parseInt(JOptionPane.showInputDialog("Que quiere hacer:\n1. Habilitar sala\n2. Habilitar pelicula\n3. Vender entrada\n4. Ver clientes"));
		
		switch (opcion) {
			case 1:
				cines.add(new Cine(JOptionPane.showInputDialog("Nombre de la sala"), Double.parseDouble(JOptionPane.showInputDialog("Cuanto cuesta la entrada"))));
				mostrarCines(cines);
				menu(cines, peliculas, espectadores);
			case 2:
				peliculas.add(new Pelicula(JOptionPane.showInputDialog("Nombre de la pelicula"), Integer.parseInt(JOptionPane.showInputDialog("Duracion de la pelicula")), 
						Integer.parseInt(JOptionPane.showInputDialog("Edad minima")), JOptionPane.showInputDialog("Nombre del director")));
				mostrarPelis(peliculas);
				menu(cines, peliculas, espectadores);
			case 3:
				espectadores.add(new Espectador(JOptionPane.showInputDialog("Nombre del cliente"), Integer.parseInt(JOptionPane.showInputDialog("Edad del cliente")), 
						Double.parseDouble(JOptionPane.showInputDialog("De cuanto dinero dispone"))));
				crearVenta(cines, peliculas, espectadores);
				menu(cines, peliculas, espectadores);
			case 4:
				mostrarclientes(espectadores);
				menu(cines, peliculas, espectadores);
			default:
				JOptionPane.showMessageDialog(null, "Inserte una opcion valida");
				menu(cines, peliculas, espectadores);
		}
		
	}
	
	private static void crearVenta(ArrayList<Cine> cines, ArrayList<Pelicula> peliculas, ArrayList<Espectador> espectadores) {
		
		Cine cine = cines.get(cines.indexOf(JOptionPane.showInputDialog("Que sala desea usar")));
		System.out.println(cine);
		
	}

	public static void mostrarCines(ArrayList<Cine> cines) {
		
		String output = "";
		for(int i = 0; i<cines.size(); i++){
		    String everything = cines.get(i).toString();

		    output += everything + "\n";       
		}
		JOptionPane.showMessageDialog(null, output);
		
	}
	
	public static void mostrarPelis(ArrayList<Pelicula> pelis) {
		
		String output = "";
		for(int i = 0; i<pelis.size(); i++){
		    String everything = pelis.get(i).toString();

		    output += everything + "\n";       
		}
		JOptionPane.showMessageDialog(null, output);
		
	}
	
	public static void mostrarclientes(ArrayList<Espectador> clientes) {
		
		String output = "";
		for(int i = 0; i<clientes.size(); i++){
		    String everything = clientes.get(i).toString();

		    output += everything + "\n";       
		}
		JOptionPane.showMessageDialog(null, output);
		
	}

}

import Objetos.*;

public class Actividad2App {

	public static void main(String[] args) {
		
		Serie series[] = crearArraySerie();
		Videojuego videojuegos[] = crearArrayVideojuego();
		
		entregar(series, videojuegos);
		
		System.out.println("Hay " + contarEntregados(series) + " series entregadas");
		System.out.println("Hay " + contarEntregados(videojuegos) + " videojuegos entregados");
		
		System.out.println("\nLa serie con mas temporadas es: \n" + series[masHorasTemporadas(series)].toString());
		System.out.println("\nEl videjuego con mas horas es: \n" + videojuegos[masHorasTemporadas(videojuegos)].toString());
		
	}
	
	// Metodo para crear un array para series
	public static Serie[] crearArraySerie() {
		
		Serie StarWars = new Serie("Star Wars: The Mandalorian", "Disney");
		Serie StrangerThings = new Serie();
		Serie BreakingBad = new Serie();
		Serie TokyoGhouls = new Serie("Tokyo Ghoul", 4, "Accion, Gore", "ns");
		Serie Doraemon = new Serie();
		
		Serie array[] = {
				StarWars,
				StrangerThings,
				BreakingBad,
				TokyoGhouls,
				Doraemon,
		};
		return array;
	}
	
	// Metodo para crear un array para videojuegos
	public static Videojuego[] crearArrayVideojuego() {
		
		Videojuego BattlefielV = new Videojuego("Battlefield V", 60);
		Videojuego CallOfDuty = new Videojuego("COD WW2", 50);
		Videojuego Minecraft = new Videojuego();
		Videojuego R6Siege = new Videojuego();
		Videojuego Rust = new Videojuego("Rust", 50, "Survival", "Facepunch");
		
		Videojuego array[] = {
				BattlefielV,
				CallOfDuty,
				Minecraft,
				R6Siege,
				Rust,
		};
		return array;
	}
		
	// Metodo para entregar una serie o videojuego
	public static void entregar(Serie[] series, Videojuego[] videojuegos ) {
		series[1].entregar();
		series[4].entregar();
		videojuegos[0].entregar();
		videojuegos[3].entregar();
		videojuegos[4].entregar();
	}
	
	// Metodo para contar las series o videojuegos entregados
	public static int contarEntregados(Object a[]) {
		
		int cont = 0;
		
		if (a[0] instanceof Serie) {
			for (int i = 0; i < a.length; i++) {
				if (((Serie) a[i]).isEntregado()) {
					cont++;
				}
			}
			
		} else if(a[0] instanceof Videojuego){
			for (int i = 0; i < a.length; i++) {
				if (((Videojuego) a[i]).isEntregado()) {
					cont++;
				}
			}
		}
		
		return cont;
		
	}
	
	// Metodos para recoger la serie con mas temporadas o el videojuego con ams horas de juego
	public static int masHorasTemporadas(Object a[]) {
		
		int aux = 0;
		
		if (a[0] instanceof Serie) {
			
			for (int i = 0; i < a.length; i++) {
				
				if ((boolean) ((Serie) a[i]).compareTo(a[aux])) {
					
					aux = i;
					
				}
			}
		} else if(a[0] instanceof Videojuego){
			
			for (int i = 0; i < a.length; i++) {
				
				if ((boolean) ((Videojuego) a[i]).compareTo(a[aux])) {
					
					aux = i;
					
				}
			}
		}
		return aux;
	}
}

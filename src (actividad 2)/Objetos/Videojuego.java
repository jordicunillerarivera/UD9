package Objetos;

import Interfaces.Entregable;

public class Videojuego implements Entregable {
	
	// Atributos
	
	private String titulo;
	private int horasEstimadas;
	private boolean entregado;
	private String genero;
	private String compa�ia;
	
	// Constantes
	
	private final int HORASESTIMADAS = 10;
	private final boolean ENTREGADO = false;
	
	// Constructores
	
	public Videojuego() {
		this.horasEstimadas = HORASESTIMADAS;
		this.entregado = ENTREGADO;
	}
	
	public Videojuego(String titulo, int horasEstimadas) {
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.entregado = ENTREGADO;
	}
	
	public Videojuego(String titulo, int horasEstimadas, String genero, String compa�ia) {
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.entregado = ENTREGADO;
		this.genero = genero;
		this.compa�ia = compa�ia;
	}
	
	// Metodos
	
	@Override
	public String toString() {
		return "Videojuego [titulo=" + titulo + ", horasEstimadas=" + horasEstimadas + ", entregado=" + entregado
				+ ", genero=" + genero + ", compa�ia=" + compa�ia + "]";
	}
	
	public void entregar() {
		
		this.entregado = true;
		
	}
	
	public void devolver() {
		
		this.entregado = false;
		
	}
	
	public boolean compareTo(Object a) {
		
		if (a instanceof Videojuego) {
			
			int aux = ((Videojuego) a).getHorasEstimadas();
			
			if (this.horasEstimadas > aux) {
				
				return true;
				
			} else {
				return false;
			}
		}
		return true;
		
	}
	
	// Setters & Getters
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getHorasEstimadas() {
		return horasEstimadas;
	}

	public void setHorasEstimadas(int horasEstimadas) {
		this.horasEstimadas = horasEstimadas;
	}

	public boolean isEntregado() {
		return entregado;
	}

	public void setEntregado(boolean entregado) {
		this.entregado = entregado;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCompa�ia() {
		return compa�ia;
	}

	public void setCompa�ia(String compa�ia) {
		this.compa�ia = compa�ia;
	}
	
}

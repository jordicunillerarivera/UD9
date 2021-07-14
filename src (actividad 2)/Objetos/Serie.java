package Objetos;

import Interfaces.Entregable;

public class Serie implements Entregable {
	
	// Atributos
	
	private String titulo;
	private int numTemporadas;
	private boolean entregado;
	private String genero;
	private String creador;
	
	// Constantes
	
	private final int NUMTEMPORADAS = 3;
	private final boolean ENTREGADO = false;
	
	// Constructores
	
	public Serie() {
		this.numTemporadas = NUMTEMPORADAS;
		this.entregado = ENTREGADO;
	}
	
	public Serie(String titulo, String creador) {
		this.titulo = titulo;
		this.creador = creador;
		this.numTemporadas = NUMTEMPORADAS;
		this.entregado = ENTREGADO;
	}
	
	public Serie(String titulo, int numTemporadas, String genero, String creador) {
		this.titulo = titulo;
		this.numTemporadas = numTemporadas;
		this.entregado = ENTREGADO;
		this.genero = genero;
		this.creador = creador;
	}
	
	// Metodos
	
	@Override
	public String toString() {
		return "Serie [titulo=" + titulo + ", numTemporadas=" + numTemporadas + ", entregado=" + entregado + ", genero="
				+ genero + ", creador=" + creador + "]";
	}
	
	public void entregar() {
		
		this.entregado = true;
		
	}
	
	public void devolver() {
		
		this.entregado = false;
		
	}
	
	public boolean compareTo(Object a) {
		
		if (a instanceof Serie) {
			
			int aux = ((Serie) a).getNumTemporadas();
			
			if (this.numTemporadas > aux) {
				
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

	public int getNumTemporadas() {
		return numTemporadas;
	}

	public void setNumTemporadas(int numTemporadas) {
		this.numTemporadas = numTemporadas;
	}
	
	public boolean isEntregado() {
		return entregado;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

}

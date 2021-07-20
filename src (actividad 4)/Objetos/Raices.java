package Objetos;

public class Raices {
	
	// Atributos
	
	private double a;
	private double b;
	private double c;
	
	// Constructores
	
	public Raices(double a, double b, double c) {
		
		this.a = a;
		this.b = b;
		this.c = c;
		
	}
	
	// Metodos
	
		//  imprime las 2 posibles soluciones
	public void obtenerRaices() {
		
		if (tieneRaices()) {
			double auxResultado = (b*b)-(4*a*c); 						// Primero calculamos el trozo qeu iria dentro de la raiz cuadrada
			double resultado1 = (-b+Math.sqrt(auxResultado))/(2*a);		// Luego calculariamos el primer resultado sumnado el coeficiente negativo b por la raizcuadrada con el resultado anterior, lo dividimos entre 2 por a 
			double resultado2 = (-b-Math.sqrt(auxResultado))/(2*a);		// Se repite el proceso para el segundo resultado pero en vez de sumar el coeficiente negativo b por la raiz, lo restamos
			System.out.println(resultado1 + ", " + resultado2);			// Devolvemos ambos resultados
		}
		
	}
	
		// imprime única raíz, que será cuando solo tenga una solución posible.
	public void obtenerRaiz() {
		
		if (tieneRaiz()) {

			double auxResultado = (b*b)-(4*a*c);						
			double resultado1 = (-b+Math.sqrt(auxResultado))/(2*a);		// Cuando solo tiene una solucion, sumar o restar el coeficiente negativo b por la raiz cuadrada da el mismo resultado, por lo qeu es
			System.out.println(resultado1);								// indiferente el metodo que escojamos
			
		}
		
	}
	
		// devuelve el valor del discriminante (double), el discriminante tiene la siguiente formula, (b^2)-4*a*c
	public double getDiscriminante() {
		
		return (Math.pow(b, 2)-4*a*c);
		
	}
	
		// devuelve un booleano indicando si tiene dos soluciones, para que esto ocurra, el discriminante debe ser mayor o igual que 0.
	public boolean tieneRaices() {
		
		if (getDiscriminante() >= 1) {
			return true;
		} else {
			return false;
		}
		
	}
	
		// devuelve un booleano indicando si tiene una única solución, para que	esto ocurra, el discriminante debe ser igual que 0.
	public boolean tieneRaiz() {
		
		if (getDiscriminante() == 0) {
			return true;
		} else {
			return false;
		}
		
	}
	
		// mostrara por consola las posibles soluciones que tiene nuestra ecuación,	en caso de no existir solución, mostrarlo también.
	public void calcular() {
		
		if (tieneRaiz()) {
			
			double auxResultado = (b*b)-(4*a*c);
			double resultado1 = (-b+Math.sqrt(auxResultado))/(2*a);
			System.out.println(resultado1);
			
		} else if (tieneRaices()) {
			
			double auxResultado = (b*b)-(4*a*c);
			double resultado1 = (-b+Math.sqrt(auxResultado))/(2*a);
			double resultado2 = (-b-Math.sqrt(auxResultado))/(2*a);
			System.out.println(resultado1 + ", " + resultado2);
			
		} else {
			System.out.println("No tiene soluciones posibles");
		}
		
	}

	// Setters & Getters
	
	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}

}

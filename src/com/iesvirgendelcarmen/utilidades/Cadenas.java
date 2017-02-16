package com.iesvirgendelcarmen.utilidades;

public class Cadenas {
	
	//accesibilidad public
	public static int contarLetras(String cadena){
		return cadena.length();
	}
	//accesibilidad a nivel de package
	static boolean comienzaPorVocal(String cadena){
	return cadena.toLowerCase().matches("[aeioutáéíóú].*");
	}
	//accesiblidad protected
	protected static boolean noAcabaEnVocal(String cadena){
		return !cadena.toLowerCase().matches(".*[aeioutáéíóú]");
	}
	//accesibilidad privada 
	private static boolean esUnNumero(String cadena){
		return cadena.matches("[\\d]+");
	}
	//¿Son todos los método accesibles dentro de la propia clase?
	public static void main(String[] args) {
		System.out.printf("Contamos nº de letras de la palabra %s es %d%n", "camión",
				Cadenas.contarLetras("camión"));
		System.out.printf("¿Comienza por vocal la palabra %s? es %b%n", "Olaya",
				Cadenas.comienzaPorVocal("Olaya"));
		System.out.printf("¿Comienza por vocal la palabra %s? es %b%n", "Olaya",
				Cadenas.noAcabaEnVocal("Olaya"));
		System.out.printf("Acaba en vocal %s? es %b%n", "Olaya",
						Cadenas.noAcabaEnVocal("Olaya"));
		System.out.printf("¿Es un nº %s? es %b%n", "2", 
				Cadenas.esUnNumero("2"));
	}
}

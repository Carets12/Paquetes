package com.iesvirgendelcarmen.utilidades;

public class TestCadenas {
	public static void main(String[] args) {
		//Todos se ven en el mismo package
	System.out.printf("Contamos nº de letras de la palabra %s es %d%n", "camión",
			Cadenas.contarLetras("camión"));
	System.out.printf("¿Comienza por vocal la palabra %s? es %b%n", "Olaya",
			Cadenas.comienzaPorVocal("Olaya"));
	System.out.printf("¿Comienza por vocal la palabra %s? es %b%n", "Olaya",
			Cadenas.noAcabaEnVocal("Olaya"));
	System.out.printf("¿Es un nº %s? es %b%n", "Olaya",
			Cadenas.noAcabaEnVocal("Olaya"));
		//El privado no se puede
	/*System.out.printf("¿Es un nº %s? es %b%n", "Olaya",
			Cadenas.esUnNumero("Olaya"));
*/
	}
}
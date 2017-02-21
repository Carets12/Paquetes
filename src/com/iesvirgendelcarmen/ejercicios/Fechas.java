package com.iesvirgendelcarmen.ejercicios;

import java.text.Format;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import FechaActual.LocalDateTime;

//Ejercicio tratamos fechas de acuerdo a la nuevo API de fechas que aporta java8
public class Fechas {
	public static void main(String[] args) {
		//Fecha
		LocalDate fechaActual = LocalDate.now();
		System.out.println(fechaActual);
		DateTimeFormatter fechaFormateada = DateTimeFormatter.ofPattern("dd/LL/yyy");
		System.out.println(fechaFormateada.format(LocalDate.now()));
		//Tiempo
		LocalTime horaActual = LocalTime.now();
		System.out.println(horaActual);
		DateTimeFormatter zonaHoraria = DateTimeFormatter.ofPattern("h:mm a");
		System.out.println(zonaHoraria.format(LocalTime.now()));
		//Fecha y tiempo
		LocalDateTime ahora = LocalDateTime.now();
		System.out.println(ahora);
		DateTimeFormatter zonaHorario = DateTimeFormatter.ofPattern("d MMMM, yyyy h:mm a");
		System.out.println(zonaHoraria);
		
				
		
		
		
	}
}

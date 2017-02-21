package FechaActual;

import java.time.LocalTime;

public class FechaActual {

	public static void main(String[] args) {
		 LocalDate fechaActual = LocalDate.now();
		 System.out.println(fechaActual);
		 LocalTime horaActual = LocalTime.now();
		 System.out.println(horaActual);
		 LocalDateTime ahora = LocalDateTime.now();
		 System.out.println(ahora);
	}
	
}

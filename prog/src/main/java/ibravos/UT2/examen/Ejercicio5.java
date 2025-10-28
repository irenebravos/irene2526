
package ibravos.UT2.examen;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Ejercicio5{
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		DateTimeFormatter formateador = DateTimeFormatter.ofPattern("dd/MM/uuuu");
		System.out.print("Indica tu fecha de nacimiento con el formato DD/MM/AAAA: ");
		String textoFecha = teclado.nextLine();
		teclado.close();

		LocalDate cumple = LocalDate.parse(textoFecha, formateador);
		//System.out.println(cumple); //para comprobar que la fecha se parsea correctamente.
		LocalDate hoy = LocalDate.now();
		Long dias = ChronoUnit.DAYS.between(cumple, hoy);

		System.out.println("Llevas vivo " + dias + " días.");
	}
}

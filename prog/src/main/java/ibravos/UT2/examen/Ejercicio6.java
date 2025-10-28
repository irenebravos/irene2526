
package ibravos.UT2.examen;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Ejercicio6{
	public static void main(String[] args){
		Locale locale = Locale.of("es", "ES");
		DateTimeFormatter formateador = DateTimeFormatter.ofPattern("'Estamos en' MMMM'. Es el día' dd', ha caído en' EEEE 'y son las' H 'horas y' m 'minutos.'", locale);
		LocalDateTime ahora = LocalDateTime.now();
		String textoFecha = ahora.format(formateador);
		System.out.println(textoFecha);
	}
}

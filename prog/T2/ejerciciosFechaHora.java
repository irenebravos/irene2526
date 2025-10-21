
import java.time.*;

public class ejerciciosFechaHora {
    public static void main(String[] args) {

        /* 1. Fundamentos con LocalDate
          Objetivo: crear y leer componentes.
          Enunciado: Crea un LocalDate con la fecha de hoy y muestra año, mes (numérico y nombre) y día.
          Pista: LocalDate.now(), getYear(), getMonthValue(), getMonth(), getDayOfMonth().
        */
        LocalDate hoy = LocalDate.now();
        System.out.println (hoy);
        System.out.println (hoy.getMonth());
        System.out.println (hoy.getYear());
        System.out.println (hoy.getMonthValue());
        System.out.println (hoy.getDayOfMonth());

        /* 2. Fundamentos con LocalTime
            Objetivo: crear horas y comparar.
            Enunciado: Crea LocalTime.now() y LocalTime.of(8, 30). Indica si “ahora” es antes o después de las 08:30.
            Pista: isBefore, isAfter.
         */
        LocalTime hoy1 = LocalTime.now();
        LocalTime hora1 = LocalTime.of( 8, 30 );
        boolean antes1 = hora1.isBefore(hoy);
        boolean despues1 = hora1.isAfter(hoy);
        System.out.println (hoy1);
        System.out.println (hora1);
        System.out.println ("es antes " + antes1);
        System.out.println ("es despues " + despues1);

        /* 3. LocalDateTime básico
            Objetivo: combinar fecha y hora.
            Enunciado: Combina LocalDate.of(2025,10,17) con LocalTime.of(9,15) en un LocalDateTime. Súmale 2 h y 45 min y muéstralo.
            Pista: LocalDateTime.of(...), plusHours, plusMinutes.
         */
        LocalDate hoy2 = LocalDate.of(2025,10,17);
        LocalTime hora2 = LocalTime.of(9,15);
        LocalDateTime junto = LocalDateTime.of(hoy2, hora2);
        LocalDateTime dentroDe2h = junto.plusHours(2);
        LocalDateTime dentroDe45min = dentroDe2h.plusMinutes(45);
        System.out.println(hoy2);
        System.out.println(junto);
        System.out.println(dentroDe2h);
        System.out.println(dentroDe45min);

        /* 4. Formateo sencillo
            Objetivo: formatear a un patrón.
            Enunciado: Formatea la fecha de hoy como dd/MM/yyyy (ej.: 17/10/2025).
            Pista: DateTimeFormatter.ofPattern("dd/MM/yyyy"), format(...).
         */
        LocalDate hoy3 = LocalDate.of(2025,10,17);
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-uuuu");
        String fechaFormato = hoy3.format(f);
        System.out.println (fechaFormato);

        /* 5. Parseo sencillo
            Objetivo: pasar de texto a objeto.
            Enunciado: Parsea "2025-12-05" a LocalDate y muestra el día de la semana.
            Pista: LocalDate.parse(...) con ISO por defecto, getDayOfWeek().
         */
        String textoFecha = "2025-12-05";
        LocalDate fecha = LocalDate.parse(textoFecha);
        DayOfWeek diaSemana = fecha.getDayOfWeek();
        String nombreDia = diaSemana.getDisplayName(java.time.format.TextStyle.FULL, new Locale("es", "ES"));
        System.out.println("La fecha " + textoFecha + " corresponde a: " + nombreDia);

        /* 6. Formato “largo” en español
            Objetivo: formatos con texto y locale.
            Enunciado: Dada una fecha, muéstrala como "viernes, 17 de octubre de 2025".
            Pista: DateTimeFormatter.ofPattern("EEEE, d 'de' MMMM 'de' yyyy", new Locale("es","ES")).
         */
        LocalDate fecha = LocalDate.of(2025, 10, 17);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern( "EEEE, d 'de' MMMM 'de' yyyy", new Locale( "es", "ES" ) );
        String fechaFormateada = fecha.format(formatter);
        System.out.println(fechaFormateada);

        /* 7. Parseo con patrón propio
            Objetivo: parsear formatos no ISO.
            Enunciado: Parsea "17-10-2025 09:30" a LocalDateTime.
            Pista: Patrón "dd-MM-yyyy HH:mm" con DateTimeFormatter.
         */



        /* 8. Cálculos con fechas (bisiesto + fin de mes)
            Objetivo: propiedades y aritmética.
            Enunciado: Pide un año y un mes. Crea LocalDate con el día 1 y calcula: a) si el año es bisiesto; b) cuántos días tiene el mes; c) la fecha del último día.
            Pista: isLeapYear(), lengthOfMonth(), withDayOfMonth(length).
         */

        /* 9. Próximo viernes
            Objetivo: usar plusDays y getDayOfWeek.
            Enunciado: Dada una fecha cualquiera, calcula la fecha del próximo viernes (si ya es viernes, pasa al viernes siguiente).
            Pista: suma días hasta que getDayOfWeek() == DayOfWeek.FRIDAY.
         */

        /* 10. 24h ↔ 12h con am/pm
            Objetivo: practicar formateo/parseo de horas.
            Enunciado: Parsea "14:35" (HH:mm) a LocalTime y muéstralo en formato de 12 horas con am/pm (ej.: 02:35 PM).
            Pista: patrón "hh:mm a" (y si quieres, new Locale("es","ES")).
         */

        /* 11. Combinar cadenas fecha+hora
            Objetivo: parsear por separado y fusionar.
            Enunciado: Parsea "17/10/2025" (dd/MM/yyyy) y "09:30" (HH:mm) por separado y combínalos en un LocalDateTime.
            Pista: LocalDate.parse(...), LocalTime.parse(...), LocalDateTime.of(fecha, hora)
         */

        /* 12. Diferencia de horas dentro del día
            Objetivo: comparar LocalTime y calcular minutos (sin Duration, opcional con ella).
            Enunciado: Dadas dos horas "08:15" y "11:40", calcula cuántos minutos hay entre ambas.
            Pista (sin Duration): convierte a minutos desde medianoche: h*60 + m.
            Pista (opcional): Duration.between(t1, t2).toMinutes().
         */

        /* 13. Listar todas las fechas de un mes
            Objetivo: iteración con LocalDate.
            Enunciado: Dado un año y mes, lista todas las fechas del mes en formato EEE dd/MM (ej.: Lun 01/07).
            Pista: withDayOfMonth(1), lengthOfMonth(), bucle for y DateTimeFormatter.ofPattern("EEE dd/MM", new Locale("es","ES")).
         */

        /* 14. Validar si una hora cae en un horario comercial
            Objetivo: rangos con LocalTime.
            Enunciado: Define horario L-V 09:00-14:00 y 16:00-19:00. Pide una hora (ej.: "13:45", "15:30", "18:10") y responde si está dentro de algún tramo.
            Pista: isAfter/isBefore (recuerda incluir límites: !time.isBefore(inicio) && !time.isAfter(fin)).
         */

        /* 15. Generar próximas 5 sesiones de una clase semanal
            Objetivo: mezcla de todo + formato amigable.
            Enunciado: Dado: Día de la semana (ej.: MARTES), Hora de inicio "18:30", Fecha base (hoy),
            genera las próximas 5 ocurrencias (LocalDateTime) y muéstralas en formato "EEEE d MMMM yyyy 'a las' HH:mm".
            Pista: avanza LocalDate día a día hasta el próximo DayOfWeek indicado, luego usa plusWeeks(1) para siguientes; formatea con Locale("es","ES").
         */

        /* 16. Crear una fecha
            Objetivo: Construir una fecha a partir de los datos de usuario.
            Enunciado: Pide al usuario los datos de su fecha de nacimiento: el día del mes, el mes en número (1 para enero, 2 para febrero...) y el año.
            Luego construye una fecha (LocalDate) y dile en qué día de la semana caerá su cumpleaños en 2030.
         */

    }
}

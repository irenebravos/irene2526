package ibravos.UT2.ejercicios;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;
import java.util.Scanner;


public class FechaHora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1---------------------------------------------------------");

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

        System.out.println("2---------------------------------------------------------");

        /* 2. Fundamentos con LocalTime
            Objetivo: crear horas y comparar.
            Enunciado: Crea LocalTime.now() y LocalTime.of(8, 30). Indica si “ahora” es antes o después de las 08:30.
            Pista: isBefore, isAfter.
         */
        LocalTime hoy1 = LocalTime.now();
        LocalTime hora1 = LocalTime.of( 8, 30 );
        boolean antes1 = hora1.isBefore(hoy1);
        boolean despues1 = hora1.isAfter(hoy1);

        System.out.println (hoy1);
        System.out.println (hora1);
        System.out.println ("es antes " + antes1);
        System.out.println ("es despues " + despues1);

        System.out.println("3---------------------------------------------------------");

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

        System.out.println("4---------------------------------------------------------");

        /* 4. Formateo sencillo
            Objetivo: formatear a un patrón.
            Enunciado: Formatea la fecha de hoy como dd/MM/yyyy (ej.: 17/10/2025).
            Pista: DateTimeFormatter.ofPattern("dd/MM/yyyy"), format(...).
         */
        LocalDate hoy3 = LocalDate.of(2025,10,17);
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-uuuu");
        String fechaFormato = hoy3.format(f);

        System.out.println (fechaFormato);

        System.out.println("5---------------------------------------------------------");

        /* 5. Parseo sencillo
            Objetivo: pasar de texto a objeto.
            Enunciado: Parsea "2025-12-05" a LocalDate y muestra el día de la semana.
            Pista: LocalDate.parse(...) con ISO por defecto, getDayOfWeek().
         */
        String textoFecha = "2025-12-05";

        LocalDate fecha = LocalDate.parse(textoFecha);
        DayOfWeek diaSemana = fecha.getDayOfWeek();
        String nombreDia = diaSemana.getDisplayName(java.time.format.TextStyle.FULL, Locale.of("es", "ES"));

        System.out.println("La fecha " + textoFecha + " corresponde a: " + nombreDia);

        System.out.println("6---------------------------------------------------------");

        /* 6. Formato “largo” en español
            Objetivo: formatos con texto y locale.
            Enunciado: Dada una fecha, muéstrala como "viernes, 17 de octubre de 2025".
            Pista: DateTimeFormatter.ofPattern("EEEE, d 'de' MMMM 'de' yyyy", new Locale("es","ES")).
         */
        LocalDate fecha1 = LocalDate.of(2025, 10, 17);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern( "EEEE, d 'de' MMMM 'de' yyyy", Locale.of( "es", "ES" ) );
        String fechaFormateada = fecha1.format(formatter);

        System.out.println(fechaFormateada);

        System.out.println("7---------------------------------------------------------");

        /* 7. Parseo con patrón propio
            Objetivo: parsear formatos no ISO.
            Enunciado: Parsea "17-10-2025 09:30" a LocalDateTime.
            Pista: Patrón "dd-MM-yyyy HH:mm" con DateTimeFormatter.
         */
        String fechahora = "17-10-2025 09:30";

        DateTimeFormatter formateo = DateTimeFormatter.ofPattern("dd-MM-uuuu HH:mm");
        LocalDateTime fechaHora1 = LocalDateTime.parse(fechahora, formateo);

        System.out.println("Fecha y hora parseadas: " + fechaHora1);

        System.out.println("8---------------------------------------------------------");

        /* 8. Cálculos con fechas (bisiesto + fin de mes)
            Objetivo: propiedades y aritmética.
            Enunciado: Pide un año y un mes. Crea LocalDate con el día 1 y calcula:
            a) si el año es bisiesto; b) cuántos días tiene el mes; c) la fecha del último día.
            Pista: isLeapYear(), lengthOfMonth(), withDayOfMonth(length).
         */
        System.out.print("Ingrese un año: ");
        int anho = scanner.nextInt();
        System.out.print("Ingrese un mes en numero: ");
        int mes = scanner.nextInt();

        LocalDate fecha2 = LocalDate.of(anho, mes, 1);
        boolean bisiesto = fecha2.isLeapYear();
        int diasDelMes = fecha2.lengthOfMonth();
        LocalDate ultimoDia = fecha2.withDayOfMonth(diasDelMes);

        System.out.println("Aho bisiesto: " + ( bisiesto ? "Si" : "No" ) );
        System.out.println("Días en el mes: " + diasDelMes);
        System.out.println("Último día del mes: " + ultimoDia);

        System.out.println("9---------------------------------------------------------");

        /* 9. Próximo viernes
            Objetivo: usar plusDays y getDayOfWeek.
            Enunciado: Dada una fecha cualquiera, calcula la fecha del próximo viernes (si ya es viernes, pasa al viernes siguiente).
            Pista: suma días hasta que .
         */
        LocalDate fecha3 = LocalDate.of( 2025, 10,17 );
        LocalDate proximo = fecha3.plusDays(1 );
        while( proximo.getDayOfWeek() != DayOfWeek.FRIDAY) { proximo = proximo.plusDays(1 ); }

        System.out.println( "Fecha actual: " +fecha3);
        System.out.println( "Proximo viernes: " + proximo );

        System.out.println("10---------------------------------------------------------");

        /* 10. 24h ↔ 12h con am/pm
            Objetivo: practicar formateo/parseo de horas.
            Enunciado: Parsea "14:35" (HH:mm) a LocalTime y muéstralo en formato de 12 horas con am/pm (ej.: 02:35 PM).
            Pista: patrón "hh:mm a" (y si quieres, new Locale("es","ES")).
         */
        String hora3 = "14:35";
        LocalTime formato24 = LocalTime.parse( hora3, DateTimeFormatter.ofPattern( "HH:mm" ) );
        DateTimeFormatter formato12 = DateTimeFormatter.ofPattern("hh:mm a", Locale.of( "es", "ES" ) );
        String nuevoFormato = formato24.format(formato12);

        System.out.println("Hora en formato 24h: " + formato24);
        System.out.println("Hora en formato 12h: " + nuevoFormato);

        System.out.println("11---------------------------------------------------------");

        /* 11. Combinar cadenas fecha+hora
            Objetivo: parsear por separado y fusionar.
            Enunciado: Parsea "17/10/2025" (dd/MM/yyyy) y "09:30" (HH:mm) por separado y combínalos en un LocalDateTime.
            Pista: LocalDate.parse(...), LocalTime.parse(...), LocalDateTime.of(fecha, hora)
         */
        String fechaTexto = "17/10/2025";
        String horaTexto  = "09:30";

        DateTimeFormatter parseoFecha = DateTimeFormatter.ofPattern("dd/MM/uuuu");
        DateTimeFormatter parseoHora  = DateTimeFormatter.ofPattern("HH:mm");
        LocalDate fechaParseada1 = LocalDate.parse(fechaTexto, parseoFecha);
        LocalTime horaParseada  = LocalTime.parse(horaTexto, parseoHora);
        LocalDateTime fechaHora = LocalDateTime.of(fechaParseada1, horaParseada);

        System.out.println("Fecha: " + fechaParseada1 );
        System.out.println("Hora: " + horaParseada );
        System.out.println("Combinadas: " + fechaHora);

        System.out.println("12---------------------------------------------------------");

        /* 12. Diferencia de horas dentro del día
            Objetivo: comparar LocalTime y calcular minutos (sin Duration, opcional con ella).
            Enunciado: Dadas dos horas "08:15" y "11:40", calcula cuántos minutos hay entre ambas.
            Pista (sin Duration): convierte a minutos desde medianoche: h*60 + m.
            Pista (opcional): Duration.between(t1, t2).toMinutes().
         */
        LocalTime h1 = LocalTime.parse("08:15");
        LocalTime h2 = LocalTime.parse("11:40");
        int minutos1 = h1.getHour() * 60 + h1.getMinute();
        int minutos2 = h2.getHour() * 60 + h2.getMinute();
        int diferencia = minutos2 - minutos1;

        System.out.println("Entre " + h1 + " y " + h2 + " hay " + diferencia + " minutos.");

        System.out.println("14-----------------------------------------");

        /* 14. Validar si una hora cae en un horario comercial.
            Objetivo: rangos con LocalTime.
            Enunciado: Define horario L-V 09:00-14:00 y 16:00-19:00.
            Pide una hora (ej.: "13:45", "15:30", "18:10") y responde si está dentro de algún tramo.
            Pista: isAfter/isBefore (recuerda incluir límites: !time.isBefore(inicio) && !time.isAfter(fin)).
         */
        LocalTime inicioManhana = LocalTime.of(9, 0);
        LocalTime finManhana = LocalTime.of(14, 0);
        LocalTime inicioTarde = LocalTime.of(16, 0);
        LocalTime finTarde = LocalTime.of(19, 0);

        System.out.print("Dime una hora (HH:mm): ");
        scanner.nextLine();
        String horaPedida = scanner.nextLine();

        DateTimeFormatter parseo = DateTimeFormatter.ofPattern("HH:mm");
        LocalTime hora = LocalTime.parse(horaPedida, parseo);
        boolean dentroManhana = !hora.isBefore(inicioManhana) && !hora.isAfter(finManhana);
        boolean dentroTarde   = !hora.isBefore(inicioTarde) && !hora.isAfter(finTarde);

        System.out.println("La hora " + horaPedida + " está dentro del horario comercial.");
        System.out.println("La hora " + horaPedida + " está fuera del horario comercial.");

        System.out.println("15---------------------------------------------------------");

        /* 15. Generar próximas 5 sesiones de una clase semanal
            Objetivo: mezcla de todo + formato amigable.
            Enunciado: Dado: Día de la semana (ej.: MARTES), Hora de inicio "18:30", Fecha base (hoy),
            genera las próximas 5 ocurrencias (LocalDateTime) y muéstralas en formato "EEEE d MMMM yyyy 'a las' HH:mm".
            Pista: avanza LocalDate día a día hasta el próximo DayOfWeek indicado, luego usa plusWeeks(1) para siguientes; formatea con Locale("es","ES").
         */
        DayOfWeek diaClase = DayOfWeek.TUESDAY;
        LocalTime horaInicio = LocalTime.parse("18:30");
        LocalDate fechaBase = LocalDate.now();

        LocalDate primeraFecha = fechaBase.with(TemporalAdjusters.nextOrSame( diaClase ) );
        DateTimeFormatter aEspanhol = DateTimeFormatter.ofPattern( "EEEE d MMMM yyyy 'a las' HH:mm", Locale.of( "es", "ES" ) );

        LocalDateTime sesion1 = primeraFecha.atTime(horaInicio);
        LocalDateTime sesion2 = sesion1.plusWeeks(1);
        LocalDateTime sesion3 = sesion1.plusWeeks(2);
        LocalDateTime sesion4 = sesion1.plusWeeks(3);
        LocalDateTime sesion5 = sesion1.plusWeeks(4);

        System.out.println( sesion1.format( aEspanhol ) );
        System.out.println( sesion2.format( aEspanhol ) );
        System.out.println( sesion3.format( aEspanhol ) );
        System.out.println( sesion4.format( aEspanhol ) );
        System.out.println( sesion5.format( aEspanhol ) );

        System.out.println("16---------------------------------------------------------");

        /* 16. Crear una fecha
            Objetivo: Construir una fecha a partir de los datos de usuario.
            Enunciado: Pide al usuario los datos de su fecha de nacimiento: el día del mes, el mes en número (1 para enero, 2 para febrero...) y el año.
            Luego construye una fecha (LocalDate) y dile en qué día de la semana caerá su cumpleaños en 2030.
         */
        System.out.print("Introduce el día de tu nacimiento: ");
        int diaCumple = scanner.nextInt();
        System.out.print("Introduce el mes de tu nacimiento en numero: ");
        int mesCumple = scanner.nextInt();
        System.out.print("Introduce el año de tu nacimiento: ");
        int anhoCumple = scanner.nextInt();

        LocalDate fechaNacimiento = LocalDate.of( anhoCumple, mesCumple, diaCumple );
        System.out.println( "Tu fecha de nacimiento es: " + fechaNacimiento );

        LocalDate cumple2030 = LocalDate.of( 2030, mesCumple, diaCumple );

        DayOfWeek diaSemana1 = cumple2030.getDayOfWeek();
        String diaSemanaEsp = diaSemana1.getDisplayName(TextStyle.FULL, Locale.of( "es", "ES" ) );

        System.out.println("Tu cumpleaños en 2030 caerá en: " + diaSemanaEsp);

        System.out.println("FIN---------------------------------------------------------");

    }
}

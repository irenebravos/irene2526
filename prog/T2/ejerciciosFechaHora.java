public class ejerciciosFechaHora {
    public static void main(String[] args) {

        /* 1. Fundamentos con LocalDate
          Objetivo: crear y leer componentes.
          Enunciado: Crea un LocalDate con la fecha de hoy y muestra año, mes (numérico y nombre) y día.
          Pista: LocalDate.now(), getYear(), getMonthValue(), getMonth(), getDayOfMonth().
        */

        /* 2. Fundamentos con LocalTime
            Objetivo: crear horas y comparar.
            Enunciado: Crea LocalTime.now() y LocalTime.of(8, 30). Indica si “ahora” es antes o después de las 08:30.
            Pista: isBefore, isAfter.
         */

        /* 3. LocalDateTime básico
Objetivo: combinar fecha y hora.
Enunciado: Combina LocalDate.of(2025,10,17) con LocalTime.of(9,15) en un LocalDateTime. Súmale 2 h y 45 min y muéstralo.
Pista: LocalDateTime.of(...), plusHours, plusMinutes.
         */

        /* 4. Formateo sencillo
Objetivo: formatear a un patrón.
Enunciado: Formatea la fecha de hoy como dd/MM/yyyy (ej.: 17/10/2025).
Pista: DateTimeFormatter.ofPattern("dd/MM/yyyy"), format(...).
         */

        /* 5. Parseo sencillo
Objetivo: pasar de texto a objeto.
Enunciado: Parsea "2025-12-05" a LocalDate y muestra el día de la semana.
Pista: LocalDate.parse(...) con ISO por defecto, getDayOfWeek().
         */

        /* 6. Formato “largo” en español
Objetivo: formatos con texto y locale.
Enunciado: Dada una fecha, muéstrala como "viernes, 17 de octubre de 2025".
Pista: DateTimeFormatter.ofPattern("EEEE, d 'de' MMMM 'de' yyyy", new Locale("es","ES")).
         */

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

        /*
         */

        /*
         */

        /*
         */

        /*
         */

        /*
         */

        /*
         */

    }
}

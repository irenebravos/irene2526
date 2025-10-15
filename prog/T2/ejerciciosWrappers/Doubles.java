
import java.util.Scanner;

public class Doubles {
    public static void main(String[] args) {

        // 9. Declara una variable Double con valor 12.3456 e imprime su valor redondeado usando Math.round().
        Double num; num = 12.3456;
        System.out.printf( Math.round(num) );
        // 10. Convierte la cadena "45.678" a un double con Double.parseDouble() y muestra el doble de ese valor.
        System.out.println( Double.parseDouble("45.678") * 2 );
        // 11. Declara un Double con valor NaN (Double.NaN) y usa Double.isNaN() para comprobar si es un número válido.
        Double nan; nan = NaN;
        System.out.println( Double.isNaN(nan) );
        // 12. Pide dos números reales al usuario y muestra el mayor utilizando el método compareTo() de la clase Double.
        Scanner numero = new scanner (System.in);
        System.out.println("Dme dos números: " + );

    }
}
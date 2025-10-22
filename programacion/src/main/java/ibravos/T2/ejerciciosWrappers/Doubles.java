package ibravos.T2.ejerciciosWrappers;

import java.util.Scanner;

public class Doubles {
    public static void main(String[] args) {

        // 9. Declara una variable Double con valor 12.3456 e imprime su valor redondeado usando Math.round().
        Double num = 12.3456;
        System.out.println( Math.round(num) );

        // 10. Convierte la cadena "45.678" a un double con Double.parseDouble() y muestra el doble de ese valor.
        Double numero = Double.parseDouble("45.678");
        System.out.println( numero * 2 );

        // 11. Declara un Double con valor NaN (Double.NaN) y usa Double.isNaN() para comprobar si es un número válido.


        // 12. Pide dos números reales al usuario y muestra el mayor utilizando el método compareTo() de la clase Double.
        Scanner number = new Scanner (System.in);
        System.out.println("Dame dos números: ");
        Double num1 = Double.parseDouble( number.nextLine() );
        Double num2 = Double.parseDouble( number.nextLine() );
        int resultado = num1.compareTo( num2 );
        System.out.println( resultado );

    }
}
package ibravos.UT2.ejerciciosWrappers;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {

        // 17. Declara una variable String llamada texto con el valor "Java" e imprime su longitud usando length().
        String texto = "Java";
        System.out.println( texto.length() );

        // 18. Pide una cadena al usuario y muestra el primer carácter con charAt(0).
        Scanner scanner = new Scanner (System.in);
        System.out.println( "Escribe algo: " );
        String resultado = scanner.nextLine();
        System.out.println( resultado.charAt(0) );

        // 19. Declara un String con el valor "Programación" y muestra una subcadena con las tres primeras letras usando substring().
        String prog = "Programación";
        System.out.println( texto.substring(2) );


    }
}
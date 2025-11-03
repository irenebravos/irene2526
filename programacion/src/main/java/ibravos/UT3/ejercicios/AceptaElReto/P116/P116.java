    package ibravos.UT3.ejercicios.AceptaElReto.P116;

import java.util.Scanner;

public class P116 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner( System.in );

        Integer numero = Integer.valueOf( teclado.nextInt() );

        for ( int i = 0; i < numero; i++ ){
            System.out.println( "Hola mundo." );
        }


        teclado.close();
    }
}

package ibravos.UT3.ejercicios.AceptaElReto.P191;

import java.util.Scanner;

public class P191 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner( System.in );

        Integer casosPrueba = Integer.valueOf( teclado.nextLine() );

        Integer tanques, capacidad, diferencia, capacidadTotal;

        for ( int i = 0; i < casosPrueba; i++ ){
            String linea = teclado.nextLine();
            String[] trozos = linea.split( " " );
            tanques = Integer.valueOf( trozos [ 0 ] );
            capacidad = Integer.valueOf( trozos [ 1 ] ) ;
            diferencia = Integer.valueOf( trozos [ 2 ] ) ;

            while ( tanques < 0 ){

            }

            System.out.println( "\nDatos caso " + ( i + 1 ) );
            System.out.println( "tanques = " + tanques );
            System.out.println( "capacidad = " + capacidad );
            System.out.println( "diferencia = " + diferencia );
        }

        teclado.close();
    }
}

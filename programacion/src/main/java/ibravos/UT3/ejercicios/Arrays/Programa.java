package ibravos.UT3.ejercicios.Arrays;

import com.sun.org.apache.xalan.internal.xsltc.DOM;
import ibravos.UT2.ejercicios.MathRandom;

public class Programa {
    public static void main(String[] args) {

        /*declarar un array*/
        Integer[] numeros;
        /*dimension del array*/
        numeros = new Integer[100];

        /*asignar valor a una posicion del array*/
        System.out.println( "----------POSICION-----------" );
        numeros[42] = 17;
        /*leer el valor de una posicion del array*/
        System.out.println( "La posicion 42 tiene de valor: " + numeros[42] + "." );

        //recorrer un array, da un numero entre 0 y 10 y lo mete en la posicion 0
        /*System.out.println( "----------" );
        numeros[0] = (int) ( Math.random() *11 );
        numeros[1] = (int) ( Math.random() *11 );
        numeros[2] = (int) ( Math.random() *11 );
        numeros[3] = (int) ( Math.random() *11 );*/
        //otra opcion
        System.out.println( "-----POSICIONES CON VALOR-----" );
        for ( int i = 0; i < numeros.length; i++ ){
            numeros[i] = (int) ( Math.random() *11 );
            System.out.println( "Numero en posicion " + ( i + 1 ) + ": " + numeros[i] + "." );
        }

        //sumador
        System.out.println( "----------SUMADOR----------" );
        Integer suma = 0;
        for ( int i = 0; i < numeros.length; i++ ){
            suma += numeros[i];
        }
        System.out.println( "La suma es: " + suma + "." );

        //contador
        System.out.println( "----------CONTADOR----------" );
        Integer contador = 0;
        for ( int i = 0; i < numeros.length; i++ ){
            contador++;
        }
        System.out.println( "Hay " + contador + " numeros." );

        //filtro
        System.out.println( "----------FILTRO----------" );
        Integer multiplosDe3 = 0;
        for ( int i = 0; i < numeros.length; i++ ){
            if ( numeros[i] % 3 == 0 ) {
                multiplosDe3++;
            }
        }
        System.out.println( "Hay " + multiplosDe3 + " multiplos de 3." );

        //buscador con bandera
        System.out.println( "----------BUSCADOR----------" );
        Boolean hay7 = false;
        int j = 0;
        do {
            if ( numeros[j] == 7 ) {
                hay7 = true;
            }
            j++;
        }
        while ( j < numeros.length && hay7 == false );
            System.out.println("¿Hay algun 7?: " + hay7 + ".");

        //maximo y minimo
        System.out.println( "----------MAXIMO----------" );
        Integer posicionMAX, posicionMIN;
        Float[] array1 = new Float[1000];
        for ( int i = 0; i < numeros.length; i++ ){
            array1[i] = ( float )( Math.random() * 100f ) -1000;
        }
        Float maximo = 0f;
        for ( int i = 0; i < array1.length; i++ ){
            if ( array1[i] > maximo ){
                maximo = array1[i];
                posicionMAX = i;
            }
        }
        System.out.println( "El maximo es: " + maximo + "." );

        System.out.println( "----------MINIMO----------" );
        Float[] array2 = new Float[1000];
        for ( int i = 0; i < numeros.length; i++ ){
            array2[i] = ( float )( Math.random() * 100f ) -1000;
        }
        Float minimo = 0f;
        for ( int i = 0; i < array2.length; i++ ){
            if ( array2[i] < minimo ){
                minimo = array2[i];
                posicionMIN = i;
            }
        }
        System.out.println( "El minimo es: " + minimo + "." );

        //calcula la media de diez notas
        System.out.println( "----------MEDIA DE NOTAS----------" );
        Integer[] notas = { 1,2,3,4,5,6,7,8,9,0 };
        Integer sumaNotas = 0;
        for ( int i = 0; i < notas.length; i++ ){
            sumaNotas += notas[i];
        }
        System.out.println( "La media es: " + (sumaNotas / notas.length) + "." );


    }
}


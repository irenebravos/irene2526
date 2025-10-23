package ibravos.UT2.ejercicios;

import java.util.Scanner;
import java.util.Random;

public class ejerciciosMathRandom {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        //MATH
        //1. Declara Integer a = 7 y Integer b = -3. Muestra: valor absoluto de b, el mayor y el menor. (Usa abs, max, min)
        Integer a = 7;
        Integer b = 3;
        System.out.println( "Valor absoluto: " + Math.abs( b ) );
        System.out.println( "Maximo: " + Math.max( a, b ) );
        System.out.println( "Minimo: " + Math.min( a, b ) );

        //2. Pide un entero y muestra su cuadrado con Math.pow() y su raíz cuadrada con Math.sqrt(). ¿Qué ocurre si es negativo?
        System.out.print("Introduce un número entero: ");
        int num = scanner.nextInt();
        System.out.println( "El cuadrado de " + num + " es: " + Math.pow( num, 2 ) );
        System.out.println( "La raiz cuadrada de " + num + " es: " + Math.sqrt( num ) );

        //3. Con Double x = 7.56; imprime Math.round(x), Math.floor(x) y Math.ceil(x), explicando la diferencia.
        Double x = 7.56;
        System.out.println( "Numero original: " + x);
        System.out.println( "Redondea al entero mas cercano de x : " + Math.round(x));
        System.out.println( "Redondea al entero menor o igual: " + Math.floor(x));
        System.out.println( "Redondea al entero mayor o igual: " + Math.ceil(x));

        //4. Pide el radio y calcula: área = Math.PI * Math.pow(radio, 2).
        System.out.println( "Introduce el radio de un circulo: " );
        Double radio = scanner.nextDouble();
        System.out.println("El area del circulo es: " + ( Math.PI * Math.pow( radio, 2 ) ) );

        //5. Pide los catetos de un triángulo rectángulo y calcula la hipotenusa con Math.sqrt(Math.pow(a,2)+Math.pow(b,2)).
        System.out.print("Introduce el cateto a: ");
        Double ah = scanner.nextDouble();
        System.out.print("Introduce el cateto b: ");
        Double be = scanner.nextDouble();
        System.out.println("La hipotenusa del triángulo es: " + ( Math.sqrt(Math.pow( a, 2 ) + Math.pow( b, 2 ) ) ) );

        //RANDOM
        //6. Genera un double en [0,1), multiplícalo por 10 y conviértelo a int para obtener un valor entre 0 y 9.
        double numAleatorio = Math.random();
        System.out.println( "Numero aleatorio: " + numAleatorio );
        double por10 = numAleatorio * 10;
        System.out.println( "Numero aleatorio por 10: " + por10 );
        int aEntero = (int) por10;
        System.out.println( "Numero aleatorio * 10 a entero: " + aEntero );

        //7. Crea Random r = new Random() y genera: un int en [0,9], un double en [0,1) y un boolean.
        int numEntero = random.nextInt( 10 );
        System.out.println( "Entero aleatorio entre 0 y 9: " + numEntero );
        double numDouble = random.nextDouble( 1 );
        System.out.println( "Double aleatorio entre 0 y 1: " + numDouble);
        boolean numBoolean = random.nextBoolean( );
        System.out.println( "Boolean aleatorio: " + numBoolean);

        //8. Simula un lanzamiento de dado (1–6) con nextInt(6)+1 y muéstralo.
        int dado = ( random.nextInt( 6 ) + 1 );
        System.out.println( "Lanzamiento: " + dado );

        //9. Pide min y max y genera un entero en [min, max]. (Fórmula: r.nextInt(max - min + 1) + min)
        System.out.println( "Introduce el numero minimo: " );
        int minimo = scanner.nextInt();
        System.out.println( "Introduce el numero maximo: " );
        int maximo = scanner.nextInt();
        int numRandom = ( random.nextInt( maximo - minimo + 1 ) + minimo );
        System.out.println( "Numero aleatorio entre " + minimo + " y " + maximo + ": " + numRandom );

    }
}

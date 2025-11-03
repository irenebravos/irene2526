package ibravos.UT2.ejercicios;

import java.util.Scanner;

public class Dojo {
    public static void main(String[] args) {

        System.out.println("----------DOJO 1----------");
        Integer a1, b1, c1;// Declaramos dos variables de tipo entero con los nombres a y b.
        a1 = (int) (Math.random() * 10 + 1);// Le asignamos a a un número al azar entre 1 y 10.
        b1 = (int) (Math.random() * 10 + 1);// Le asignamos a b un número al azar entre 1 y 10.

        System.out.println("El valor de a es " + a1 + " y el valor de b es " + b1 + ".");

        // EL RETO: Programa entre estas dos líneas para intercambiar los valores de a y b.
        // REGLA: No puedes cambiar mi código, pero puedes programar lo que quieras entre las
        // líneas 15 y 20, incluso añadir más líneas entre ambas.
        //------------------------------------------------------------------------------

        c1 = a1;
        a1 = b1;
        b1 = c1;

        //------------------------------------------------------------------------------
        System.out.println("Ahora las variables han intercambiado su valor:");
        System.out.println("El valor de a es " + a1 + " y el valor de b es " + b1 + ".");

        System.out.println("----------DOJO 2----------");
        //Encontrar el máximo de tres números
        Integer a2, b2, c2;//Declaramos tres variables de tipo entero con los nombres a, b y c.
        Integer max = null;//Declaramos una varibale de tipo entero de nombre max.
        //La inicializamos con el valor nulo (no ha sido definido).
        a2 = (int) (Math.random() * 10 + 1);//Le asignamos a a un número al azar entre 1 y 10.
        b2 = (int) (Math.random() * 10 + 1);//Le asignamos a b un número al azar entre 1 y 10.
        c2 = (int) (Math.random() * 10 + 1);//Le asignamos a c un número al azar entre 1 y 10.

        System.out.println("Valores: a = " + a2 + ", b = " + b2 + ", c = " + c2 + ".");

        // EL RETO: Programa entre estas dos líneas para mostrar por pantalla el máximo de los tres valores.
        // REGLA: No utilices estructuras de decisión (if-else, operador terciario...) se puede hacer sin ellas.
        //--------------------------------------------------------------------------------------

        max = Math.max( a2, Math.max( b2, c2 ) );

        //--------------------------------------------------------------------------------------
        System.out.println("El máximo valor de a, b y c es " + max);

    }
}

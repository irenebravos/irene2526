package ibravos.UT3.ejercicios.Decisiones;

import java.util.Scanner;

public class Decisiones {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        /*Ejercicio 1 --> Comparar dos números e imprimir cuál es mayor.
        Pide al usuario dos números y determina cuál es mayor.
        Si ambos son iguales, se muestra un mensaje indicando que no hay diferencia.
        */
        System.out.print("Introduce el primer número: ");
        int numero1 = teclado.nextInt();
        System.out.print("Introduce el segundo número: ");
        int numero2 = teclado.nextInt();

        if (numero1 > numero2) {
            System.out.println("El primer número es mayor que el segundo.");
        } else if (numero2 > numero1) {
            System.out.println("El segundo número es mayor que el primero.");
        } else {
            System.out.println("Ambos números son iguales.");
        }


        /*Ejercicio 2 --> Verificar si un número es par o impar.
        Solicita un número y utiliza la operación módulo (%) para determinar si el número es divisible entre 2.
        */
        System.out.print("Introduce un número: ");
        int numero3 = teclado.nextInt();

        if (numero3 % 2 == 0) {
            System.out.println("Es PAR.");
        } else {
            System.out.println("Es IMPAR.");
        }


        /*Ejercicio 3 --> Determinar si un número es positivo, negativo o cero.
        Lee un número del usuario y comprueba su signo para mostrar el mensaje adecuado.
        */
        System.out.print("Introduce un número: ");
        Double numero4 = teclado.nextDouble();

        if (numero4 > 0) {
            System.out.println("Es POSITIVO.");
        } else if (numero4 < 0) {
            System.out.println("Es NEGATIVO.");
        } else {
            System.out.println("Es CERO.");
        }

        /*Ejercicio 4 --> Calcular un descuento en base al monto de compra.
        Imagina que tienes una promoción donde si el monto es mayor a 100, se aplica un 10% de descuento; en caso contrario, no hay descuento.
        */
        System.out.print("Introduce el monto de la compra: ");
        double monto = teclado.nextDouble();
        double descuento = 0;
        double totalPagar;

        if (monto > 100) {
            descuento = monto * 0.10;
            totalPagar = monto - descuento;
            System.out.println("Se aplico un 10% de descuento.");
        } else {
            totalPagar = monto;
            System.out.println("No se aplica descuento.");
        }

        System.out.println("Descuento: " + descuento + " euros." );
        System.out.println("Total a pagar: " + totalPagar + " euros." );

        teclado.close();

        /*Ejercicio 5 --> Calcular el promedio de tres notas y mostrar el resultado (aprobado o reprobado).
        Se leen tres notas y se calcula el promedio. Si el promedio es mayor o igual a 5 (en una escala de 0 a 10), se considera aprobado.
        */

        /*Ejercicio 6 --> Convertir nota numérica a calificación con switch.
        Pide en un número entero entre 1 y 5, se asigna una calificación textual (Ejemplo: 1 = Muy Deficiente, 5 = Excelente).
        */

        /*Ejercicio 7 --> Menú de opciones simples con switch.
        Despliega un menú para realizar una operación matemática específica según la opción elegida por el usuario: sumar, restar, multiplicar o dividir dos números.
        */

        /*Ejercicio 8 --> Determinar si un año es bisiesto con if-else.
        Pide al usuario un año y calcula si es bisiesto. Se considera un año bisiesto si es divisible entre 4, pero no entre 100, o si es divisible entre 400.
        Comprueba tu resultado comparándolo con el método isLeapYear.
        */

        /*Ejercicio 9 --> Categorizar una edad con if-else-if.
        Dada una edad, mostrar si la persona es niño (0-12), adolescente (13-17), adulto (18-64) o adulto mayor (65+).
        */

        /*Ejercicio 10 --> Calcular un bono según años de servicio.
        Si un empleado tiene 5 años o más en la empresa, recibe un bono del 20% de su salario. En caso contrario, el bono es del 10%.
        */


    }
}

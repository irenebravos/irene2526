
import java.util.Scanner;

public class Integers
{
    public static void main(String[] args) {

        // 1. Declara una variable Integer llamada num con valor 25 e imprime su valor por consola usando System.out.println().
        Integer num; num = 25;
        System.out.println(num);
        // 2. Crea un objeto Integer a partir de una cadena "123". Convierte su valor a tipo int usando el método adecuado e imprímelo.
        //String "123"; System.out.println(parseInt("123"));
        // 3. Utiliza Integer.MAX_VALUE e Integer.MIN_VALUE para mostrar el rango de valores posibles de tipo int.
        System.out.println("El máximo de Integer es: " + Integer.MAX_VALUE);
        System.out.println("El mínimo de Integer es: " + Integer.MIN_VALUE);
        // 4. Pide al usuario un número (como cadena) y convierte esa entrada en un entero usando Integer.parseInt(). Luego muestra el número multiplicado por 2.
        Scanner numero = new Scanner(System.in);
        //System.out.println("Número: " + parseInt(numero));

    }
}
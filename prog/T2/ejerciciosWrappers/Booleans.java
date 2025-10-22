
import java.util.Scanner;

public class Booleans {
    public static void main(String[] args) {

        // 13. Crea un objeto Boolean con el valor true y muestra su valor primitivo con booleanValue().
        Boolean verdadero = true;
        System.out.println( verdadero.booleanValue() );
        
        // 14. Convierte las cadenas "true" y "false" en objetos Boolean usando Boolean.valueOf(). Imprime ambos valores.
        Boolean verdad = Boolean.valueOf( "true" );
        Boolean falso = Boolean.valueOf( "false" );
        System.out.println( verdad );
        System.out.println( falso );

        // 15. Escribe un programa que lea del usuario una cadena y determine si equivale a "true" o "false". Usa Boolean.parseBoolean() y muestra un mensaje explicativo.
        Scanner scanner = new Scanner (System.in);
        System.out.println("Escribe true o false: ");
        Boolean bulean = Boolean.parseBoolean( scanner.nextLine() );
        System.out.println( bulean );

        // 16. Declara dos objetos Boolean y compara si son iguales usando equals(). Muestra el resultado con un mensaje claro.
        Boolean obj1 = true;
        Boolean obj2 = false;
        System.out.println( "El resultado es: " + obj1.equals(obj2) );


    }
}
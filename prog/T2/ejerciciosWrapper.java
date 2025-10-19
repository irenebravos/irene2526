
import java.util.Scanner;

public class Wrappers {
    public static void main(String[] args) {
		
		//INTEGER
        // 1. Declara una variable Integer llamada num con valor 25 e imprime su valor por consola usando System.out.println().
        Integer num = 25;
        System.out.println(num);

        // 2. Crea un objeto Integer a partir de una cadena "123". Convierte su valor a tipo int usando el método adecuado e imprímelo.
        Integer num = Integer.valueOf("123");
        int valor = num.intValue();
        System.out.println(valor);

        // 3. Utiliza Integer.MAX_VALUE e Integer.MIN_VALUE para mostrar el rango de valores posibles de tipo int.
        System.out.println("El máximo de Integer es: " + Integer.MAX_VALUE);
        System.out.println("El mínimo de Integer es: " + Integer.MIN_VALUE);

        // 4. Pide al usuario un número (como cadena) y convierte esa entrada en un entero usando Integer.parseInt(). Luego muestra el número multiplicado por 2.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número: ");
        String entrada = scanner.nextLine();
        int numero = Integer.parseInt(entrada);
        int resultado = numero * 2;
        System.out.println("El número multiplicado por 2 es: " + resultado);
		
		//FLOAT
		// 5. Declara un objeto Float con el valor 3.14f e imprime su valor con System.out.printf() mostrando dos decimales.
        Float num = 3.14f;
        System.out.printf("%.2f%n", num);

        // 6. Usa Float.parseFloat() para convertir la cadena "9.75" a número y muestra el resultado sumándole 1.
        Float numero = Float.parseFloat("9.75");
        Float resultado = numero + 1;
        System.out.println(resultado);

        // 7. Muestra el valor máximo y mínimo representable por la clase Float usando Float.MAX_VALUE y Float.MIN_VALUE.
        System.out.println("El máximo de Float es: " + Float.MAX_VALUE);
        System.out.println("El mínimo de Float es: " + Float.MIN_VALUE);

        // 8. Crea dos objetos Float y compara cuál es mayor usando compareTo(). Muestra un mensaje indicando cuál es más grande.
        Float obj1 = 6f;
        Float obj2 = 6f;
        int resultado = obj1.compateTo(obj2)
        System.out.println( resultado );
		
		//DOUBLE
		// 9. Declara una variable Double con valor 12.3456 e imprime su valor redondeado usando Math.round().
        Double num = 12.3456;
        System.out.println( Math.round(num) );

        // 10. Convierte la cadena "45.678" a un double con Double.parseDouble() y muestra el doble de ese valor.
        Double numero = Double.parseDouble("45.678");
        System.out.println( numero * 2 );

        // 11. Declara un Double con valor NaN (Double.NaN) y usa Double.isNaN() para comprobar si es un número válido.


        // 12. Pide dos números reales al usuario y muestra el mayor utilizando el método compareTo() de la clase Double.
        Scanner numero = new Scanner (System.in);
        System.out.println("Dame dos números: ");
        Double num1 = Double.parseDouble( scanner.nextLine() );
        Double num2 = Double.parseDouble( scanner.nextLine() );
        int resultado = num1.compareTo( num2 );
        System.out.println( resultado );
		
		//BOOLEAN		
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
		
		//STRING
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
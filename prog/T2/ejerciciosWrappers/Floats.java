

public class Floats {
    public static void main(String[] args) {

        // 5. Declara un objeto Float con el valor 3.14f e imprime su valor con System.out.printf() mostrando dos decimales.
        Float num; num = 3.14f;
        System.out.printf(num);
        // 6. Usa Float.parseFloat() para convertir la cadena "9.75" a número y muestra el resultado sumándole 1.
        System.out.println( Float.parseFloat("9.75") + 1 );
        // 7. Muestra el valor máximo y mínimo representable por la clase Float usando Float.MAX_VALUE y Float.MIN_VALUE.
        System.out.println("El máximo de Float es: " + Float.MAX_VALUE);
        System.out.println("El mínimo de Float es: " + Float.MIN_VALUE);
        // 8. Crea dos objetos Float y compara cuál es mayor usando compareTo(). Muestra un mensaje indicando cuál es más grande.
        Float objeto; objeto = 6f;
        Float object; object = 6f;
        System.out.println( objeto.compateTo(object) );

    }
}
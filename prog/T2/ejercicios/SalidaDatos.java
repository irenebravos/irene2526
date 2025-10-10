public class SalidaDatos {
    public static void main ( String [] args ){
        
        //Ejercicio 1
        System.out.print("Hola"); System.out.println(" mundo");
        System.out.print("\n--------------------------\n");
        //Ejercicio 2//Ejercicio 3
        String nombre = "Ana";
        Integer edad = 20;
        
        System.out.println( "Nombre: " + nombre + ", " + "Edad: " + edad + ".");
        System.out.print("\n--------------------------\n");
        //Ejercicio 3
        String producto = "Ratón";
        Integer unidades = 3;
        
        System.out.println( "Producto: " + producto );
        System.out.println( "Unidades: " + unidades );
        System.out.println( "" );
        System.out.print("\n--------------------------\n");
        //Ejercicio 4
        System.out.print("Ticket\n" + "\tLinea 1\n" + "\tLinea 2");
        System.out.print("\n--------------------------\n");
        
        //Ejercicio 5
        Integer a = 7;
        Integer b = 3;
        
        Integer cuenta1 = (a + b);
        Integer cuenta2 = (a - b);
        Integer cuenta3 = (a * b);
        Integer cuenta4 = (a / b);
        Integer cuenta5 = (a % b);
        
        System.out.print( "a + b = " + cuenta1 + "\n" );
        System.out.print( "a - b = " + cuenta2 + "\n" );
        System.out.print( "a * b = " + cuenta3 + "\n" );
        System.out.print( "a / b = " + cuenta4 + "\n" );
        System.out.print( "a % b = " + cuenta5 );
        System.out.print("\n--------------------------\n");
        
        //Ejercicio 6
        System.out.println( "\n es un salto de línea." + 
        "\t escribe un tabulador." + 
        "\\ escribe la barra de escape." + 
        "\" escribe unas comillas." );
        
    }
}
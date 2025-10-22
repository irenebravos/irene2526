package ibravos.T2.ejerciciosEyS;

import java.io.IOException;

public class Programa{
    public static void
        main(String[] args) throws IOException {
            System.out.println( "Indique una tecla de su teclado y después enter: " );
            Character tecla;
            tecla = (char) System.in.read();
            
            System.out.println("La tecla pulsada es: " + tecla);
    }
}
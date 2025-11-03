package ibravos.UT3.ejercicios.Decisiones;

public class Decisiones1 {
    public static void main(String[] args) {

        //1. Leer dos números y deducir si están en orden creciente.
        System.out.println( "-----Ejercicio 1-----" );

        Integer a1, b1;

        //ejemplos
        //a1 = 5; b1 = 5; //true
        //a1 = -4; b1 = -5; //false
        a1 = 7; b1 = 5; //false
        //a1 = null; b1 = 5; //error

        if ( a1 <= b1 ){
            System.out.println( "true" );
        }else{
            System.out.println( "false" );
        }


        /*2. Determinar el precio del billete de ida y vuelta en avión,
            conociendo la distancia a recorrer y sabiendo que si el
            número de días de estancia es superior a 7 y la distancia superior a 800 km
            el billete tiene una reducción del 30 por 100. El precio por km es de 2.5 euros.*/
        System.out.println( "-----Ejercicio 2-----" );

        Integer estancia, estanciaLimite = 7;
        Double distancia, distanciaLimite = 800.0;
        Double precioKm = 2.5, precioTotal, precioBillete;

        //ejemplos
        //estancia = 3; distancia = 500.0; //1250.0
        //estancia = 8; distancia = 1000.0; //1750
        estancia = 10; distancia = 2000.0; //3500

        precioTotal = distancia * precioKm;

        if ( ( distancia > distanciaLimite ) && ( estancia > estanciaLimite ) ){
            precioTotal = ( precioTotal ) - ( ( 30.0/100.0 ) * ( precioTotal ) );
        }
        System.out.println( precioTotal );


        //3.
        System.out.println( "-----Ejercicio 3-----" );



    }
}

/*
	Escribe un programa en Java para calcular el coste de tu factura del móvil.
	Para ello, tendremos como datos de entrada:
	El número de GB (Gigabytes) que has utilizado.
	Los minutos que has hablado por teléfono.
	El precio en euros por cada GB utilizado.
	El precio en euros por cada minuto que has gastado.
	La cuota mensual en euros.
	Calcula los siguientes datos de salida:
	El precio final de la factura del móvil (sin IVA ni nada).
	Si el precio final ha sido más de 50 euros.
*/

package ibravos.T1.examen;

public class EjercicioEvaluable2 {

    public static void main(String[] args){

        Float gBUsados = 16.54f;
        Integer minutosHablados = 5;
        Float precioGB = 28.6f;
        Float precioMinuto = 10.5f;
        Float cuotaMensual = 100.0f;
       final Float PRECIOLIMITE = 50.0f;

       Float precioFinalFactura;
       Boolean superaMaximo;

       precioFinalFactura = (gBUsados * precioGB) + (minutosHablados  * precioMinuto) + cuotaMensual;
       superaMaximo = precioFinalFactura > PRECIOLIMITE;

    }

}
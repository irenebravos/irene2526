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


public class Main {
  public static void main(String[] args) {
  
	Float GB; GB = 12.0f;
	Integer minutos; minutos = 30;
	Float precioGB; precioGB = 0.80f;
	Float precioMinutos; precioMinutos = 0.10f;
	Double cuota; cuota = 57.8;
  
	Double precioFinal; 
	precioFinal = ( GB * precioGB ) + ( minutos * precioMinutos );
  
	Double precioDeCuota;
	precioDeCuota = precioFinal >= cuota;
  
	Double masCaro;
	masCaro = (precioDeCuota >= cuota) == true;
  
  
  
    System.out.println("El precio final de la factura es " + precioFinal + " ¿y es mas caro?" + masCaro);
  }
}

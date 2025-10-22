package ibravos.T1.ejercicios;

public class circulo {
	public static void main(String [] args){
		/*area del circulo (pi por r al cuadrado)
		y su cicunferencia (2 por pi por r) */
		
		//String circulo;
		Double radio;
		Double area;
		Double longitud;
		
		radio = 4.89d;
		final double numPi = 3.14d;
		final double multiplo = 2;
		
		area = numPi * (radio * radio);
		longitud = multiplo * numPi * radio;
		//longitud = area * multiplo;
			
		
	}
}